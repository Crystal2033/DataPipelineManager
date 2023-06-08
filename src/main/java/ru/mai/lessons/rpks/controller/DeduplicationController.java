package ru.mai.lessons.rpks.controller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.mai.lessons.rpks.database.entities.Deduplication;

import java.util.Collections;

@RestController
@RequestMapping("deduplication")
public class DeduplicationController {


    @GetMapping("/findAll")
    @Operation(summary = "Получить информацию о всех правилах дедубликации в БД")
    public Iterable<Deduplication> getAllDeduplications() {
        //TODO code here...
        return Collections.emptyList();
    }

    @GetMapping("/findAll/{id}")
    @Operation(summary = "Получить информацию о всех правилах дедубликации в БД по deduplication id")
    public Iterable<Deduplication> getAllDeduplicationsByDeduplicationId(@PathVariable long id) {
        //TODO code here...
        return Collections.emptyList();
    }

    @GetMapping("/find/{deduplicationId}/{ruleId}")
    @Operation(summary = "Получить информацию о правиле дедубликации по deduplication id и rule id")
    public Deduplication getDeduplicationById(@PathVariable long deduplicationId, @PathVariable long ruleId) {
        //TODO code here...
        return new Deduplication();
    }

    @DeleteMapping("/delete")
    @Operation(summary = "Удалить информацию о всех правилах дедубликации")
    public void deleteDeduplication() {
        //TODO code here...
    }

    @Transactional
    @DeleteMapping("/delete/{deduplicationId}/{ruleId}")
    @Operation(summary = "Удалить информацию по конкретному правилу дедубликации с deduplication id и rule id")
    public void deleteDeduplicationById(@PathVariable long deduplicationId, @PathVariable long ruleId) {
        //TODO code here...
    }

    @PostMapping("/save")
    @ResponseStatus(value = HttpStatus.CREATED)
    @Operation(summary = "Создать правило дедубликации")
    public void save(@RequestBody @Valid Deduplication deduplication) {
        //TODO code here...
    }

}
