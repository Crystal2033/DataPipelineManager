package ru.mai.lessons.rpks.service;

import ru.mai.lessons.rpks.model.Deduplication;

import java.util.List;

public interface DeduplicationService {
    List<Deduplication> getAllDeduplications();

    List<Deduplication> getAllDeduplicationsByDeduplicationId(long deduplicationId);

    Deduplication getDeduplicationById(long deduplicationId, long ruleId);

    void deleteDeduplication();

    void deleteDeduplicationById(long deduplicationId, long ruleId);

    void save(Deduplication deduplication);
}
