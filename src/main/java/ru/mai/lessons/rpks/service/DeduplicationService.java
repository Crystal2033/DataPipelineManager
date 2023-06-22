package ru.mai.lessons.rpks.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.model.Deduplication;
import ru.mai.lessons.rpks.repository.DeduplicationRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeduplicationService {
    private final DeduplicationRepository deduplicationRepository;

    public List<Deduplication> getAllDeduplications() {
        return deduplicationRepository.findAll();
    }

    public List<Deduplication> getAllDeduplicationsByDeduplicationId(long deduplicationId) {
        return deduplicationRepository.getDeduplicationsByDeduplicationId(deduplicationId);
    }

    public Deduplication getDeduplicationById(long deduplicationId, long ruleId) {
        return deduplicationRepository.getDeduplicationByDeduplicationIdAndRuleId(deduplicationId, ruleId);
    }

    public void deleteDeduplication() {
        deduplicationRepository.deleteAll();
    }

    public void deleteDeduplicationById(long deduplicationId, long ruleId) {
        deduplicationRepository.deleteDeduplicationsByDeduplicationIdAndRuleId(deduplicationId, ruleId);
    }

    public void save(Deduplication deduplication) {
        deduplicationRepository.save(deduplication);
    }
}
