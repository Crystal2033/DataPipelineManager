package ru.mai.lessons.rpks.service;


import ru.mai.lessons.rpks.model.Deduplication;

public interface DeduplicationService {
    Iterable<Deduplication> getAll();

    Iterable<Deduplication> getAllByDeduplicationId(long deduplicationId);

    Deduplication getByDeduplicationIdAndRuleId(long deduplicationId, long ruleId);

    void deleteAll();

    void deleteByDeduplicationIdAndRuleId(long deduplicationId, long ruleId);

    void save(Deduplication deduplication);
}
