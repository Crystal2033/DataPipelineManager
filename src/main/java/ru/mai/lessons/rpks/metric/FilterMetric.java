package ru.mai.lessons.rpks.metric;

import lombok.AllArgsConstructor;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;
import ru.mai.lessons.rpks.database.repository.FilterRepository;


@AllArgsConstructor
@Component
public class FilterMetric implements InfoContributor {
    private final FilterRepository repository;

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("countFilters", repository.count());
    }
}
