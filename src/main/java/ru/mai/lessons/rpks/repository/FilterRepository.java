package ru.mai.lessons.rpks.repository;

import org.springframework.data.repository.CrudRepository;
import ru.mai.lessons.rpks.model.Filter;

import java.util.List;

public interface FilterRepository extends CrudRepository<Filter, Long> {
    List<Filter> getAllByFilterId(long filterId);

    Filter getFilterByFilterIdAndRuleId(long filterId, long ruleId);

    void deleteByFilterIdAndRuleId(long filterId, long ruleId);
}