package ru.mai.lessons.rpks.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.service.FilterService;
import ru.mai.lessons.rpks.model.Filter;
import ru.mai.lessons.rpks.repositories.FilterRepository;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class FilterServiceImpl implements FilterService {
    private final FilterRepository filterRepository;

    @Override
    public List<Filter> getAllFilters() {
        log.debug("get all filters from db");
        return filterRepository.findAll();
    }

    @Override
    public List<Filter> getAllFiltersByFilterId(long filterId) {
        log.debug("get all filters by id from db");
        return filterRepository.getAllByFilterId(filterId);
    }

    @Override
    public Filter getFilterByFilterIdAndRuleId(long filterId, long ruleId) {
        log.debug("get filter by filterId and ruleId");
        return filterRepository.getFilterByFilterIdAndRuleId(filterId, ruleId);
    }

    @Override
    public void deleteFilter() {
        log.debug("delete all filters from db");
        filterRepository.deleteAll();
    }

    @Override
    public void deleteFilterById(long filterId, long ruleId) {
        log.debug("get filter by filterId and ruleId from db");
        filterRepository.deleteAllByFilterIdAndRuleId(filterId, ruleId);
    }

    @Override
    public void save(Filter filter) {
        log.debug("save new filter in db");
        filterRepository.save(filter);
    }
}
