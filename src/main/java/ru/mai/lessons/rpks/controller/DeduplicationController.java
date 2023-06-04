package ru.mai.lessons.rpks.controller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.mai.lessons.rpks.model.Deduplication;
import ru.mai.lessons.rpks.service.DeduplicationService;


@RestController
@RequestMapping("deduplication")
public class DeduplicationController {
    @Autowired
    DeduplicationService deduplicationService;

    @GetMapping("/findAll")
    @Operation(summary = "Получить информацию о всех правилах дедубликации в БД")
    @ResponseStatus(value = HttpStatus.OK)
    public Iterable<Deduplication> getAllDeduplications() {
        return deduplicationService.getDeduplications();
    }

    @GetMapping("/findAll/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    @Operation(summary = "Получить информацию о всех правилах дедубликации в БД по deduplication id")
    public Iterable<Deduplication> getAllDeduplicationsByDeduplicationId(@PathVariable long id) {
        return deduplicationService.getDeduplicationsByDeduplicationId(id);
    }

    @GetMapping("/find/{deduplicationId}/{ruleId}")
    @ResponseStatus(value = HttpStatus.OK)
    @Operation(summary = "Получить информацию о правиле дедубликации по deduplication id и rule id")
    public Deduplication getDeduplicationById(@PathVariable long deduplicationId, @PathVariable long ruleId) {
        return deduplicationService.getDeduplicationByIdAndRuleId(deduplicationId, ruleId);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "Удалить информацию о всех правилах дедубликации")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public void deleteDeduplication() {
        deduplicationService.deleteDeduplications();
    }

    @Transactional
    @DeleteMapping("/delete/{deduplicationId}/{ruleId}")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    @Operation(summary = "Удалить информацию по конкретному правилу дедубликации с deduplication id и rule id")
    public void deleteDeduplicationById(@PathVariable long deduplicationId, @PathVariable long ruleId) {
        deduplicationService.deleteDeduplicationByDeduplicationIdAndRuleId(deduplicationId, ruleId);
    }

    @PostMapping("/save")
    @ResponseStatus(value = HttpStatus.CREATED)
    @Operation(summary = "Создать правило дедубликации")
    public void save(@RequestBody @Valid Deduplication deduplication) {
        deduplicationService.save(deduplication);
    }

}
