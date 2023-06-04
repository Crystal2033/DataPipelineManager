package ru.mai.lessons.rpks.service;

import jakarta.transaction.Transactional;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.model.Deduplication;
import ru.mai.lessons.rpks.repository.DeduplicationRepository;

@Service
@RequiredArgsConstructor
@Getter
public class DeduplicationService {
    @Autowired
    private DeduplicationRepository deduplicationRepository;

    public void save(Deduplication deduplication){
        deduplicationRepository.save(deduplication);
    }
    public Deduplication getDeduplicationByIdAndRuleId(long id, long ruleId) {
        return deduplicationRepository.findDeduplicationByDeduplicationIdAndRuleId(id, ruleId);
    }

    public void deleteDeduplications() {
        deduplicationRepository.deleteAll();
    }

    public Iterable<Deduplication> getDeduplicationsByDeduplicationId(long id) {
        return deduplicationRepository.findDeduplicationsByDeduplicationId(id);
    }

    public Iterable<Deduplication> getDeduplications() {
        return deduplicationRepository.findAll();
    }
    @Transactional
    public void deleteDeduplicationByDeduplicationIdAndRuleId(long deduplicationId, long ruleId) {
        deduplicationRepository.deleteDeduplicationByDeduplicationIdAndRuleId(deduplicationId, ruleId);
    }
}
