package ru.mai.lessons.rpks.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.model.Enrichment;
import ru.mai.lessons.rpks.repository.EnrichmentRep;

@Service
@RequiredArgsConstructor
public class EnrichmentService {
    private final EnrichmentRep enrichmentRepository;

    public Iterable<Enrichment> getAll() {
        return enrichmentRepository.findAll();
    }

    public Iterable<Enrichment> getAllById(long id) {
        return enrichmentRepository.getAllByEnrichmentId(id);
    }

    public Enrichment getByIdAndRuleId(long id, long ruleId) {
        return enrichmentRepository.getEnrichmentByEnrichmentIdAndRuleId(id, ruleId);
    }

    public void deleteAll() {
        enrichmentRepository.deleteAll();
    }

    @Transactional
    public void deleteByIdAndRuleId(long id, long ruleId) {
        enrichmentRepository.deleteEnrichmentByEnrichmentIdAndRuleId(id, ruleId);
    }

    public void save(Enrichment enrichment) {
        enrichmentRepository.save(enrichment);
    }
}
