package ru.mai.lessons.rpks.metric;

import lombok.AllArgsConstructor;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;
import ru.mai.lessons.rpks.database.repository.EnrichmentRepository;

@AllArgsConstructor
@Component
public class EnrichmentMetric implements InfoContributor {

    private final EnrichmentRepository repository;

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("countEnrichments", repository.count());
    }
}
