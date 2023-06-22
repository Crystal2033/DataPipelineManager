package ru.mai.lessons.rpks.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.service.DeduplicationService;
import ru.mai.lessons.rpks.model.Deduplication;
import ru.mai.lessons.rpks.repositories.DeduplicationRepository;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class DeduplicationServiceImpl implements DeduplicationService {
    private final DeduplicationRepository deduplicationRepository;

    @Override
    public List<Deduplication> getAllDeduplications() {
        log.debug("get all deduplication from db");
        return deduplicationRepository.findAll();
    }

    @Override
    public List<Deduplication> getAllDeduplicationsByDeduplicationId(Long id) {
        log.debug("get all deduplications by id from db");
        return deduplicationRepository.getDeduplicationsByDeduplicationId(id);
    }

    @Override
    public Deduplication getDeduplicationById(long deduplicationId, long ruleId) {
        log.debug("get deduplication by deduplicationId and ruleId");
        return deduplicationRepository.getDeduplicationByDeduplicationIdAndRuleId(deduplicationId, ruleId);
    }

    @Override
    public void deleteDeduplication() {
        log.debug("delete all deduplications from db");
        deduplicationRepository.deleteAll();
    }

    @Override
    public void deleteDeduplicationById(long deduplicationId, long ruleId) {
        log.debug("get deduplication by deduplicationId and ruleId from db");
        deduplicationRepository.deleteDeduplicationsByDeduplicationIdAndRuleId(deduplicationId, ruleId);
    }

    @Override
    public void save(Deduplication deduplication) {
        log.debug("save new deduplication in db");
        deduplicationRepository.save(deduplication);
    }
}
