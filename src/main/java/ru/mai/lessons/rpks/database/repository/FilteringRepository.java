package ru.mai.lessons.rpks.database.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.mai.lessons.rpks.database.entities.Filter;

import java.util.List;

@Repository
public interface FilteringRepository extends CrudRepository<Filter, Long> {
    Filter save(Filter filter);

    List<Filter> findAll();

    List<Filter> findAllByFilterId(Long filterId);

    Filter findByFilterIdAndRuleId(Long filterId, Long ruleId);

    void deleteAll();

    void deleteByFilterIdAndRuleId(Long filterId, Long ruleId);


}
