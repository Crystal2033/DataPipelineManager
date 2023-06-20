package ru.mai.lessons.rpks.database.repository;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mai.lessons.rpks.database.entity.FilterEntity;

import java.util.List;

@Repository
public interface FilterRepository extends JpaRepository<FilterEntity, Long> {
    boolean existsById(@NotNull Long id);

    FilterEntity findFilterEntityByFilterIdAndRuleId(Long id, Long ruleId);

    List<FilterEntity> findFilterEntitiesByFilterId(Long id);

    void deleteByFilterIdAndRuleId(Long id, Long ruleId);
}
