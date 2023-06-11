package ru.mai.lessons.rpks.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.boot.actuate.info.MapInfoContributor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.mai.lessons.rpks.repository.DeduplicationRep;
import ru.mai.lessons.rpks.repository.EnrichmentRep;
import ru.mai.lessons.rpks.repository.FilterRep;

import java.util.HashMap;
import java.util.Map;

@Configuration
@RequiredArgsConstructor
public class ActuatorInfoConfig {
    private final FilterRep filterRep;
    private final DeduplicationRep deduplicationRep;
    private final EnrichmentRep enrichmentRep;

    @Bean
    InfoContributor getInfoContributor() {
        Map<String, Object> details = new HashMap<>();
        details.put("countFilters", filterRep.count());
        details.put("countDeduplications", deduplicationRep.count());
        details.put("countEnrichments", enrichmentRep.count());

        Map<String, Object> wrapper = new HashMap<>();
        wrapper.put("org", details);
        return new MapInfoContributor(wrapper);
    }
}

