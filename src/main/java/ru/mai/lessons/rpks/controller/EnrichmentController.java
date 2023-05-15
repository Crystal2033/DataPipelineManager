package ru.mai.lessons.rpks.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.mai.lessons.rpks.model.Enrichment;
import ru.mai.lessons.rpks.service.EnrichmentService;

import java.util.Collections;

@RestController
@RequiredArgsConstructor
@RequestMapping("enrichment")
public class EnrichmentController {
    private final EnrichmentService enrichmentService;

    @GetMapping("/findAll")
    @Operation(summary = "Получить информацию о всех правилах обогащения в БД")
    public Iterable<Enrichment> getAllEnrichments() {
        return enrichmentService.getAll();
    }

    @GetMapping("/findAll/{id}")
    @Operation(summary = "Получить информацию о всех правилах обогащения в БД по enrichment id")
    public Iterable<Enrichment> getAllEnrichmentsByEnrichmentId(@PathVariable long id) {
        return enrichmentService.getAllByEnrichmentId(id);
    }

    @GetMapping("/find/{enrichmentId}/{ruleId}")
    @Operation(summary = "Получить информацию о правиле обогащения по enrichment id и rule id")
    public Enrichment getEnrichmentById(@PathVariable long enrichmentId, @PathVariable long ruleId) {
        return enrichmentService.getByEnrichmentIdRuleId(enrichmentId, ruleId);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "Удалить информацию о всех правилах обогащения")
    public void deleteEnrichment() {
        enrichmentService.deleteAll();
    }

    @DeleteMapping("/delete/{enrichmentId}/{ruleId}")
    @Operation(summary = "Удалить информацию по конкретному правилу обогащения с enrichment id и rule id")
    public void deleteEnrichmentById(@PathVariable long enrichmentId, @PathVariable long ruleId) {
        enrichmentService.deleteByEnrichmentIdAndRuleId(enrichmentId, ruleId);
    }

    @PostMapping("/save")
    @Operation(summary = "Создать правило обогащения")
    public void save(@RequestBody Enrichment enrichment) {
        enrichmentService.save(enrichment);
    }

}
