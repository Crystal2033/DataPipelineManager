package ru.mai.lessons.rpks.service;


import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.model.Enrichment;
import ru.mai.lessons.rpks.repository.EnrichmentRepository;

@Service
@RequiredArgsConstructor
public class EnrichmentServiceImpl implements EnrichmentService {

    private final EnrichmentRepository enrichmentRepository;

    @Override
    public Iterable<Enrichment> getAll() {
        return enrichmentRepository.findAll();
    }

    @Override
    public void save(Enrichment enrichment) {
        enrichmentRepository.save(enrichment);
    }

    @Override
    public Enrichment getByEnrichmentIdAndRuleId(long enrichmentId, long ruleId) {
        return enrichmentRepository.findByEnrichmentIdAndRuleId(enrichmentId, ruleId).orElse(null);
    }

    @Override
    public void deleteAll() {
        enrichmentRepository.deleteAll();
    }

    @Override
    @Transactional
    public void deleteByEnrichmentIdAndRuleId(long enrichmentId, long ruleId) {
        enrichmentRepository.deleteByEnrichmentIdAndRuleId(enrichmentId, ruleId);
    }

    @Override
    public Iterable<Enrichment> getByEnrichmentId(long id) {
        return enrichmentRepository.findByEnrichmentId(id);
    }
}
