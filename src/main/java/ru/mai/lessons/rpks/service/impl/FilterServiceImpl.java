package ru.mai.lessons.rpks.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.model.Filter;
import ru.mai.lessons.rpks.repository.FilterRepository;
import ru.mai.lessons.rpks.service.FilterService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FilterServiceImpl implements FilterService {
    private final FilterRepository filterRepository;
    @Override
    public List<Filter> getAllFilters() {
        return filterRepository.findAll();
    }

    @Override
    public List<Filter> getAllFiltersByFilterId(long filterId) {
        return filterRepository.getAllByFilterId(filterId);
    }

    @Override
    public Filter getFilterByFilterIdAndRuleId(long filterId, long ruleId) {
        return filterRepository.getFilterByFilterIdAndRuleId(filterId, ruleId);
    }

    @Override
    public void deleteFilter() {
        filterRepository.deleteAll();
    }

    @Override
    @Transactional
    public void deleteFilterById(long filterId, long ruleId) {
        filterRepository.deleteAllByFilterIdAndRuleId(filterId, ruleId);
    }

    @Override
    public void save(Filter filter) {
        filterRepository.save(filter);
    }
}
