package ru.mai.lessons.rpks;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WorkingService<T> {
    private final ServiceRepository<T> repository;

    public Iterable<T> getAll() {
        return repository.findAll();
    }

    public Iterable<T> getAllById(long id) {
        return repository.getAllById(id);
    }

    public T getByIdAndRuleId(long id, long ruleId) {
        return repository.getEntityByIdAndRuleId(id, ruleId);
    }

    public void deleteAll() {
        repository.deleteAll();
    }

    @Transactional
    public void deleteByIdAndRuleId(long id, long ruleId) {
        repository.deleteByIdAndRuleId(id, ruleId);
    }

    public void save(T enrichment) {
        repository.save(enrichment);
    }
}
