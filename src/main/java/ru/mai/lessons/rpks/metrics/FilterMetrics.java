package ru.mai.lessons.rpks.metrics;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;
import ru.mai.lessons.rpks.repository.FilterRepository;
import org.springframework.boot.actuate.info.Info;

@Component
@RequiredArgsConstructor
public class FilterMetrics implements InfoContributor {
    private final FilterRepository filterRepository;

    @Override
    public void contribute(Info.Builder builder) {
        var countFilters = filterRepository.count();
        builder.withDetail("countFilters", countFilters);
    }
}
