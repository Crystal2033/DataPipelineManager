package ru.mai.lessons.rpks.metrics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;
import ru.mai.lessons.rpks.repository.EnrichmentRepository;

@Component
public class EnrichmentMetrics implements InfoContributor {
    private final EnrichmentRepository repository;

    public EnrichmentMetrics(@Autowired EnrichmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("countEnrichments", repository.count());
    }
}
