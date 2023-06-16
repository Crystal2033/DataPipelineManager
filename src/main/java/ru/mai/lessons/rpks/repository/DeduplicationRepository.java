package ru.mai.lessons.rpks.repository;

import org.springframework.data.repository.CrudRepository;
import ru.mai.lessons.rpks.model.Deduplication;

import java.util.List;

public interface DeduplicationRepository extends CrudRepository<Deduplication, Long> {
    List<Deduplication> getAllByDeduplicationId(long id);
    Deduplication getDeduplicationByDeduplicationIdAndRuleId(Long deduplicationId, Long ruleId);
    void deleteDeduplicationByDeduplicationIdAndRuleId(Long deduplicationId, Long ruleId);
}