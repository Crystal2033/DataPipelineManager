package ru.mai.lessons.rpks.repository;

import org.springframework.data.repository.CrudRepository;
import ru.mai.lessons.rpks.model.Filter;

import java.util.List;

public interface FilterRep extends CrudRepository<Filter, Long> {
    List<Filter> getAllById(long id);
    Filter getEntityByIdAndRuleId(long id, long ruleId);
    void deleteByIdAndRuleId(long id, long ruleId);

    @Override
    long count();
}

