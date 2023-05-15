package ru.mai.lessons.rpks.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.model.Deduplication;
import ru.mai.lessons.rpks.repository.DeduplicationRepository;
import ru.mai.lessons.rpks.service.DeduplicationService;

@Service
@RequiredArgsConstructor
public class DeduplicationServiceImpl implements DeduplicationService {
    private final DeduplicationRepository deduplicationRepository;

    @Override
    public Iterable<Deduplication> getAll() {
        return deduplicationRepository.findAll();
    }

    @Override
    public Iterable<Deduplication> getAllByDeduplicationId(long deduplicationId) {
        return deduplicationRepository.getDeduplicationByDeduplicationId(deduplicationId);
    }

    @Override
    public Deduplication getByDeduplicationIdAndRuleId(long deduplicationId, long ruleId) {
        return deduplicationRepository.getDeduplicationByDeduplicationIdAndRuleId(deduplicationId, ruleId);
    }

    @Override
    public void deleteAll() {
        deduplicationRepository.deleteAll();
    }

    @Override
    public void deleteByDeduplicationIdAndRuleId(long deduplicationId, long ruleId) {
        deduplicationRepository.deleteDeduplicationByDeduplicationIdAndRuleId(deduplicationId, ruleId);
    }

    @Override
    public void save(Deduplication deduplication) {
        deduplicationRepository.save(deduplication);
    }
}
