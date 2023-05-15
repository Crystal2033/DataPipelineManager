package ru.mai.lessons.rpks.repository;

import org.springframework.data.repository.CrudRepository;
import ru.mai.lessons.rpks.model.Enrichment;

import java.util.List;

public interface EnrichmentRepository extends CrudRepository<Enrichment, Long> {
    List<Enrichment> getAllByEnrichmentId(long enricherId);

    Enrichment getEnrichmentByEnrichmentIdAndRuleId(long enricherId, long ruleId);

    void deleteEnrichmentByEnrichmentIdAndRuleId(long enricherId, long ruleId);
}
