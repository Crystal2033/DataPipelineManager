package ru.mai.lessons.rpks.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.model.Filter;
import ru.mai.lessons.rpks.repository.FilterRep;

@Service
@RequiredArgsConstructor
@Slf4j
public class FilterService {
    private final FilterRep filterRepository;

    public Iterable<Filter> getAll() {
        return filterRepository.findAll();
    }

    public Iterable<Filter> getAllById(long id) {
        return filterRepository.getAllByFilterId(id);
    }

    public Filter getByIdAndRuleId(long id, long ruleId) {
        log.info("id: {}, ruleId: {}", id, ruleId);
        log.info("count: {}", filterRepository.count());
        return filterRepository.getFilterByFilterIdAndRuleId(id, ruleId);
    }

    public void deleteAll() {
        filterRepository.deleteAll();
    }

    @Transactional
    public void deleteByIdAndRuleId(long id, long ruleId) {
        filterRepository.deleteByFilterIdAndRuleId(id, ruleId);
    }

    public void save(Filter filter) {
        filterRepository.save(filter);
    }
}
