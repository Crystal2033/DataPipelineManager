package ru.mai.lessons.rpks.mapper;

import org.mapstruct.Mapper;
import ru.mai.lessons.rpks.database.entity.DeduplicationEntity;
import ru.mai.lessons.rpks.model.Deduplication;

@Mapper
public interface DeduplicationEntityMapper {

    Deduplication toDeduplication(DeduplicationEntity deduplicationEntity);

    DeduplicationEntity toDeduplicationEntity(Deduplication deduplication);
}
