package ru.mai.lessons.rpks.metrics;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;
import ru.mai.lessons.rpks.repository.FilterRepository;

@Component
@RequiredArgsConstructor
public class FilterMetrics implements InfoContributor{
    FilterRepository filterRepository;
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("countFilters", filterRepository.count());
    }
}
