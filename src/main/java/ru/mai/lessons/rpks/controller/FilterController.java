package ru.mai.lessons.rpks.controller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.mai.lessons.rpks.model.Filter;
import ru.mai.lessons.rpks.repository.FilterRepository;

@RestController
@RequestMapping("filter")
public class FilterController {

    FilterRepository repository;

    FilterController(@Autowired FilterRepository repo){
        repository = repo;
    }

    @GetMapping("/findAll")
    @Operation(summary = "Получить информацию о всех фильтрах в БД")
    public Iterable<Filter> getAllFilters() {
        return repository.findAll();
    }

    @GetMapping("/findAll/{id}")
    @Operation(summary = "Получить информацию о всех фильтрах в БД по filter id")
    public Iterable<Filter> getAllFiltersByFilterId(@PathVariable long id) {
        return repository.findAllFilterByFilterId(id);
    }

    @GetMapping("/find/{filterId}/{ruleId}")
    @Operation(summary = "Получить информацию о фильтре по filter id и rule id")
    public Filter getFilterByFilterIdAndRuleId(@PathVariable long filterId, @PathVariable long ruleId) {
        return repository.findFilterByFilterIdAndRuleId(filterId, ruleId);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "Удалить информацию о всех фильтрах")
    public void deleteFilter() {
        repository.deleteAll();
    }

    @DeleteMapping("/delete/{filterId}/{ruleId}")
    @Transactional
    @Operation(summary = "Удалить информацию по конкретному фильтру filter id и rule id")
    public void deleteFilterById(@PathVariable long filterId, @PathVariable long ruleId) {
        repository.deleteFilterByFilterIdAndRuleId(filterId, ruleId);
    }

    @PostMapping("/save")
    @ResponseStatus(value = HttpStatus.CREATED)
    @Operation(summary = "Создать фильтр")
    public void save(@RequestBody @Valid Filter filter) {
        repository.save(filter);
    }

}
