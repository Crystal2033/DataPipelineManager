package ru.mai.lessons.rpks.service;

import jakarta.transaction.Transactional;
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
    public Iterable<Filter> getFilters() {
        return filterRepository.findAll();
    }

    public Iterable<Filter> getFiltersById(long id) {
        return filterRepository.findFiltersByFilterId(id);
    }

    public Filter getFilterByIdAndRuleId(long filterId, long ruleId) {
        return filterRepository.findFilterByFilterIdAndRuleId(filterId, ruleId);
    }

    public void deleteAllFilters() {
        filterRepository.deleteAll();
    }
    @Transactional
    public void deleteFilterByIdAndRuleId(long filterId, long ruleId) {
        filterRepository.deleteFilterByFilterIdAndRuleId(filterId, ruleId);
    }

    public void save(Filter filter) {
        filterRepository.save(filter);
    }
}
