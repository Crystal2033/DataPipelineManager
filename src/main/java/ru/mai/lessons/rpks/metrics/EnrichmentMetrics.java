package ru.mai.lessons.rpks.metrics;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;
import ru.mai.lessons.rpks.database.repository.EnrichmentRepository;

@RequiredArgsConstructor
@Component
public class EnrichmentMetrics implements InfoContributor {

    private final EnrichmentRepository enrichmentRepository;

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("countEnrichments", enrichmentRepository.count());
    }
}
