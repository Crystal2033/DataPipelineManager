package ru.mai.lessons.rpks.mapper;

import org.mapstruct.Mapper;
import ru.mai.lessons.rpks.database.entity.EnrichmentEntity;
import ru.mai.lessons.rpks.model.Enrichment;

@Mapper
public interface EnrichmentEntityMapper {

    EnrichmentEntity toEnrichmentEntity(Enrichment enrichment);

    Enrichment toEnrichment(EnrichmentEntity enrichmentEntity);
}
