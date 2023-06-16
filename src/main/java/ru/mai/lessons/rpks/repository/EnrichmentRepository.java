package ru.mai.lessons.rpks.repository;

import org.springframework.data.repository.CrudRepository;
import ru.mai.lessons.rpks.model.Enrichment;

import java.util.List;

public interface EnrichmentRepository extends CrudRepository<Enrichment, Long> {

    List<Enrichment> getAllByEnrichmentId(Long id);
    Enrichment getEnrichmentByEnrichmentIdAndRuleId(Long enrichmentId, Long ruleId);
    void deleteEnrichmentByEnrichmentIdAndRuleId(Long enrichmentId, Long ruleId);
}
