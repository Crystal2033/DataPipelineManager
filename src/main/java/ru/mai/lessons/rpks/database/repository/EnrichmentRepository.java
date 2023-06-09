package ru.mai.lessons.rpks.database.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.mai.lessons.rpks.database.entities.Enrichment;

import java.util.List;

@Repository
public interface EnrichmentRepository extends CrudRepository<Enrichment, Long> {
    List<Enrichment> findAll();

    List<Enrichment> findAllById(Long id);

    Enrichment findByEnrichmentIdAndRuleId(Long enrichmentId, Long ruleId);

    void deleteAll();

    void deleteByEnrichmentIdAndRuleId(Long enrichmentId, Long ruleId);

    Enrichment save(Enrichment enrichmentRule);

}
