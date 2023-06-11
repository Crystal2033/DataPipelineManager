package ru.mai.lessons.rpks.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.model.Filter;
import ru.mai.lessons.rpks.repository.FilterRep;

@Service
@RequiredArgsConstructor
public class FilterService {
    private final FilterRep filterRepository;

    public Iterable<Filter> getAll() {
        return filterRepository.findAll();
    }

    public Iterable<Filter> getAllById(long id) {
        return filterRepository.getAllById(id);
    }

    public Filter getByIdAndRuleId(long id, long ruleId) {
        return filterRepository.getEntityByIdAndRuleId(id, ruleId);
    }

    public void deleteAll() {
        filterRepository.deleteAll();
    }

    @Transactional
    public void deleteByIdAndRuleId(long id, long ruleId) {
        filterRepository.deleteByIdAndRuleId(id, ruleId);
    }

    public void save(Filter filter) {
        filterRepository.save(filter);
    }
}
