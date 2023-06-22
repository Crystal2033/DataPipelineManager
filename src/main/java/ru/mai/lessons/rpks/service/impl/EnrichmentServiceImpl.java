package ru.mai.lessons.rpks.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.model.Enrichment;
import ru.mai.lessons.rpks.repository.EnrichmentRepository;
import ru.mai.lessons.rpks.service.EnrichmentService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EnrichmentServiceImpl implements EnrichmentService {
    private final EnrichmentRepository enrichmentRepository;

    @Override
    public List<Enrichment> getAllEnrichments() {
        return enrichmentRepository.findAll();
    }

    @Override
    public List<Enrichment> getAllEnrichmentsByEnrichmentId(long enrichmentId) {
        return enrichmentRepository.getAllByEnrichmentId(enrichmentId);
    }

    @Override
    public Enrichment getEnrichmentById(long enrichmentId, long ruleId) {
        return enrichmentRepository.getEnrichmentByEnrichmentIdAndRuleId(enrichmentId, ruleId);
    }

    @Override
    public void deleteEnrichment() {
        enrichmentRepository.deleteAll();
    }

    @Override
    @Transactional
    public void deleteEnrichmentById(long enrichmentId, long ruleId) {
        enrichmentRepository.deleteAllByEnrichmentIdAndRuleId(enrichmentId, ruleId);
    }

    @Override
    public void save(Enrichment enrichment) {
        enrichmentRepository.save(enrichment);
    }
}
