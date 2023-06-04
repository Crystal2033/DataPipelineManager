package ru.mai.lessons.rpks.repository;

import org.springframework.data.repository.CrudRepository;
import ru.mai.lessons.rpks.model.Filter;

import java.util.List;

public interface FilterRepository extends CrudRepository<Filter, Long> {
    List<Filter> findFiltersByFilterId(long id);
    Filter findFilterByFilterIdAndRuleId(long filterId, long ruleId);
    void deleteFilterByFilterIdAndRuleId(long filterId, long ruleId);
}
