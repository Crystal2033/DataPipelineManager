package ru.mai.lessons.rpks.repository;

import org.springframework.data.repository.CrudRepository;
import ru.mai.lessons.rpks.model.Enrichment;

import java.util.List;

public interface EnrichmentRep extends CrudRepository<Enrichment, Long> {
    List<Enrichment> getAllById(long id);
    Enrichment getEntityByIdAndRuleId(long id, long ruleId);
    void deleteByIdAndRuleId(long id, long ruleId);

    @Override
    long count();
}
