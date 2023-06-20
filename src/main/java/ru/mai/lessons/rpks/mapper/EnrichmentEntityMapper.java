package ru.mai.lessons.rpks.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.mai.lessons.rpks.database.entity.EnrichmentEntity;
import ru.mai.lessons.rpks.model.Enrichment;

@Mapper
public interface EnrichmentEntityMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "enrichmentId", target = "enrichmentId")
    @Mapping(source = "ruleId", target = "ruleId")
    @Mapping(source = "fieldName", target = "fieldName")
    @Mapping(source = "fieldNameEnrichment", target = "fieldNameEnrichment")
    @Mapping(source = "fieldValue", target = "fieldValue")
    @Mapping(source = "fieldValueDefault", target = "fieldValueDefault")
    EnrichmentEntity toEnrichmentEntity(Enrichment enrichment);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "enrichmentId", target = "enrichmentId")
    @Mapping(source = "ruleId", target = "ruleId")
    @Mapping(source = "fieldName", target = "fieldName")
    @Mapping(source = "fieldNameEnrichment", target = "fieldNameEnrichment")
    @Mapping(source = "fieldValue", target = "fieldValue")
    @Mapping(source = "fieldValueDefault", target = "fieldValueDefault")
    Enrichment toEnrichment(EnrichmentEntity enrichmentEntity);
}
