package ru.mai.lessons.rpks.controller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.mai.lessons.rpks.model.Filter;
import ru.mai.lessons.rpks.service.FilterService;

@RestController
@RequestMapping("filter")
public class FilterController {
    @Autowired
    FilterService filterService;

    @GetMapping("/findAll")
    @Operation(summary = "Получить информацию о всех фильтрах в БД")
    @ResponseStatus(value = HttpStatus.OK)
    public Iterable<Filter> getAllFilters() {
        return filterService.getFilters();
    }

    @GetMapping("/findAll/{id}")
    @Operation(summary = "Получить информацию о всех фильтрах в БД по filter id")
    @ResponseStatus(value = HttpStatus.OK)
    public Iterable<Filter> getAllFiltersByFilterId(@PathVariable long id) {
        return filterService.getFiltersById(id);
    }

    @GetMapping("/find/{filterId}/{ruleId}")
    @Operation(summary = "Получить информацию о фильтре по filter id и rule id")
    @ResponseStatus(value = HttpStatus.OK)
    public Filter getFilterByFilterIdAndRuleId(@PathVariable long filterId, @PathVariable long ruleId) {
        return filterService.getFilterByIdAndRuleId(filterId, ruleId);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "Удалить информацию о всех фильтрах")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public void deleteFilter() {
        filterService.deleteAllFilters();
    }

    @DeleteMapping("/delete/{filterId}/{ruleId}")
    @Operation(summary = "Удалить информацию по конкретному фильтру filter id и rule id")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public void deleteFilterById(@PathVariable long filterId, @PathVariable long ruleId) {
        filterService.deleteFilterByIdAndRuleId(filterId, ruleId);
    }

    @PostMapping("/save")
    @Operation(summary = "Создать фильтр")
    @ResponseStatus(value = HttpStatus.CREATED)
    public void save(@RequestBody @Valid Filter filter) {
        filterService.save(filter);
    }

}
