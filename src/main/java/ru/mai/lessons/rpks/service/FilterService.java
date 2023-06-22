package ru.mai.lessons.rpks.service;

import ru.mai.lessons.rpks.model.Filter;


public interface FilterService {
    Iterable<Filter> getAll();
    void save(Filter filter);

    Filter getByFilterIdAndRuleId(long filterId, long ruleId);

    void deleteAll();

    void deleteByFilterIdAndRuleId(long filterId, long ruleId);

    Iterable<Filter> getByFilterId(long id);
}

