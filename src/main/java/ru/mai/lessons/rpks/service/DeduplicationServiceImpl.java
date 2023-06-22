package ru.mai.lessons.rpks.service;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import ru.mai.lessons.rpks.model.Deduplication;
import ru.mai.lessons.rpks.repository.DeduplicationRepository;

@Service
@RequiredArgsConstructor
public class DeduplicationServiceImpl implements DeduplicationService {

    private final DeduplicationRepository deduplicationRepository;

    @Override
    public Iterable<Deduplication> getAll() {
        return deduplicationRepository.findAll();
    }

    @Override
    public void save(@RequestBody @Valid Deduplication deduplication) {
        deduplicationRepository.save(deduplication);
    }

    @Override
    public Deduplication getByDeduplicationIdAndRuleId(long deduplicationId, long ruleId) {
        return deduplicationRepository.findByDeduplicationIdAndRuleId(deduplicationId, ruleId).orElse(null);
    }

    @Override
    public void deleteAll() {
        deduplicationRepository.deleteAll();
    }

    @Override
    public void deleteByDeduplicationIdAndRuleId(long deduplicationId, long ruleId) {
        deduplicationRepository.deleteByDeduplicationIdAndRuleId(deduplicationId, ruleId);
    }

    @Override
    public Iterable<Deduplication> getByDeduplicationId(long id) {
        return deduplicationRepository.findByDeduplicationId(id);
    }
}
