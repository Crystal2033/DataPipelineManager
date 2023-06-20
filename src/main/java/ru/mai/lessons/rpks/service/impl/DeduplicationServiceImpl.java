package ru.mai.lessons.rpks.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.model.Deduplication;
import ru.mai.lessons.rpks.repository.DeduplicationRepository;
import ru.mai.lessons.rpks.service.DeduplicationService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeduplicationServiceImpl implements DeduplicationService {
    private final DeduplicationRepository deduplicationRepository;

    @Override
    public List<Deduplication> getAllDeduplications() {
        return deduplicationRepository.findAll();
    }

    @Override
    public List<Deduplication> getAllDeduplicationsByDeduplicationId(long deduplicationId) {
        return deduplicationRepository.getDeduplicationsByDeduplicationId(deduplicationId);
    }

    @Override
    public Deduplication getDeduplicationById(long deduplicationId, long ruleId) {
        return deduplicationRepository.getDeduplicationByIdAndRuleId(deduplicationId, ruleId);
    }

    @Override
    public void deleteDeduplication() {
        deduplicationRepository.deleteAll();
    }

    @Override
    public void deleteDeduplicationById(long deduplicationId, long ruleId) {
        deduplicationRepository.deleteDeduplicationsByDeduplicationIdAndRuleId(deduplicationId, ruleId);
    }

    @Override
    public void save(Deduplication deduplication) {
        deduplicationRepository.save(deduplication);
    }
}
