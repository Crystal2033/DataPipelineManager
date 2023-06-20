package ru.mai.lessons.rpks.mapper;

import org.mapstruct.Mapper;
import ru.mai.lessons.rpks.database.entity.FilterEntity;
import ru.mai.lessons.rpks.model.Filter;

@Mapper
public interface FilterEntityMapper {

    Filter toFilter(FilterEntity filterEntity);

    FilterEntity toFilterEntity(Filter filter);


}
