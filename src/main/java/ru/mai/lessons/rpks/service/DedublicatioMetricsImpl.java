package ru.mai.lessons.rpks.service;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;
import ru.mai.lessons.rpks.repository.DeduplicationRepository;

@Component
@RequiredArgsConstructor
public class DedublicatioMetricsImpl implements InfoContributor {

    private final DeduplicationRepository deduplicationRepository;

    @Override
    public void contribute(Info.Builder builder) {
        var countDeduplication = deduplicationRepository.count();
        builder.withDetail("countDeduplications", countDeduplication);
    }


}



/*

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import jakarta.annotation.PostConstruct;
import jdk.jfr.Registered;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

@Component

public class Metrics {

    private final MeterRegistry meterRegistry;
    private Counter deduplicationCounter;
    private Counter enrichmentCounter;
    private Counter filterCounter;


    @PostConstruct
    @ResponseStatus(value = HttpStatus.OK)
    void init() {
        this.filterCounter = meterRegistry.counter("countFilters");
        this.deduplicationCounter = meterRegistry.counter("countDeduplications");
        this.enrichmentCounter = meterRegistry.counter("countEnrichments");


    }


    @ResponseStatus(value = HttpStatus.OK)
    public void incrementEnrichment() {
        enrichmentCounter.increment();
    }

    @ResponseStatus(value = HttpStatus.OK)
    public void incrementDeduplication() {
        deduplicationCounter.increment();
    }

    @ResponseStatus(value = HttpStatus.OK)
    public void incrementFilter() {
        filterCounter.increment();
    }
}
*/