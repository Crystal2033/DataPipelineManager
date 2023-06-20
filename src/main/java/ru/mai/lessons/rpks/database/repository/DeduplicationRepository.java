package ru.mai.lessons.rpks.database.repository;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mai.lessons.rpks.database.entity.DeduplicationEntity;

import java.util.List;


@Repository
public interface DeduplicationRepository extends JpaRepository<DeduplicationEntity, Long> {
    boolean existsById(@NotNull Long id);

    DeduplicationEntity findDeduplicationEntityByDeduplicationIdAndRuleId(Long id, Long ruleId);

    List<DeduplicationEntity> findDeduplicationEntitiesByDeduplicationId(Long id);

    void deleteByDeduplicationIdAndRuleId(Long id, Long ruleId);


}
