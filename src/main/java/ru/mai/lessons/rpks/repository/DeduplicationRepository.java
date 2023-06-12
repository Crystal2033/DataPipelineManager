package ru.mai.lessons.rpks.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.mai.lessons.rpks.model.Deduplication;
import ru.mai.lessons.rpks.model.Enrichment;

import java.util.List;

@Repository
public interface DeduplicationRepository extends CrudRepository<Deduplication, Long> {
    List<Deduplication> findAllDeduplicationByDeduplicationId (Long deduplicationId);
    Deduplication findDeduplicationByDeduplicationIdAndRuleId (Long deduplicationId, Long ruleId);

    void deleteDeduplicationByDeduplicationIdAndRuleId(Long deduplicationId, Long ruleId);
}


