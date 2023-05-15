package ru.mai.lessons.rpks.service;

import ru.mai.lessons.rpks.model.Enrichment;

public interface EnrichmentService {
    Iterable<Enrichment> getAll();

    Iterable<Enrichment> getAllByEnrichmentId(long enrichmentId);

    Enrichment getByEnrichmentIdRuleId(long enrichmentId, long ruleId);

    void deleteAll();

    void deleteByEnrichmentIdAndRuleId(long enrichmentId, long ruleId);

    void save(Enrichment enrichment);
}
