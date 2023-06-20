package ru.mai.lessons.rpks.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.mai.lessons.rpks.model.Deduplication;

import java.util.List;
import java.util.Optional;


@Repository
public interface DeduplicationRepository extends CrudRepository<Deduplication, Long> {
    /*@Query("select * from Deduplication d where deduplicationId = :deduplicationId and ruleId = :ruleId")
    Optional<Deduplication> findByDeduplicationIdAndRuleId(@Param("deduplicationId") long deduplicationId,
                                                           @Param("ruleId") long ruleId);*/

    Optional<Deduplication> findByDeduplicationIdAndRuleId(long deduplicationId, long ruleId);

    void deleteByDeduplicationIdAndRuleId(long deduplicationId, long ruleId);

    List<Deduplication> findByDeduplicationId(long deduplicationId);
}
