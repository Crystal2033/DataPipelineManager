package ru.mai.lessons.rpks.metrics;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;
import ru.mai.lessons.rpks.repository.EnrichmentRepository;

@Component
@RequiredArgsConstructor
public class EnrichmentMetricImpl implements InfoContributor {
    private final EnrichmentRepository enrichmentRepository;

    @Override
    public void contribute(Info.Builder builder) {
        var countEnrichment = enrichmentRepository.count();
        builder.withDetail("countEnrichments", countEnrichment);
    }
}
