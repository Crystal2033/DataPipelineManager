package ru.mai.lessons.rpks.metrics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;
import ru.mai.lessons.rpks.repository.DeduplicationRepository;

@Component
public class DeduplicationMetrics implements InfoContributor {
    private final DeduplicationRepository repository;

    public DeduplicationMetrics(@Autowired DeduplicationRepository repository) {
        this.repository = repository;
    }

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("countDeduplications", repository.count());
    }
}
