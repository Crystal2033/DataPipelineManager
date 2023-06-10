package ru.mai.lessons.rpks.metrics;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;
import ru.mai.lessons.rpks.database.repository.FilteringRepository;

@RequiredArgsConstructor
@Component
public class FilterMetrics implements InfoContributor {

    private final FilteringRepository filteringRepository;
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("countFilters", filteringRepository.count());
    }
}
