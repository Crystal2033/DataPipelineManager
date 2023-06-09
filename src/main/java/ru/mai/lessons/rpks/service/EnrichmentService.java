package ru.mai.lessons.rpks.service;

import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.database.entities.Enrichment;
import ru.mai.lessons.rpks.database.repository.EnrichmentRepository;

import java.util.List;

@Service
public class EnrichmentService {
    private final EnrichmentRepository enrichmentRepository;

    public EnrichmentService(EnrichmentRepository enrichmentRepository) { //DI
        this.enrichmentRepository = enrichmentRepository;
    }

    public void save(@NotNull Enrichment enrichmentRule) {
        enrichmentRepository.save(enrichmentRule);
    }

    public List<Enrichment> findAll() {
        return enrichmentRepository.findAll();
    }

    public List<Enrichment> findAllById(Long id) {
        return enrichmentRepository.findAllById(id);
    }

    public Enrichment findByEnrichmentIdAndRuleId(Long enrichmentId, Long ruleId){
        return enrichmentRepository.findByEnrichmentIdAndRuleId(enrichmentId, ruleId);
    }

    public void deleteAll(){
        enrichmentRepository.deleteAll();
    }

    public void deleteByEnrichmentIdAndRuleId(Long enrichmentId, Long ruleId){
        enrichmentRepository.deleteByEnrichmentIdAndRuleId(enrichmentId, ruleId);
    }

}
