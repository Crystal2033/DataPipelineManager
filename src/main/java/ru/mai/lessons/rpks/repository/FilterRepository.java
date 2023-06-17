package ru.mai.lessons.rpks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mai.lessons.rpks.model.Filter;

@Repository
public interface FilterRepository extends JpaRepository<Filter, Long> {
    void deleteAllByFilterIdAndRuleId(Long filterId, Long ruleId);
}
