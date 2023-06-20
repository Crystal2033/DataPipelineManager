package ru.mai.lessons.rpks.service;


import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.database.entity.DeduplicationEntity;
import ru.mai.lessons.rpks.database.repository.DeduplicationRepository;
import ru.mai.lessons.rpks.exception.DeduplicationAlreadyExistException;
import ru.mai.lessons.rpks.mapper.DeduplicationEntityMapper;
import ru.mai.lessons.rpks.model.Deduplication;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class DeduplicationService {
    private final DeduplicationEntityMapper mapper = Mappers.getMapper(DeduplicationEntityMapper.class);

    private final DeduplicationRepository deduplicationRepository;

    public List<Deduplication> getAll() {
        List<DeduplicationEntity> deduplicationEntityList = deduplicationRepository.findAll();
        return deduplicationEntityList.stream()
                .map(mapper::toDeduplication)
                .toList();
    }

    public List<Deduplication> findAllById(Long id) {

        List<DeduplicationEntity> deduplicationEntityList = deduplicationRepository.findDeduplicationEntitiesByDeduplicationId(id);
        return deduplicationEntityList.stream()
                .map(mapper::toDeduplication)
                .toList();

    }

    public Deduplication findByIdAndRuleId(Long id, Long ruleId) {
        DeduplicationEntity d = deduplicationRepository.findDeduplicationEntityByDeduplicationIdAndRuleId(id, ruleId);
        Deduplication d1 = mapper.toDeduplication(d);
        log.info(d.getId() + " : " + d1.getId());
        log.info(d.getFieldName() + " : " + d1.getFieldName());
        log.info(d.getDeduplicationId() + " : " + d1.getDeduplicationId());
        return d1;
    }

    public void deleteAll() {
        deduplicationRepository.deleteAll();
    }

    @Transactional
    public void deleteByIdAndRuleId(long filterId, long ruleId) {
        deduplicationRepository.deleteByDeduplicationIdAndRuleId(filterId, ruleId);
    }

    public void addOne(Deduplication deduplication) throws DeduplicationAlreadyExistException {
        if (deduplicationRepository.existsById(deduplication.getId())) {
            throw new DeduplicationAlreadyExistException();
        }

        deduplicationRepository.save(mapper.toDeduplicationEntity(deduplication));

    }

}
