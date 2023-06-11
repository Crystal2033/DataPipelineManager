package ru.mai.lessons.rpks.repository;

import org.springframework.data.repository.CrudRepository;
import ru.mai.lessons.rpks.model.Filter;

import java.util.List;

public interface FilterRep extends CrudRepository<Filter, Long> {
    List<Filter> getAllByFilterId(long id);
    Filter getFilterByFilterIdAndRuleId(long id, long ruleId);
    void deleteByFilterIdAndRuleId(long id, long ruleId);

    @Override
    long count();
}

