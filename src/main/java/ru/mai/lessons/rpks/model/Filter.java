package ru.mai.lessons.rpks.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.mai.lessons.rpks.validation.ValidateFilterFunctionName;

@Entity
@Table(name = "filter_rules")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Filter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Min(value = 1)
    private long filterId;

    @Min(value = 1)
    private long ruleId;

    @NotBlank(message = "fieldName is required")
    @NotNull
    private String fieldName;

    //custom annotation
    @ValidateFilterFunctionName
    private String filterFunctionName;

    @NotBlank(message = "filterValue is required")
    @NotNull
    private String filterValue;
}

