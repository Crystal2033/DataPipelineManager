package ru.mai.lessons.rpks.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.boot.actuate.info.MapInfoContributor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.mai.lessons.rpks.repository.DeduplicationRepository;
import ru.mai.lessons.rpks.repository.EnrichmentRepository;
import ru.mai.lessons.rpks.repository.FilterRepository;

import java.util.HashMap;
import java.util.Map;

@Configuration
@RequiredArgsConstructor
public class ActuatorInfoConfig {
    private final DeduplicationRepository deduplicationRepository;
    private final EnrichmentRepository enrichmentRepository;
    private final FilterRepository filterRepository;

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