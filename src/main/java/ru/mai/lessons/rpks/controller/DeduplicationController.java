package ru.mai.lessons.rpks.controller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.mai.lessons.rpks.model.Deduplication;
import ru.mai.lessons.rpks.repository.DeduplicationRepository;

@RestController
@RequestMapping("deduplication")
public class DeduplicationController {

    @Autowired
    private DeduplicationRepository deduplicationRepository;

    @GetMapping("/findAll")
    @ResponseStatus(value = HttpStatus.OK)
    @Operation(summary = "Получить информацию о всех правилах дедубликации в БД")
    public Iterable<Deduplication> getAllDeduplications() {
        return deduplicationRepository.findAll();
    }

    @GetMapping("/findAll/{deduplicationId}")
    @ResponseStatus(value = HttpStatus.OK)
    @Operation(summary = "Получить информацию о всех правилах дедубликации в БД по deduplication id")
    public Iterable<Deduplication> getAllDeduplicationsByDeduplicationId(@PathVariable long deduplicationId) {
        return deduplicationRepository.findAllDeduplicationByDeduplicationId(deduplicationId);
    }

    @GetMapping("/find/{deduplicationId}/{ruleId}")
    @ResponseStatus(value = HttpStatus.OK)
    @Operation(summary = "Получить информацию о правиле дедубликации по deduplication id и rule id")
    public Deduplication getDeduplicationById(@PathVariable long deduplicationId, @PathVariable long ruleId) {
        return deduplicationRepository.findDeduplicationByDeduplicationIdAndRuleId(deduplicationId, ruleId);
    }

    @DeleteMapping("/delete")
    @ResponseStatus(value = HttpStatus.OK)
    @Operation(summary = "Удалить информацию о всех правилах дедубликации")
    public void deleteDeduplication() {
        deduplicationRepository.deleteAll();
    }

    @Transactional
    @DeleteMapping("/delete/{deduplicationId}/{ruleId}")
    @ResponseStatus(value = HttpStatus.OK)
    @Operation(summary = "Удалить информацию по конкретному правилу дедубликации с deduplication id и rule id")
    public void deleteDeduplicationById(@PathVariable long deduplicationId, @PathVariable long ruleId) {
        deduplicationRepository.deleteDeduplicationByDeduplicationIdAndRuleId(deduplicationId, ruleId);
    }

    @PostMapping("/save")
    @ResponseStatus(value = HttpStatus.CREATED)
    @Operation(summary = "Создать правило дедубликации")
    public void save(@RequestBody @Valid Deduplication deduplication) {
        deduplicationRepository.save(deduplication);
    }
}
