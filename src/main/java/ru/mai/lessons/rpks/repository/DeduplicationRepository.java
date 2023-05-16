package ru.mai.lessons.rpks.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.mai.lessons.rpks.model.Deduplication;

import java.util.List;

@Repository
public interface DeduplicationRepository extends CrudRepository<Deduplication, Long> {
    List<Deduplication> getDeduplicationByDeduplicationId(long id);

    Deduplication getDeduplicationByDeduplicationIdAndRuleId(long deduplicationId, long ruleId);

    void deleteDeduplicationByDeduplicationIdAndRuleId(long deduplicationId, long ruleId);

    @Override
    long count();
}
