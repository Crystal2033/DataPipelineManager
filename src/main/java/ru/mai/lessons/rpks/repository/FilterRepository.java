package ru.mai.lessons.rpks.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.mai.lessons.rpks.model.Filter;

@Repository
public interface FilterRepository extends CrudRepository<Filter, Long> {
}
