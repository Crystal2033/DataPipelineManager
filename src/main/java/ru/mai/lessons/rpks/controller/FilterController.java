package ru.mai.lessons.rpks.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.mai.lessons.rpks.model.Filter;
import ru.mai.lessons.rpks.service.FilterServiceImpl;

@RestController
@RequestMapping("filter")
@RequiredArgsConstructor
public class FilterController {

    private final FilterServiceImpl serverFilter;

    @GetMapping("/findAll")
    @ResponseStatus(value = HttpStatus.OK)
    @Operation(summary = "Получить информацию о всех фильтрах в БД")
    public Iterable<Filter> getAllFilters() {
        return serverFilter.getAll();
    }

    @GetMapping("/findAll/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    @Operation(summary = "Получить информацию о всех фильтрах в БД по filter id")
    public Iterable<Filter> getAllFiltersByFilterId(@PathVariable long id) {
        return serverFilter.getByFilterId(id);
    }

    @GetMapping("/find/{filterId}/{ruleId}")
    @ResponseStatus(value = HttpStatus.OK)
    @Operation(summary = "Получить информацию о фильтре по filter id и rule id")
    public Filter getFilterByFilterIdAndRuleId(@PathVariable long filterId, @PathVariable long ruleId) {
        return serverFilter.getByFilterIdAndRuleId(filterId, ruleId);
    }

    @DeleteMapping("/delete")
    @ResponseStatus(value = HttpStatus.OK)
    @Operation(summary = "Удалить информацию о всех фильтрах")
    public void deleteFilter() {
        serverFilter.deleteAll();
    }

    @DeleteMapping("/delete/{filterId}/{ruleId}")
    @ResponseStatus(value = HttpStatus.OK)
    @Operation(summary = "Удалить информацию по конкретному фильтру filter id и rule id")
    public void deleteFilterById(@PathVariable long filterId, @PathVariable long ruleId) {
       serverFilter.deleteByFilterIdAndRuleId(filterId, ruleId);
    }

    @PostMapping("/save")
    @Operation(summary = "Создать фильтр")
    @ResponseStatus(value = HttpStatus.CREATED)

    public void save(@RequestBody Filter filter) {
        serverFilter.save(filter);
    }

}
