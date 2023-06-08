package ru.mai.lessons.rpks.database.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "enrichment_rules")
public class Enrichment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Min(value = 1)
    private long id;
    @NotNull
    @Min(value = 1)
    private long enrichmentId;
    @NotNull
    @Min(value = 1)
    private long ruleId;
    @NotBlank
    private String fieldName;
    @NotBlank
    private String fieldNameEnrichment;
    @NotBlank
    private String fieldValue;
    @NotBlank
    private String fieldValueDefault;
}
