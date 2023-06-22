package ru.mai.lessons.rpks.service.impl;

import jakarta.transaction.Transactional;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.service.EnrichmentService;
import ru.mai.lessons.rpks.model.Enrichment;
import ru.mai.lessons.rpks.repositories.EnrichmentRepository;

import java.util.List;

@Slf4j
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
