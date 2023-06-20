package ru.mai.lessons.rpks.service;

import ru.mai.lessons.rpks.model.Deduplication;

public interface DeduplicationService {
    Iterable<Deduplication> getAll();
    void save(Deduplication deduplication);

    Deduplication getByDeduplicationIdAndRuleId(long deduplicationId, long ruleId);

    void deleteAll();

    void deleteByDeduplicationIdAndRuleId(long deduplicationId, long ruleId);

    Iterable<Deduplication> getByDeduplicationId(long id);
}
