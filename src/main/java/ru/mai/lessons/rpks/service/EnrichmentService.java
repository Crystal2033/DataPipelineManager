package ru.mai.lessons.rpks.service;

import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.model.Enrichment;
import ru.mai.lessons.rpks.repository.EnrichmentRepository;

import java.util.List;

@Service
public class EnrichmentService {
    EnrichmentRepository enrichmentRepository;

    public List<Enrichment> getAllEnrichments() {
        return enrichmentRepository.findAll();
    }

    public List<Enrichment> getAllEnrichmentsByEnrichmentId(long enrichmentId) {
        return enrichmentRepository.getAllByEnrichmentId(enrichmentId);
    }

    public Enrichment getEnrichmentById(long enrichmentId, long ruleId) {
        return enrichmentRepository.getEnrichmentByEnrichmentIdAndRuleId(enrichmentId, ruleId);
    }

    public void deleteEnrichment() {
        enrichmentRepository.deleteAll();
    }

    public void deleteEnrichmentById(long enrichmentId, long ruleId) {
        enrichmentRepository.deleteEnrichmentsByEnrichmentIdAndRuleId(enrichmentId, ruleId);
    }

    public void save(Enrichment enrichment) {
        enrichmentRepository.save(enrichment);
    }
}
