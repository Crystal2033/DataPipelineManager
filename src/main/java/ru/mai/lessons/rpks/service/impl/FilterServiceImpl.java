package ru.mai.lessons.rpks.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.mai.lessons.rpks.model.Filter;
import ru.mai.lessons.rpks.repository.FilterRepository;
import ru.mai.lessons.rpks.service.FilterService;

@Service
@RequiredArgsConstructor
public class FilterServiceImpl implements FilterService {
    private final FilterRepository filterRepository;

    @Override
    public Iterable<Filter> getAll() {
        return filterRepository.findAll();
    }

    @Override
    public Iterable<Filter> getAllByFilterId(long filterId) {
        return filterRepository.getAllByFilterId(filterId);
    }

    @Override
    public Filter getByFilterIdAndRuleId(long filterId, long ruleId) {
        return filterRepository.getFilterByFilterIdAndRuleId(filterId, ruleId);
    }

    @Override
    public void deleteAll() {
        filterRepository.deleteAll();
    }

    @Override
    @Transactional
    public void deleteByFilterIdAndRuleId(long filterId, long ruleId) {
        filterRepository.deleteByFilterIdAndRuleId(filterId, ruleId);
    }

    @Override
    public void save(Filter filter) {
        filterRepository.save(filter);
    }
}
