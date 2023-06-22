package ru.mai.lessons.rpks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mai.lessons.rpks.model.Enrichment;

import java.util.List;

public interface EnrichmentRepository extends JpaRepository<Enrichment, Long> {
    List<Enrichment> getAllByEnrichmentId(long enrichmentId);

    Enrichment getEnrichmentByEnrichmentIdAndRuleId(long enrichmentId, long ruleId);

    void deleteAllByEnrichmentIdAndRuleId(long enrichmentId, long ruleId);
}
