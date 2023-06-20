package ru.mai.lessons.rpks.service;

import ru.mai.lessons.rpks.model.Enrichment;


public interface EnrichmentService {

    Iterable<Enrichment> getAll();
    void save(Enrichment enrichment);

    Enrichment getByEnrichmentIdAndRuleId(long enrichmentId, long ruleId);

    void deleteAll();

    void deleteByEnrichmentIdAndRuleId(long enrichmentId, long ruleId);

    Iterable<Enrichment> getByEnrichmentId(long id);
}
