package ru.mai.lessons.rpks.database.repository;


import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mai.lessons.rpks.database.entity.EnrichmentEntity;

import java.util.List;

@Repository
public interface EnrichmentRepository extends JpaRepository<EnrichmentEntity, Long> {

    boolean existsById(@NotNull Long id);

    EnrichmentEntity findEnrichmentByEnrichmentIdAndRuleId(Long id, Long ruleId);

    List<EnrichmentEntity> findEnrichmentEntitiesByEnrichmentId(Long id);

    void deleteByEnrichmentIdAndRuleId(Long id, Long ruleId);
}
