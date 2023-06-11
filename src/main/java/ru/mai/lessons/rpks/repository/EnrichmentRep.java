package ru.mai.lessons.rpks.repository;

import org.springframework.data.repository.CrudRepository;
import ru.mai.lessons.rpks.model.Enrichment;

import java.util.List;

public interface EnrichmentRep extends CrudRepository<Enrichment, Long> {
    List<Enrichment> getAllByEnrichmentId(long id);

    Enrichment getEnrichmentByEnrichmentIdAndRuleId(long id, long ruleId);

    void deleteEnrichmentByEnrichmentIdAndRuleId(long id, long ruleId);

    @Override
    long count();
}
