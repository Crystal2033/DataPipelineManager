package ru.mai.lessons.rpks.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "filter_rules")
public class Filter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Min(value = 1)
    private long filterId;
    @Min(value = 1)
    private long ruleId;
    @NotBlank
    @NotNull
    private String fieldName;
    @NotBlank
    @Pattern(regexp = "^equals|not_equals|contains|not_contains$")
    private String filterFunctionName;
    @NotBlank
    @NotNull
    private String filterValue;
}
