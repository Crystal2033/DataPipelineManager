package ru.mai.lessons.rpks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mai.lessons.rpks.model.Deduplication;

@Repository
public interface DeduplicationRepository extends JpaRepository<Deduplication, Long> {
    void deleteAllByDeduplicationIdAndRuleId(Long deduplicationId, Long ruleId);
}
