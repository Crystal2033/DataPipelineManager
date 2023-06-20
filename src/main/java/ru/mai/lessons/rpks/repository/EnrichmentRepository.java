package ru.mai.lessons.rpks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mai.lessons.rpks.model.Enrichment;

import java.util.List;

public interface EnrichmentRepository extends JpaRepository<Enrichment, Long> {

    List<Enrichment> getAllByEnrichmentId(long enrichmentId);

    Enrichment getEnrichmentByEnrichmentIdAndRuleId(long enrichmentId, long ruleId);


    void deleteEnrichmentsByEnrichmentIdAndRuleId(long enrichmentId, long ruleId);


}
