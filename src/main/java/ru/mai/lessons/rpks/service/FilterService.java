package ru.mai.lessons.rpks.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.model.Filter;
import ru.mai.lessons.rpks.repository.FilterRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FilterService {
    FilterRepository filterRepository;
    public List<Filter> getAllFilters() {
        return filterRepository.findAll();
    }

    public List<Filter> getAllFiltersByFilterId(long filterId) {
        return filterRepository.getAllByFilterId(filterId);
    }

    public Filter getFilterByFilterIdAndRuleId(long filterId, long ruleId) {
        return filterRepository.getFilterByFilterIdAndRuleId(filterId, ruleId);
    }

    public void deleteAll() {
        filterRepository.deleteAll();
    }

    public void deleteByFilterIdAndRuleId(long filterId, long ruleId) {
        filterRepository.deleteByFilterIdAndRuleId(filterId, ruleId);
    }

    public void save(Filter filter) {
        filterRepository.save(filter);
    }
}
