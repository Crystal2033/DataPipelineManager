package ru.mai.lessons.rpks.metric;


import lombok.AllArgsConstructor;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;
import ru.mai.lessons.rpks.database.repository.DeduplicationRepository;


@Component
@AllArgsConstructor
public class DeduplicationMetric implements InfoContributor {

    private final DeduplicationRepository repository;

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("countDeduplications", repository.count());
    }
}
