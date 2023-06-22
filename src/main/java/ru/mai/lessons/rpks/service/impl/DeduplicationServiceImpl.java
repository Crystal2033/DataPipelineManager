package ru.mai.lessons.rpks.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.service.DeduplicationService;
import ru.mai.lessons.rpks.model.Deduplication;
import ru.mai.lessons.rpks.repositories.DeduplicationRepository;

import java.util.List;

@Slf4j
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
        return deduplicationRepository.getDeduplicationByDeduplicationIdAndRuleId(deduplicationId, ruleId);
    }

    @Override
    public void deleteDeduplication() {
        deduplicationRepository.deleteAll();
    }

    @Override
    @Transactional
    public void deleteDeduplicationById(long deduplicationId, long ruleId) {
        deduplicationRepository.deleteDeduplicationsByDeduplicationIdAndRuleId(deduplicationId, ruleId);
    }

    @Override
    public void save(Deduplication deduplication) {
        deduplicationRepository.save(deduplication);
    }
}

