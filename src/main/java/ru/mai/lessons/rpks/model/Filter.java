package ru.mai.lessons.rpks.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "filter_rules")
public class Filter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Min(value = 1)
    private Long id;
    @Min(value = 1)
    private Long filterId;
    @Min(value = 1)
    private Long ruleId;
    @NotBlank
    private String fieldName;
    @NotBlank
    private String filterFunctionName;
    @NotBlank
    private String filterValue;
    public Filter(long id, long filterId, long ruleId, String fieldName, String filterFunctionName, String filterValue) {
        this.id = id;
        this.filterId = filterId;
        this.ruleId = ruleId;
        this.fieldName = fieldName;
        this.filterFunctionName = filterFunctionName;
        this.filterValue = filterValue;
    }
}
