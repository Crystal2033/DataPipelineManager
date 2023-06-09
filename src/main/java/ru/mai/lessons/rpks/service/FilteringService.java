package ru.mai.lessons.rpks.service;

import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.database.entities.Filter;
import ru.mai.lessons.rpks.database.repository.FilteringRepository;

import java.util.List;

@Service
public class FilteringService {
    private final FilteringRepository filteringRepository;

    public FilteringService(FilteringRepository filteringRepository) {
        this.filteringRepository = filteringRepository;
    }

    public void save(@NotNull Filter filterRule) {
        filteringRepository.save(filterRule);
    }

    public List<Filter> findAll() {
        return filteringRepository.findAll();
    }

    public List<Filter> findAllByFilterId(Long id) {
        return filteringRepository.findAllByFilterId(id);
    }

    public Filter findByFilterAndRuleId(Long filterId, Long ruleId){
        return filteringRepository.findByFilterIdAndRuleId(filterId, ruleId);
    }

    public void deleteAll(){
        filteringRepository.deleteAll();
    }

    public void deleteByFilterAndRuleId(Long filterId, Long ruleId){
        filteringRepository.deleteByFilterIdAndRuleId(filterId, ruleId);
    }


}
