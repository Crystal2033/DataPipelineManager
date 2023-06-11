package ru.mai.lessons.rpks;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ServiceRepository<T> extends CrudRepository<T, Long> {
    List<T> getAllById(long id);
    T getEntityByIdAndRuleId(long id, long ruleId);
    void deleteByIdAndRuleId(long id, long ruleId);

    @Override
    long count();
}