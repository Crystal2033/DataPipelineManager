package ru.mai.lessons.rpks.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.mai.lessons.rpks.model.Filter;

import java.util.List;
import java.util.Optional;

@Repository
public interface FilterRepository extends CrudRepository<Filter, Long> {
    //@Query("select * from Filter d where filterId = :filterId and ruleId = :ruleId")
    /*Optional<Filter> findByFilterIdAndRuleId(@Param("filterId") long filterId,
                                             @Param("ruleId") long ruleId);*/

    Optional<Filter> findByFilterIdAndRuleId(long filterId, long ruleId);
    //Optional<Filter> findByFilterIdAndRuleId(long filterId, long ruleId);

    void deleteByFilterIdAndRuleId(long filterId, long ruleId);

    List<Filter> findByFilterId(long filterId);
}


