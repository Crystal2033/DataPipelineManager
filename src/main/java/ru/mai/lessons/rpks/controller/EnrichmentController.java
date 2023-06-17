package ru.mai.lessons.rpks.controller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.mai.lessons.rpks.model.Enrichment;
import ru.mai.lessons.rpks.repository.EnrichmentRepository;

@RestController
@RequestMapping("enrichment")
public class EnrichmentController {

    EnrichmentRepository enrichmentRepository;

    public EnrichmentController(@Autowired EnrichmentRepository enrichmentRepository) {
        this.enrichmentRepository = enrichmentRepository;
    }

    @GetMapping("/findAll")
    @Operation(summary = "Получить информацию о всех правилах обогащения в БД")
    public Iterable<Enrichment> getAllEnrichments() {
        return enrichmentRepository.findAll();
    }

    @GetMapping("/findAll/{id}")
    @Operation(summary = "Получить информацию о всех правилах обогащения в БД по enrichment id")
    public Iterable<Enrichment> getAllEnrichmentsByEnrichmentId(@PathVariable long id) {
        return enrichmentRepository.findAll(Example.of(Enrichment.builder().enrichmentId(id).build()));
    }

    @GetMapping("/find/{enrichmentId}/{ruleId}")
    @Operation(summary = "Получить информацию о правиле обогащения по enrichment id и rule id")
    public Enrichment getEnrichmentById(@PathVariable long enrichmentId, @PathVariable long ruleId) {
        return enrichmentRepository.findOne(Example.of(Enrichment.builder()
                .enrichmentId(enrichmentId).ruleId(ruleId).build())).orElse(new Enrichment());
    }

    @DeleteMapping("/delete")
    @Operation(summary = "Удалить информацию о всех правилах обогащения")
    public void deleteEnrichment() {
        enrichmentRepository.deleteAll();
    }

    @Transactional
    @DeleteMapping("/delete/{enrichmentId}/{ruleId}")
    @Operation(summary = "Удалить информацию по конкретному правилу обогащения с enrichment id и rule id")
    public void deleteEnrichmentById(@PathVariable long enrichmentId, @PathVariable long ruleId) {
        enrichmentRepository.deleteAllByEnrichmentIdAndRuleId(enrichmentId, ruleId);
    }

    @PostMapping("/save")
    @ResponseStatus(value = HttpStatus.CREATED)
    @Operation(summary = "Создать правило обогащения")
    public void save(@RequestBody @Valid Enrichment enrichment) {
        enrichmentRepository.save(enrichment);
    }

}
