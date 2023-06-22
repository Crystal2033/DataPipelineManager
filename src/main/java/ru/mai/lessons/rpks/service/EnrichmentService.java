package ru.mai.lessons.rpks.service;

import ru.mai.lessons.rpks.model.Enrichment;

import java.util.List;

public interface EnrichmentService {

    List<Enrichment> getAllEnrichments();

    List<Enrichment> getAllEnrichmentsByEnrichmentIdId(long enrichmentId);

    Enrichment getEnrichmentById(long enrichmentId, long ruleId);

    void deleteEnrichment();

    void deleteEnrichmentById(long enrichmentId, long ruleId);

    void save(Enrichment enrichment);
}
