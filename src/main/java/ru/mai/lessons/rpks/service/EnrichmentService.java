package ru.mai.lessons.rpks.service;

import jakarta.transaction.Transactional;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.model.Enrichment;
import ru.mai.lessons.rpks.repository.EnrichmentRepository;

@Service
@RequiredArgsConstructor
@Getter
public class EnrichmentService {
    @Autowired
    private EnrichmentRepository enrichmentRepository;

    public Iterable<Enrichment> getEnrichments() {
        return enrichmentRepository.findAll();
    }

    public Iterable<Enrichment> getEnrichmetsById(long id) {
        return enrichmentRepository.findEnrichmentsByEnrichmentId(id);
    }

    public Enrichment getEnrichmentByIdAndRuleId(long enrichmentId, long ruleId) {
        return enrichmentRepository.findEnrichmentByEnrichmentIdAndRuleId(enrichmentId, ruleId);
    }

    public void deleteAllEnrichments() {
        enrichmentRepository.deleteAll();
    }
    @Transactional
    public void deleteEnrichmentByIdAndRuleId(long enrichmentId, long ruleId) {
        enrichmentRepository.deleteEnrichmentByEnrichmentIdAndRuleId(enrichmentId, ruleId);
    }

    public void save(Enrichment enrichment) {
        enrichmentRepository.save(enrichment);
    }
}
