package ru.mai.lessons.rpks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mai.lessons.rpks.model.Deduplication;

import java.util.List;

@Repository
public interface DeduplicationRepository extends JpaRepository<Deduplication, Long> {
    List<Deduplication> findAllByDeduplicationId(long deduplicationId);
    Deduplication findByDeduplicationIdAndRuleId(long deduplicationId, long ruleId);
    void deleteByDeduplicationIdAndRuleId(long deduplicationId, long ruleId);
}
