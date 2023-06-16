package ru.mai.lessons.rpks.service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.model.Enrichment;
import ru.mai.lessons.rpks.repository.EnrichmentRepository;

@Service
@NoArgsConstructor
@Getter
public class EnrichmentService {
    @Autowired
    private EnrichmentRepository enrichmentRepository;

    public Iterable<Enrichment> getAllEnrichments() {
        return enrichmentRepository.findAll();
    }

    public void deleteEnrichment() {
        enrichmentRepository.deleteAll();
    }

    public void save(Enrichment enrichment) {
        enrichmentRepository.save(enrichment);
    }

    public Iterable<Enrichment> getAllEnrichmentsByEnrichmentId(long id) {
        return enrichmentRepository.getAllByEnrichmentId(id);
    }

    public Enrichment getEnrichmentById(long enrichmentId, long ruleId) {
        return enrichmentRepository.getEnrichmentByEnrichmentIdAndRuleId(enrichmentId, ruleId);
    }

    public void deleteEnrichmentById(long enrichmentId, long ruleId) {
        enrichmentRepository.deleteEnrichmentByEnrichmentIdAndRuleId(enrichmentId, ruleId);
    }
}
