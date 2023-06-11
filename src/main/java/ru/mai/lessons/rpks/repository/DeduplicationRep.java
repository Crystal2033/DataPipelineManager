package ru.mai.lessons.rpks.repository;

import org.springframework.data.repository.CrudRepository;
import ru.mai.lessons.rpks.model.Deduplication;

import java.util.List;

public interface DeduplicationRep extends CrudRepository<Deduplication, Long> {
    List<Deduplication> getAllByDeduplicationId(long id);

    Deduplication getDeduplicationByDeduplicationIdAndRuleId(long id, long ruleId);

    void deleteDeduplicationByDeduplicationIdAndRuleId(long id, long ruleId);

    @Override
    long count();
}

