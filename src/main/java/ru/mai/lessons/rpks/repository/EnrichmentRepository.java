package ru.mai.lessons.rpks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mai.lessons.rpks.model.Enrichment;

@Repository
public interface EnrichmentRepository extends JpaRepository<Enrichment, Long> {
    void deleteAllByEnrichmentIdAndRuleId(Long enrichmentId, Long ruleId);
}
