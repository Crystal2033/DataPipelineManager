package ru.mai.lessons.rpks.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.mai.lessons.rpks.model.Filter;

import java.util.List;

@Repository
public interface FilterRepository extends CrudRepository<Filter, Long> {
    List<Filter> getAllByFilterId(Long id);
    Filter getFilterByFilterIdAndRuleId(Long filterId, Long ruleId);
    void deleteFilterByFilterIdAndRuleId(Long filterId, Long ruleId);
}
