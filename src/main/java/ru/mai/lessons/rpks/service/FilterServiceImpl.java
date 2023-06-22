package ru.mai.lessons.rpks.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.mai.lessons.rpks.model.Filter;
import ru.mai.lessons.rpks.repository.FilterRepository;

@Service
@RequiredArgsConstructor
public class FilterServiceImpl implements FilterService {

    private final FilterRepository filterRepository;

    @Override
    public Iterable<Filter> getAll() {
        return filterRepository.findAll();
    }

    @Override
    public void save(Filter filter) {
        filterRepository.save(filter);
    }

    @Override
    public Filter getByFilterIdAndRuleId(long filterId, long ruleId) {
        return filterRepository.findByFilterIdAndRuleId(filterId, ruleId).orElse(null);
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
    public Iterable<Filter> getByFilterId(long id) {
        return filterRepository.findByFilterId(id);
    }
}
