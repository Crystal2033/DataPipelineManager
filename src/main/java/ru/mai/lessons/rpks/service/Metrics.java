package ru.mai.lessons.rpks.service;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Metrics {

    private final MeterRegistry meterRegistry;
    private Counter deduplicationCounter;

    public Metrics(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
    }

    @PostConstruct
    void init() {
        this.deduplicationCounter = meterRegistry.counter("countDeduplications");
    }

    public void incrementDeduplication() {
        deduplicationCounter.increment();
    }
}
