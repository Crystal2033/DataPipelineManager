package ru.mai.lessons.rpks.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.data.geo.Metric;
import org.springframework.web.bind.annotation.*;
import ru.mai.lessons.rpks.model.Filter;
import ru.mai.lessons.rpks.service.FilterServiceImpl;
import ru.mai.lessons.rpks.service.Metrics;

import java.util.Collections;

@RestController
@RequestMapping("filter")
public class FilterController {

    private FilterServiceImpl serverFilter;
    private Metrics metrics;
    @GetMapping("/findAll")
    @Operation(summary = "Получить информацию о всех фильтрах в БД")
    public Iterable<Filter> getAllFilters() {
        return serverFilter.getAll();
    }

    @GetMapping("/findAll/{id}")
    @Operation(summary = "Получить информацию о всех фильтрах в БД по filter id")
    public Iterable<Filter> getAllFiltersByFilterId(@PathVariable long id) {
        return serverFilter.getByFilterId(id);
    }

    @GetMapping("/find/{filterId}/{ruleId}")
    @Operation(summary = "Получить информацию о фильтре по filter id и rule id")
    public Filter getFilterByFilterIdAndRuleId(@PathVariable long filterId, @PathVariable long ruleId) {
        return serverFilter.getByFilterIdAndRuleId(filterId, ruleId);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "Удалить информацию о всех фильтрах")
    public void deleteFilter() {
        serverFilter.deleteAll();
    }

    @DeleteMapping("/delete/{filterId}/{ruleId}")
    @Operation(summary = "Удалить информацию по конкретному фильтру filter id и rule id")
    public void deleteFilterById(@PathVariable long filterId, @PathVariable long ruleId) {
       serverFilter.deleteByFilterIdAndRuleId(filterId, ruleId);
    }

    @PostMapping("/save")
    @Operation(summary = "Создать фильтр")
    public void save(@RequestBody Filter filter) {
        serverFilter.save(filter);
        metrics.incrementFilter();
    }

}
