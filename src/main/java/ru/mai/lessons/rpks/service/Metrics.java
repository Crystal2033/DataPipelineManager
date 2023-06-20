package ru.mai.lessons.rpks.service;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Metrics {

    private final MeterRegistry meterRegistry;
    private Counter deduplicationCounter;
    private Counter enrichmentCounter;
    private Counter filterCounter;

    public Metrics(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
    }

    @PostConstruct
    void init() {
        this.deduplicationCounter = meterRegistry.counter("countDeduplication");
        this.enrichmentCounter = meterRegistry.counter("countEnrichment");
        this.filterCounter = meterRegistry.counter("countFilter");

    }

    public void incrementEnrichment() {
        enrichmentCounter.increment();
    }
    public void incrementDeduplication() {
        deduplicationCounter.increment();
    }
    public void incrementFilter() {
        filterCounter.increment();
    }
}
