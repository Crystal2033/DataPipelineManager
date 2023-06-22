package ru.mai.lessons.rpks.service.impl;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.mai.lessons.rpks.service.EnrichmentService;
import ru.mai.lessons.rpks.model.Enrichment;
import ru.mai.lessons.rpks.repositories.EnrichmentRepository;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class EnrichmentServiceImpl implements EnrichmentService {

    private final EnrichmentRepository enrichmentRepository;
    @Override
    public List<Enrichment> getAllEnrichments() {
        log.debug("get all enrichments by id from db");
        return enrichmentRepository.findAll();
    }

    @Override
    public List<Enrichment> getAllEnrichmentsByEnrichmentId(long enrichmentId) {
        log.debug("get enrichment by enrichmentId and ruleId");
        return enrichmentRepository.getAllByEnrichmentId(enrichmentId);
    }

    @Override
    public Enrichment getEnrichmentById(long enrichmentId, long ruleId) {
        log.debug("get enrichment by enrichmentId and ruleId");
        return enrichmentRepository.getEnrichmentByEnrichmentIdAndRuleId(enrichmentId, ruleId);
    }

    @Override
    public void deleteEnrichment() {
        log.debug("delete all enrichments from db");
        enrichmentRepository.deleteAll();
    }

    @Override
    public void deleteEnrichmentById(long enrichmentId, long ruleId) {
        log.debug("get enrichment by enrichmentId and ruleId from db");
        enrichmentRepository.deleteAllByEnrichmentIdAndRuleId(enrichmentId, ruleId);
    }

    @Override
    public void save(Enrichment enrichment) {
        log.debug("save new enrichment in db");
        enrichmentRepository.save(enrichment);
    }
}
