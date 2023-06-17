package ru.mai.lessons.rpks.metrics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;
import ru.mai.lessons.rpks.repository.FilterRepository;

@Component
public class FilterMetrics implements InfoContributor {
    private final FilterRepository repository;

    public FilterMetrics(@Autowired FilterRepository repository) {
        this.repository = repository;
    }

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("countFilters", repository.count());
    }
}
