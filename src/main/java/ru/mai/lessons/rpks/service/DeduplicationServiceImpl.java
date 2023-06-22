package ru.mai.lessons.rpks.service;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Comment;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import ru.mai.lessons.rpks.model.Deduplication;
import ru.mai.lessons.rpks.repository.DeduplicationRepository;

@Service
@RequiredArgsConstructor
@ComponentScan
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
    @Transactional
    public void deleteByDeduplicationIdAndRuleId(long deduplicationId, long ruleId) {
        deduplicationRepository.deleteByDeduplicationIdAndRuleId(deduplicationId, ruleId);
    }

    @Override
    public Iterable<Deduplication> getByDeduplicationId(long id) {
        return deduplicationRepository.findByDeduplicationId(id);

    }
}
