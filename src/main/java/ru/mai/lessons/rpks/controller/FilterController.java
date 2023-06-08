package ru.mai.lessons.rpks.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;
import ru.mai.lessons.rpks.database.entities.Filter;

import java.util.Collections;

@RestController
@RequestMapping("filter")
public class FilterController {

    @GetMapping("/findAll")
    @Operation(summary = "Получить информацию о всех фильтрах в БД")
    public Iterable<Filter> getAllRules() {
        //TODO code here...
        return Collections.emptyList();
    }

    @GetMapping("/findAll/{id}")
    @Operation(summary = "Получить информацию о всех фильтрах в БД по filter id")
    public Iterable<Filter> getAllRulesByFilterId(@PathVariable long id) {
        //TODO code here...
        return Collections.emptyList();
    }

    @GetMapping("/find/{filterId}/{ruleId}")
    @Operation(summary = "Получить информацию о фильтре по filter id и rule id")
    public Filter getRuleByFilterIdAndRuleId(@PathVariable long filterId, @PathVariable long ruleId) {
        //TODO code here...
        return new Filter();
    }

    @DeleteMapping("/delete")
    @Operation(summary = "Удалить информацию о всех фильтрах")
    public void deleteAllRules() {
        //TODO code here...
    }

    @DeleteMapping("/delete/{filterId}/{ruleId}")
    @Operation(summary = "Удалить информацию по конкретному фильтру filter id и rule id")
    public void deleteRuleById(@PathVariable long filterId, @PathVariable long ruleId) {
        //TODO code here...
    }

    @PostMapping("/save")
    @Operation(summary = "Создать фильтр")
    public void saveRule(@RequestBody Filter filter) {
        //TODO code here...
    }

}
