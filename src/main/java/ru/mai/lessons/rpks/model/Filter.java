package ru.mai.lessons.rpks.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "filter_rules")
@Data
public class Filter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Min(value = 1)
    private long id;

    @Min(value = 1)
    private long filterId;

    @Min(value = 1)
    private long ruleId;

    @NotBlank(message = "Name is required")
    private String fieldName;

    @NotBlank(message = "Function name is required")
    private String filterFunctionName;

    @NotBlank(message = "Value is required")
    private String filterValue;
}
