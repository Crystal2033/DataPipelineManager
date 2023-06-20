package ru.mai.lessons.rpks.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.mai.lessons.rpks.model.Filter;

import java.util.List;
import java.util.Optional;

@Repository
public interface FilterRepository extends CrudRepository<Filter, Long> {
    Optional<Filter> findByFilterIdAndRuleId(long filterId, long ruleId);

    void deleteByFilterIdAndRuleId(long filterId, long ruleId);

    List<Filter> findByFilterId(long filterId);
}


