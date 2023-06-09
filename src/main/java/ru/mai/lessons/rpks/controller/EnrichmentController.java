package ru.mai.lessons.rpks.controller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import ru.mai.lessons.rpks.database.entities.Enrichment;
import ru.mai.lessons.rpks.service.EnrichmentService;

@RestController
@RequestMapping("enrichment")
public class EnrichmentController {

    private final EnrichmentService enrichmentService;

    public EnrichmentController(EnrichmentService enrichmentService) {
        this.enrichmentService = enrichmentService;
    }

    @GetMapping("/findAll")
    @Operation(summary = "Получить информацию о всех правилах обогащения в БД")
    public Iterable<Enrichment> getAllRules() {
        return enrichmentService.findAll();
    }

    @GetMapping("/findAll/{id}")
    @Operation(summary = "Получить информацию о всех правилах обогащения в БД по enrichment id")
    public Iterable<Enrichment> getAllRulesByEnrichmentId(@PathVariable long id) {
        return enrichmentService.findAllByEnrichmentId(id);
    }

    @GetMapping("/find/{enrichmentId}/{ruleId}")
    @Operation(summary = "Получить информацию о правиле обогащения по enrichment id и rule id")
    public Enrichment getRuleByEnrichmentAndRuleId(@PathVariable long enrichmentId, @PathVariable long ruleId) {
        return enrichmentService.findByEnrichmentAndRuleId(enrichmentId, ruleId);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "Удалить информацию о всех правилах обогащения")
    @Transactional
    public void deleteAllRules() {
        enrichmentService.deleteAll();
    }

    @DeleteMapping("/delete/{enrichmentId}/{ruleId}")
    @Operation(summary = "Удалить информацию по конкретному правилу обогащения с enrichment id и rule id")
    @Transactional
    public void deleteRuleByEnrichmentAndRuleId(@PathVariable long enrichmentId, @PathVariable long ruleId) {
        enrichmentService.deleteByEnrichmentAndRuleId(enrichmentId, ruleId);
    }

    @PostMapping("/save")
    @Operation(summary = "Создать правило обогащения")
    public void saveRule(@RequestBody @Valid Enrichment enrichment) {
        enrichmentService.save(enrichment);
    }

}
