package ru.mai.lessons.rpks.service;

import ru.mai.lessons.rpks.model.Filter;

public interface FilterService {
    Iterable<Filter> getAll();

    Iterable<Filter> getAllByFilterId(long filterId);

    Filter getByFilterIdAndRuleId(long filterId, long ruleId);

    void deleteAll();

    void deleteByFilterIdAndRuleId(long filterId, long ruleId);

    void save(Filter filter);
}
