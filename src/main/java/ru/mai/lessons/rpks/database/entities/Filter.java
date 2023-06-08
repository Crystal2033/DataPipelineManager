package ru.mai.lessons.rpks.database.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "filter_rules")
public class Filter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank
    @Min(value = 1)
    private long id;
    @Min(value = 1)
    private long filterId;
    @Min(value = 1)
    @NotBlank
    private long ruleId;
    @NotBlank
    private String fieldName;
    @NotBlank
    private String filterFunctionName;
    @NotBlank
    private String filterValue;
}
