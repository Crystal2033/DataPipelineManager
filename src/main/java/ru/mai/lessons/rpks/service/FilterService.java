package ru.mai.lessons.rpks.service;

import ru.mai.lessons.rpks.model.Filter;

import java.util.List;

public interface FilterService {
    List<Filter> getAllFilters();

    List<Filter> getAllFiltersByFilterId(long filterId);

    Filter getFilterById(long filterId, long ruleId);

    void deleteFilter();

    void deleteFilterById(long filterId, long ruleId);

    void save(Filter filter);
}
