package ru.mai.lessons.rpks.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.model.Deduplication;
import ru.mai.lessons.rpks.repository.DeduplicationRep;

@Service
@RequiredArgsConstructor
public class DeduplicationService {
    private final DeduplicationRep deduplicationRepository;

    public Iterable<Deduplication> getAll() {
        return deduplicationRepository.findAll();
    }

    public Iterable<Deduplication> getAllById(long id) {
        return deduplicationRepository.getAllById(id);
    }

    public Deduplication getByIdAndRuleId(long id, long ruleId) {
        return deduplicationRepository.getEntityByIdAndRuleId(id, ruleId);
    }

    public void deleteAll() {
        deduplicationRepository.deleteAll();
    }

    @Transactional
    public void deleteByIdAndRuleId(long id, long ruleId) {
        deduplicationRepository.deleteByIdAndRuleId(id, ruleId);
    }

    public void save(Deduplication deduplication) {
        deduplicationRepository.save(deduplication);
    }
}
