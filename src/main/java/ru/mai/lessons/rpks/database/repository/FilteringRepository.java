package ru.mai.lessons.rpks.database.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.mai.lessons.rpks.database.entities.Filter;

@Repository
public interface FilteringRepository extends CrudRepository<Filter, Long> {

}
