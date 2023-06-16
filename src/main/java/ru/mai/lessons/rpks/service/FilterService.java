package ru.mai.lessons.rpks.service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.model.Filter;
import ru.mai.lessons.rpks.repository.FilterRepository;


@Service
@NoArgsConstructor
@Getter
public class FilterService {
    @Autowired
    private FilterRepository filterRepository;

    public Iterable<Filter> getAllFilters() {
        return filterRepository.findAll();
    }

    public void deleteFilter() {
        filterRepository.deleteAll();
    }

    public void save(Filter filter) {
        filterRepository.save(filter);
    }

    public Iterable<Filter> getAllFiltersByFilterId(Long id) {
        return filterRepository.getAllByFilterId(id);
    }

    public Filter getFilterByFilterIdAndRuleId(long filterId, long ruleId) {
        return filterRepository.getFilterByFilterIdAndRuleId(filterId, ruleId);
    }

    public void deleteFilterById(long filterId, long ruleId) {
        filterRepository.deleteFilterByFilterIdAndRuleId(filterId, ruleId);
    }
}
