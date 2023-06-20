package ru.mai.lessons.rpks.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.mai.lessons.rpks.model.Enrichment;

import java.util.List;
import java.util.Optional;

@Repository
public interface EnrichmentRepository extends CrudRepository<Enrichment, Long> {

    Optional<Enrichment> findByEnrichmentIdAndRuleId(long enrichmentId, long ruleId);

    void deleteByEnrichmentIdAndRuleId(long enrichmentId, long ruleId);

    List<Enrichment> findByEnrichmentId(long enrichmentId);
}
