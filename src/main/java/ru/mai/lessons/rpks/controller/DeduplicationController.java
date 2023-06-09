package ru.mai.lessons.rpks.controller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.mai.lessons.rpks.database.entities.Deduplication;
import ru.mai.lessons.rpks.service.DeduplicationService;

@RestController
@RequestMapping("deduplication")
public class DeduplicationController {
    private final DeduplicationService deduplicationService;

    public DeduplicationController(DeduplicationService deduplicationService) {
        this.deduplicationService = deduplicationService;
    }

    @GetMapping("/findAll")
    @Operation(summary = "Получить информацию о всех правилах дедубликации в БД")
    public Iterable<Deduplication> getAllRules() {
        return deduplicationService.findAll();
    }

    @GetMapping("/findAll/{deduplicationId}")
    @Operation(summary = "Получить информацию о всех правилах дедубликации в БД по deduplication id")
    public Iterable<Deduplication> getAllRulesByDeduplicationId(@PathVariable long deduplicationId) {
        return deduplicationService.findAllByDeduplicationId(deduplicationId);
    }

    @GetMapping("/find/{deduplicationId}/{ruleId}")
    @Operation(summary = "Получить информацию о правиле дедубликации по deduplication id и rule id")
    public Deduplication getRuleByDeduplicationAndRuleId(@PathVariable long deduplicationId, @PathVariable long ruleId) {
        return deduplicationService.findByDeduplicationAndRuleId(deduplicationId, ruleId);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "Удалить информацию о всех правилах дедубликации")
    @Transactional
    public void deleteAllRules() {
        deduplicationService.deleteAll();
    }

    @DeleteMapping("/delete/{deduplicationId}/{ruleId}")
    @Operation(summary = "Удалить информацию по конкретному правилу дедубликации с deduplication id и rule id")
    @Transactional
    public void deleteRuleByDeduplicationAndRuleId(@PathVariable long deduplicationId, @PathVariable long ruleId) {
        deduplicationService.deleteByDeduplicationAndRuleId(deduplicationId, ruleId);
    }

    @PostMapping("/save")
    @ResponseStatus(value = HttpStatus.CREATED)
    @Operation(summary = "Создать правило дедубликации")
    public void saveRule(@RequestBody @Valid Deduplication deduplicationRule) {
        deduplicationService.save(deduplicationRule);
    }

}
