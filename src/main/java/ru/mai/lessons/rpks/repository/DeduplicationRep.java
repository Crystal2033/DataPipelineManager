package ru.mai.lessons.rpks.repository;

import org.springframework.data.repository.CrudRepository;
import ru.mai.lessons.rpks.model.Deduplication;

import java.util.List;

public interface DeduplicationRep extends CrudRepository<Deduplication, Long> {
    List<Deduplication> getAllById(long id);
    Deduplication getEntityByIdAndRuleId(long id, long ruleId);
    void deleteByIdAndRuleId(long id, long ruleId);

    @Override
    long count();
}

