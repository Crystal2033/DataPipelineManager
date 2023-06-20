package ru.mai.lessons.rpks.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.mai.lessons.rpks.database.entity.FilterEntity;
import ru.mai.lessons.rpks.model.Filter;

@Mapper
public interface FilterEntityMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "filterId", target = "filterId")
    @Mapping(source = "ruleId", target = "ruleId")
    @Mapping(source = "fieldName", target = "fieldName")
    @Mapping(source = "filterFunctionName", target = "filterFunctionName")
    @Mapping(source = "filterValue", target = "filterValue")
    Filter toFilter(FilterEntity filterEntity);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "filterId", target = "filterId")
    @Mapping(source = "ruleId", target = "ruleId")
    @Mapping(source = "fieldName", target = "fieldName")
    @Mapping(source = "filterFunctionName", target = "filterFunctionName")
    @Mapping(source = "filterValue", target = "filterValue")
    FilterEntity toFilterEntity(Filter filter);


}
