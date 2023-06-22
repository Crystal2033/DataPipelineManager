package ru.mai.lessons.rpks.controller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import ru.mai.lessons.rpks.model.Filter;
import ru.mai.lessons.rpks.service.FilterService;

@RestController
@RequestMapping("filter")
public class FilterController {
    public FilterService filterService;

    @GetMapping("/findAll")
    @Operation(summary = "Получить информацию о всех фильтрах в БД")
    public Iterable<Filter> getAllFilters() {
        return filterService.getAllFilters();
    }

    @GetMapping("/findAll/{id}")
    @Operation(summary = "Получить информацию о всех фильтрах в БД по filter id")
    public Iterable<Filter> getAllFiltersByFilterId(@PathVariable long id) {
        return filterService.getAllFiltersByFilterId(id);
    }

    @GetMapping("/find/{filterId}/{ruleId}")
    @Operation(summary = "Получить информацию о фильтре по filter id и rule id")
    public Filter getFilterByFilterIdAndRuleId(@PathVariable long filterId, @PathVariable long ruleId) {
        return filterService.getFilterByFilterIdAndRuleId(filterId, ruleId);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "Удалить информацию о всех фильтрах")
    public void deleteFilter() {
        filterService.deleteAll();
    }

    @DeleteMapping("/delete/{filterId}/{ruleId}")
    @Operation(summary = "Удалить информацию по конкретному фильтру filter id и rule id")
    public void deleteFilterById(@PathVariable long filterId, @PathVariable long ruleId) {
        filterService.deleteByFilterIdAndRuleId(filterId, ruleId);
    }

    @PostMapping("/save")
    @Operation(summary = "Создать фильтр")
    public void save(@RequestBody @Valid Filter filter) {
        filterService.save(filter);
    }

}
