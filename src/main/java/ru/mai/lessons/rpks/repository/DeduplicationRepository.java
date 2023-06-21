package ru.mai.lessons.rpks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mai.lessons.rpks.model.Deduplication;

import java.util.List;

public interface DeduplicationRepository extends JpaRepository<Deduplication, Long> {
    List<Deduplication> getDeduplicationsByDeduplicationId(long deduplicationId);

    Deduplication getDeduplicationByIdAndRuleId(long deduplicationId, long ruleId);

    void deleteDeduplicationsByDeduplicationIdAndRuleId(long deduplicationId, long ruleId);
}
