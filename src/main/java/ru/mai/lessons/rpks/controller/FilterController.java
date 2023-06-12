package ru.mai.lessons.rpks.controller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import ru.mai.lessons.rpks.model.Filter;
import ru.mai.lessons.rpks.repository.FilterRepository;

@RestController
@RequestMapping("filter")
public class FilterController {
    @Autowired
    private FilterRepository filterRepository;

    @GetMapping("/findAll")
    @ResponseStatus(value = HttpStatus.OK)
    @Operation(summary = "Получить информацию о всех фильтрах в БД")
    public Iterable<Filter> getAllFilters() {
        return filterRepository.findAll();
    }

    @GetMapping("/findAll/{filterId}")
    @ResponseStatus(value = HttpStatus.OK)
    @Operation(summary = "Получить информацию о всех фильтрах в БД по filter id")
    public Iterable<Filter> getAllFiltersByFilterId(@PathVariable long filterId) {
        return filterRepository.findAllFiltersByFilterId(filterId);
    }

    @GetMapping("/find/{filterId}/{ruleId}")
    @ResponseStatus(value = HttpStatus.OK)
    @Operation(summary = "Получить информацию о фильтре по filter id и rule id")
    public Filter getFilterByFilterIdAndRuleId(@PathVariable long filterId, @PathVariable long ruleId) {
        return filterRepository.findFilterByFilterIdAndRuleId(filterId, ruleId);
    }

    @DeleteMapping("/delete")
    @ResponseStatus(value = HttpStatus.OK)
    @Operation(summary = "Удалить информацию о всех фильтрах")
    public void deleteFilter() {
        filterRepository.deleteAll();
    }

    @Transactional
    @DeleteMapping("/delete/{filterId}/{ruleId}")
    @ResponseStatus(value = HttpStatus.OK)
    @Operation(summary = "Удалить информацию по конкретному фильтру filter id и rule id")
    public void deleteFilterById(@PathVariable long filterId, @PathVariable long ruleId) {
        filterRepository.deleteFilterByFilterIdAndRuleId(filterId, ruleId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Создать фильтр")
    public void save(@RequestBody @Valid Filter filter) {
        filterRepository.save(filter);
    }
}
