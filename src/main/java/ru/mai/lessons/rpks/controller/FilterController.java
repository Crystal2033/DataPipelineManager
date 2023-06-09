package ru.mai.lessons.rpks.controller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import ru.mai.lessons.rpks.database.entities.Filter;
import ru.mai.lessons.rpks.service.FilteringService;

@RestController
@RequestMapping("filter")
public class FilterController {

    private final FilteringService filteringService;

    public FilterController(FilteringService filteringService) {
        this.filteringService = filteringService;
    }

    @GetMapping("/findAll")
    @Operation(summary = "Получить информацию о всех фильтрах в БД")
    public Iterable<Filter> getAllRules() {
        return filteringService.findAll();
    }

    @GetMapping("/findAll/{filterId}")
    @Operation(summary = "Получить информацию о всех фильтрах в БД по filter id")
    public Iterable<Filter> getAllRulesByFilterId(@PathVariable long filterId) {
        return filteringService.findAllByFilterId(filterId);
    }

    @GetMapping("/find/{filterId}/{ruleId}")
    @Operation(summary = "Получить информацию о фильтре по filter id и rule id")
    public Filter getRuleByFilterIdAndRuleId(@PathVariable long filterId, @PathVariable long ruleId) {
        return filteringService.findByFilterAndRuleId(filterId, ruleId);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "Удалить информацию о всех фильтрах")
    @Transactional
    public void deleteAllRules() {
        filteringService.deleteAll();
    }

    @DeleteMapping("/delete/{filterId}/{ruleId}")
    @Operation(summary = "Удалить информацию по конкретному фильтру filter id и rule id")
    @Transactional
    public void deleteRuleById(@PathVariable long filterId, @PathVariable long ruleId) {
        filteringService.deleteByFilterAndRuleId(filterId, ruleId);
    }

    @PostMapping("/save")
    @Operation(summary = "Создать фильтр")
    public void saveRule(@RequestBody @Valid Filter filter) {
        filteringService.save(filter);
    }

}
