package ru.mai.lessons.rpks.metrics;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;
import ru.mai.lessons.rpks.repository.DeduplicationRepository;

@Component
@RequiredArgsConstructor
public class DeduplicationMetricImpl implements InfoContributor {

    private final DeduplicationRepository deduplicationRepository;

    @Override
    public void contribute(Info.Builder builder) {
        var countDeduplication = deduplicationRepository.count();
        builder.withDetail("countDeduplications", countDeduplication);
    }


}