package ru.mai.lessons.rpks.service;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import ru.mai.lessons.rpks.model.Filter;
import ru.mai.lessons.rpks.repository.FilterRepository;

@Service
@RequiredArgsConstructor
@ComponentScan
public class FilterServiceImpl implements FilterService {

    private final FilterRepository filterRepository;

    @Override
    public Iterable<Filter> getAll() {
        return filterRepository.findAll();
    }


    @Override
    public void save(@RequestBody Filter filter) {
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
