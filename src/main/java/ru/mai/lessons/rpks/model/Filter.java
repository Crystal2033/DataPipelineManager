package ru.mai.lessons.rpks.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "filter_rules")
public class Filter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Min(1)
    private long filterId;

    @Min(1)
    private long ruleId;

    @NotBlank
    private String fieldName;

    @Pattern(regexp = "^(contains|equals|not_contains|not_equals)$")
    private String filterFunctionName;

    @NotBlank
    private String filterValue;
}
