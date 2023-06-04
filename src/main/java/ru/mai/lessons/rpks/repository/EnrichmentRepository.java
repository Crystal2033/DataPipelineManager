package ru.mai.lessons.rpks.repository;

import org.springframework.data.repository.CrudRepository;
import ru.mai.lessons.rpks.model.Enrichment;

import java.util.List;

public interface EnrichmentRepository extends CrudRepository<Enrichment, Long> {
    List<Enrichment> findEnrichmentsByEnrichmentId(long id);
    Enrichment findEnrichmentByEnrichmentIdAndRuleId(long enrichmentId, long ruleId);
    void deleteEnrichmentByEnrichmentIdAndRuleId(long enrichmentId, long ruleId);
}
