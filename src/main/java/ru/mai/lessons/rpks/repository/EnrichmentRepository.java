package ru.mai.lessons.rpks.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.mai.lessons.rpks.model.Enrichment;

import java.util.List;

@Repository
public interface EnrichmentRepository extends CrudRepository<Enrichment, Long> {

    List<Enrichment> findAllEnrichmentsByEnrichmentId (Long enrichmentId);
    Enrichment findEnrichmentByEnrichmentIdAndRuleId (Long enrichmentId, Long ruleId);

    void deleteEnrichmentByEnrichmentIdAndRuleId(Long enrichmentId, Long ruleId);
}
