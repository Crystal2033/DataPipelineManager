package ru.mai.lessons.rpks.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.mai.lessons.rpks.model.Enrichment;
import ru.mai.lessons.rpks.repository.EnrichmentRepository;
import ru.mai.lessons.rpks.service.EnrichmentService;

@Service
@RequiredArgsConstructor
public class EnrichmentServiceImpl implements EnrichmentService {
    private final EnrichmentRepository enrichmentRepository;

    @Override
    public Iterable<Enrichment> getAll() {
        return enrichmentRepository.findAll();
    }

    @Override
    public Iterable<Enrichment> getAllByEnrichmentId(long enrichmentId) {
        return enrichmentRepository.getAllByEnrichmentId(enrichmentId);
    }

    @Override
    public Enrichment getByEnrichmentIdRuleId(long enrichmentId, long ruleId) {
        return enrichmentRepository.getEnrichmentByEnrichmentIdAndRuleId(enrichmentId, ruleId);
    }

    @Override
    public void deleteAll() {
        enrichmentRepository.deleteAll();
    }

    @Transactional
    @Override
    public void deleteByEnrichmentIdAndRuleId(long enrichmentId, long ruleId) {
        enrichmentRepository.deleteEnrichmentByEnrichmentIdAndRuleId(enrichmentId, ruleId);
    }

    @Override
    public void save(Enrichment enrichment) {
        enrichmentRepository.save(enrichment);
    }
}
