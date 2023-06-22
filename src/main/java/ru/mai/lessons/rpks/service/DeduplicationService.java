package ru.mai.lessons.rpks.service;

import ru.mai.lessons.rpks.model.Deduplication;

import java.util.List;

public interface DeduplicationService {

    List<Deduplication> getAllDeduplications();

    List<Deduplication> getAllDeduplicationsByDeduplicationId(Long id);

    Deduplication getDeduplicationById(long deduplicationId, long ruleId);

    void deleteDeduplication();

    void deleteDeduplicationById(long deduplicationId, long ruleId);

    void save(Deduplication deduplication);
}
