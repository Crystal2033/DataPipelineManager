package ru.mai.lessons.rpks.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.mai.lessons.rpks.model.Enrichment;
import ru.mai.lessons.rpks.model.Filter;

import java.util.List;

@Repository
public interface FilterRepository extends CrudRepository<Filter, Long>{

    List<Filter> findAllFiltersByFilterId (Long filterId);
    Filter findFilterByFilterIdAndRuleId (Long filterId, Long ruleId);

    void deleteFilterByFilterIdAndRuleId(Long filterId, Long ruleId);
}



