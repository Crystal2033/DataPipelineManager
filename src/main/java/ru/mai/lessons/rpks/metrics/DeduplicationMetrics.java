package ru.mai.lessons.rpks.metrics;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;
import ru.mai.lessons.rpks.database.repository.DeduplicationRepository;

@RequiredArgsConstructor
@Component
public class DeduplicationMetrics implements InfoContributor {

    private final DeduplicationRepository deduplicationRepository;
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("countDeduplications", deduplicationRepository.count());
    }
}
