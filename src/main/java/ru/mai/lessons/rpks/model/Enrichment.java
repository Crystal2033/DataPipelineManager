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
@Table(name = "enrichment_rules")
public class Enrichment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Min(value = 1)
    private long enrichmentId;
    @Min(value = 1)
    private long ruleId;
    @NotNull
    @NotBlank
    private String fieldName;
    @NotNull
    @NotBlank
    private String fieldNameEnrichment;
    @NotNull
    @NotBlank
    private String fieldValue;
    @NotNull
    @NotBlank
    private String fieldValueDefault;
}
