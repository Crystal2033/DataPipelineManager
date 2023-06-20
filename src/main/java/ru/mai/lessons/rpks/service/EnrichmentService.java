package ru.mai.lessons.rpks.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.database.entity.EnrichmentEntity;
import ru.mai.lessons.rpks.database.repository.EnrichmentRepository;
import ru.mai.lessons.rpks.exception.EnrichmentAlreadyExistException;
import ru.mai.lessons.rpks.mapper.EnrichmentEntityMapper;
import ru.mai.lessons.rpks.model.Enrichment;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class EnrichmentService {
    private final EnrichmentRepository enrichmentRepository;
    private final EnrichmentEntityMapper mapper = Mappers.getMapper(EnrichmentEntityMapper.class);

    public List<Enrichment> getAll() {
        List<EnrichmentEntity> enrichmentEntityList = enrichmentRepository.findAll();
        return enrichmentEntityList.stream()
                .map(mapper::toEnrichment)
                .toList();
    }

    public List<Enrichment> findAllById(Long id) {

        List<EnrichmentEntity> enrichmentEntityList = enrichmentRepository.findEnrichmentEntitiesByEnrichmentId(id);
        return enrichmentEntityList.stream()
                .map(mapper::toEnrichment)
                .toList();

    }

    public Enrichment findByIdAndRuleId(Long id, Long ruleId) {
        return mapper.toEnrichment(enrichmentRepository.findEnrichmentByEnrichmentIdAndRuleId(id, ruleId));
    }

    public void deleteAll() {
        enrichmentRepository.deleteAll();
    }

    @Transactional
    public void deleteByIdAndRuleId(long enrichmentId, long ruleId) {
        enrichmentRepository.deleteByEnrichmentIdAndRuleId(enrichmentId, ruleId);
    }

    public void addOne(Enrichment enrichment) throws EnrichmentAlreadyExistException {
        if (enrichmentRepository.existsById(enrichment.getId())) {
            throw new EnrichmentAlreadyExistException();
        }
        enrichmentRepository.save(mapper.toEnrichmentEntity(enrichment));

    }
}
