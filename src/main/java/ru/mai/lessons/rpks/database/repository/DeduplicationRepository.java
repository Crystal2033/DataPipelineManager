package ru.mai.lessons.rpks.database.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.mai.lessons.rpks.database.entities.Deduplication;

@Repository
public interface DeduplicationRepository extends CrudRepository<Deduplication, Long> {
}
