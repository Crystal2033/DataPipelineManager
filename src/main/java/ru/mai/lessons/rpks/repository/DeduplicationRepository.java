package ru.mai.lessons.rpks.repository;

import org.springframework.data.repository.CrudRepository;
import ru.mai.lessons.rpks.model.Deduplication;

import java.util.List;

public interface DeduplicationRepository extends CrudRepository<Deduplication, Long> {
    //naming convention?
    List<Deduplication> findDeduplicationsByDeduplicationId(long id);
    Deduplication findDeduplicationByDeduplicationIdAndRuleId(long deduplicationId, long ruleId);
    void deleteDeduplicationByDeduplicationIdAndRuleId(long deduplicationId, long ruleId);
}
