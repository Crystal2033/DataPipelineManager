package ru.mai.lessons.rpks.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "enrichment_rules")
@Data
public class Enrichment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Min(value = 1)
    private long id;

    @Min(value = 1)
    private long enrichmentId;

    @Min(value = 1)
    private long ruleId;

    @NotBlank(message = "Name is required")
    private String fieldName;

    @NotBlank(message = "Name enrichment is required")
    private String fieldNameEnrichment;

    @NotBlank(message = "Value is required")
    private String fieldValue;

    @NotBlank(message = "Default value is required")
    private String fieldValueDefault;
}
