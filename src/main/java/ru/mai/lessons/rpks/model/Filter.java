package ru.mai.lessons.rpks.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "filter_rules")
public class Filter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Min(value = 1)
    private long id;
    @Min(value = 1)
    private long filterId;
    @Min(value = 1)
    private long ruleId;
    @NotNull
    @NotBlank(message = "fieldName is required")
    private String fieldName;
    @NotNull
    @NotBlank(message = "filterFunctionName is required")
    private String filterFunctionName;
    @NotNull
    @NotBlank(message = "filterValue is required")
    private String filterValue;
}
