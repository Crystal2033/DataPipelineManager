package ru.mai.lessons.rpks.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.mai.lessons.rpks.database.entity.DeduplicationEntity;
import ru.mai.lessons.rpks.model.Deduplication;

@Mapper
public interface DeduplicationEntityMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "deduplicationId", target = "deduplicationId")
    @Mapping(source = "ruleId", target = "ruleId")
    @Mapping(source = "fieldName", target = "fieldName")
    @Mapping(source = "timeToLiveSec", target = "timeToLiveSec")
    @Mapping(source = "active", target = "active")
    Deduplication toDeduplication(DeduplicationEntity deduplicationEntity);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "deduplicationId", target = "deduplicationId")
    @Mapping(source = "ruleId", target = "ruleId")
    @Mapping(source = "fieldName", target = "fieldName")
    @Mapping(source = "timeToLiveSec", target = "timeToLiveSec")
    @Mapping(source = "active", target = "active")
    DeduplicationEntity toDeduplicationEntity(Deduplication deduplication);
}
