package ru.mai.lessons.rpks.controller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import ru.mai.lessons.rpks.model.Enrichment;
import ru.mai.lessons.rpks.repository.EnrichmentRepository;

@RestController
@RequestMapping("enrichment")
public class EnrichmentController {

    @Autowired
    private EnrichmentRepository enrichmentRepository;

    @GetMapping("/findAll")
    @ResponseStatus(value = HttpStatus.OK)
    @Operation(summary = "Получить информацию о всех правилах обогащения в БД")
    public Iterable<Enrichment> getAllEnrichments() {
        return enrichmentRepository.findAll();
    }

    @GetMapping("/findAll/{enrichmentId}")
    @ResponseStatus(value = HttpStatus.OK)
    @Operation(summary = "Получить информацию о всех правилах обогащения в БД по enrichment id")
    public Iterable<Enrichment> getAllEnrichmentsByEnrichmentId(@PathVariable long enrichmentId) {
        return enrichmentRepository.findAllEnrichmentsByEnrichmentId(enrichmentId);
    }

    @GetMapping("/find/{enrichmentId}/{ruleId}")
    @ResponseStatus(value = HttpStatus.OK)
    @Operation(summary = "Получить информацию о правиле обогащения по enrichment id и rule id")
    public Enrichment getEnrichmentById(@PathVariable long enrichmentId, @PathVariable long ruleId) {
        return enrichmentRepository.findEnrichmentByEnrichmentIdAndRuleId(enrichmentId, ruleId);
    }

    @DeleteMapping("/delete")
    @ResponseStatus(value = HttpStatus.OK)
    @Operation(summary = "Удалить информацию о всех правилах обогащения")
    public void deleteEnrichment() {
        enrichmentRepository.deleteAll();
    }

    @Transactional
    @DeleteMapping("/delete/{enrichmentId}/{ruleId}")
    @ResponseStatus(value = HttpStatus.OK)
    @Operation(summary = "Удалить информацию по конкретному правилу обогащения с enrichment id и rule id")
    public void deleteEnrichmentById(@PathVariable long enrichmentId, @PathVariable long ruleId) {
        enrichmentRepository.deleteEnrichmentByEnrichmentIdAndRuleId(enrichmentId, ruleId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Создать правило обогащения")
    public void save(@RequestBody @Valid Enrichment enrichment) {
        enrichmentRepository.save(enrichment);
    }

}
