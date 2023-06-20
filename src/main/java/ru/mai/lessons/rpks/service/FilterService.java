package ru.mai.lessons.rpks.service;


import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.database.entity.FilterEntity;
import ru.mai.lessons.rpks.database.repository.FilterRepository;
import ru.mai.lessons.rpks.exception.FilterAlreadyExistException;
import ru.mai.lessons.rpks.mapper.FilterEntityMapper;
import ru.mai.lessons.rpks.model.Filter;

import java.util.List;

@Service
@AllArgsConstructor
public class FilterService {
    private final FilterEntityMapper mapper = Mappers.getMapper(FilterEntityMapper.class);
    private final FilterRepository filterRepository;

    public List<Filter> getAll() {
        List<FilterEntity> filterEntityList = filterRepository.findAll();
        return filterEntityList.stream()
                .map(mapper::toFilter)
                .toList();
    }

    public List<Filter> findAllById(Long id) {

        List<FilterEntity> filterEntityList = filterRepository.findFilterEntitiesByFilterId(id);
        return filterEntityList.stream()
                .map(mapper::toFilter)
                .toList();

    }

    public Filter findByIdAndRuleId(Long id, Long ruleId) {
        return mapper.toFilter(filterRepository.findFilterEntityByFilterIdAndRuleId(id, ruleId));
    }

    public void deleteAll() {
        filterRepository.deleteAll();
    }

    @Transactional
    public void deleteByIdAndRuleId(long filterId, long ruleId) {
        filterRepository.deleteByFilterIdAndRuleId(filterId, ruleId);
    }

    public void addOne(Filter filter) throws FilterAlreadyExistException {
        if (filterRepository.existsById(filter.getId())) {
            throw new FilterAlreadyExistException();
        }
        filterRepository.save(mapper.toFilterEntity(filter));

    }
}
