package ru.mai.lessons.rpks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mai.lessons.rpks.model.Deduplication;

import java.util.List;

public interface DeduplicationRepository extends JpaRepository<Deduplication, Long> {
    List<Deduplication> getDeduplicationsByDeduplicationId(long deduplicationId);

    Deduplication getDeduplicationByDeduplicationIdAndRuleId(long deduplicationId, long ruleId);

    void deleteAllDeduplicationsByDeduplicationIdAndRuleId(long deduplicationId, long ruleId);
}
