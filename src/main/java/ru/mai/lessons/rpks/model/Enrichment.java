package ru.mai.lessons.rpks.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "enrichment_rules")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Enrichment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Min(value = 1)
    private long enrichmentId;

    @Min(value = 1)
    private long ruleId;

    @NotBlank(message = "fieldName is required")
    @NotNull
    private String fieldName;

    @NotBlank(message = "fieldNameEnrichment is required")
    @NotNull
    private String fieldNameEnrichment;

    @NotBlank(message = "fieldValue is required")
    @NotNull
    private String fieldValue;

    @NotBlank(message = "fieldValueDefault is required")
    @NotNull
    private String fieldValueDefault;
}
