package ru.mai.lessons.rpks.service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.model.Deduplication;
import ru.mai.lessons.rpks.repository.DeduplicationRepository;


@Service
@NoArgsConstructor
@Getter
public class DeduplicationService {
    @Autowired
    private DeduplicationRepository deduplicationRepository;

    public Iterable<Deduplication> getAllDeduplications() {
        return deduplicationRepository.findAll();
    }

    public void deleteDeduplication() {
        deduplicationRepository.deleteAll();
    }

    public void save(Deduplication deduplication) {
        deduplicationRepository.save(deduplication);
    }

    public Iterable<Deduplication> getAllDeduplicationsByDeduplicationId(long id) {
        return deduplicationRepository.getAllByDeduplicationId(id);
    }

    public Deduplication getDeduplicationById(long deduplicationId, long ruleId) {
        return deduplicationRepository.getDeduplicationByDeduplicationIdAndRuleId(deduplicationId, ruleId);
    }

    public void deleteDeduplicationById(long deduplicationId, long ruleId) {
        deduplicationRepository.deleteDeduplicationByDeduplicationIdAndRuleId(deduplicationId, ruleId);
    }
}
