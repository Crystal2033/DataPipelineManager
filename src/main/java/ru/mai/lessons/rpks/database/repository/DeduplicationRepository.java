package ru.mai.lessons.rpks.database.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.mai.lessons.rpks.database.entities.Deduplication;

import java.util.List;

@Repository
public interface DeduplicationRepository extends CrudRepository<Deduplication, Long> {
    Deduplication save(Deduplication deduplicationRule);

    List<Deduplication> findAll();
    List<Deduplication> findAllByDeduplicationId(Long deduplicationId);

    Deduplication findByDeduplicationIdAndRuleId(Long deduplicationId, Long ruleId);

    void deleteAll();

    void deleteByDeduplicationIdAndRuleId(Long deduplicationId, Long ruleId);

}
