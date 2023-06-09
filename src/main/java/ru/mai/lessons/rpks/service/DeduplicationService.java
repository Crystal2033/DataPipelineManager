package ru.mai.lessons.rpks.service;

import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.database.entities.Deduplication;
import ru.mai.lessons.rpks.database.repository.DeduplicationRepository;

import java.util.List;

@Service
public class DeduplicationService {
    private final DeduplicationRepository deduplicationRepository;

    public DeduplicationService(DeduplicationRepository deduplicationRepository) {
        this.deduplicationRepository = deduplicationRepository;
    }

    public void save(@NotNull Deduplication deduplicationRule) {
        deduplicationRepository.save(deduplicationRule);
    }

    public List<Deduplication> findAll() {
        return deduplicationRepository.findAll();
    }

    public List<Deduplication> findAllByDeduplicationId(Long id) {
        return deduplicationRepository.findAllByDeduplicationId(id);
    }

    public Deduplication findByDeduplicationAndRuleId(Long deduplicationId, Long ruleId) {
        return deduplicationRepository.findByDeduplicationIdAndRuleId(deduplicationId, ruleId);
    }

    public void deleteAll() {
        deduplicationRepository.deleteAll();
    }

    public void deleteByDeduplicationAndRuleId(Long deduplicationId, Long ruleId) {
        deduplicationRepository.deleteByDeduplicationIdAndRuleId(deduplicationId, ruleId);
    }

}
