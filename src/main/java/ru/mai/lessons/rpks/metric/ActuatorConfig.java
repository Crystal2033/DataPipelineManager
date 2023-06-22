package ru.mai.lessons.rpks.metric;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.boot.actuate.info.MapInfoContributor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.mai.lessons.rpks.repositories.DeduplicationRepository;
import ru.mai.lessons.rpks.repositories.EnrichmentRepository;
import ru.mai.lessons.rpks.repositories.FilterRepository;

import java.util.HashMap;
import java.util.Map;

@Configuration
@RequiredArgsConstructor
public class ActuatorConfig {
    private final DeduplicationRepository deduplicationRepository;
    private final FilterRepository filterRepository;
    private final EnrichmentRepository enrichmentRepository;

    @Bean
    InfoContributor getInfoContributor() {
        Map<String, Object> details = new HashMap<>();
        details.put("countFilters", filterRepository.count());
        details.put("countDeduplications", deduplicationRepository.count());
        details.put("countEnrichments", enrichmentRepository.count());
        Map<String, Object> wrapper = new HashMap<>();
        wrapper.put("org", details);
        return new MapInfoContributor(wrapper);
    }
}
