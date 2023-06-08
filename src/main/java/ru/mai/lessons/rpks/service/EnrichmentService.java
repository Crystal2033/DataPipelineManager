package ru.mai.lessons.rpks.service;

import io.swagger.v3.oas.annotations.servers.Server;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.database.entities.Enrichment;
import ru.mai.lessons.rpks.database.repository.EnrichmentRepository;

@Service
public class EnrichmentService {
    private final EnrichmentRepository enrichmentRepository;

    public EnrichmentService(EnrichmentRepository enrichmentRepository) { //DI
        this.enrichmentRepository = enrichmentRepository;
    }

    public void save(@NotNull Enrichment enrichmentRule){
        enrichmentRepository.save(enrichmentRule);
    }
}
