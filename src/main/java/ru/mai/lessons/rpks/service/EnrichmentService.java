package ru.mai.lessons.rpks.service;

import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.database.entities.Enrichment;
import ru.mai.lessons.rpks.database.repository.EnrichmentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EnrichmentService {
    private final EnrichmentRepository enrichmentRepository;


    public void save(@NotNull Enrichment enrichmentRule) {
        enrichmentRepository.save(enrichmentRule);
    }

    public List<Enrichment> findAll() {
        return enrichmentRepository.findAll();
    }

    public List<Enrichment> findAllByEnrichmentId(Long id) {
        return enrichmentRepository.findAllByEnrichmentId(id);
    }

    public Enrichment findByEnrichmentAndRuleId(Long enrichmentId, Long ruleId) {
        return enrichmentRepository.findByEnrichmentIdAndRuleId(enrichmentId, ruleId);
    }

    public void deleteAll() {
        enrichmentRepository.deleteAll();
    }

    public void deleteByEnrichmentAndRuleId(Long enrichmentId, Long ruleId) {
        enrichmentRepository.deleteByEnrichmentIdAndRuleId(enrichmentId, ruleId);
    }

}
