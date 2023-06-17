package ru.mai.lessons.rpks.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "enrichment_rules")
public class Enrichment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Min(value = 1)
    private Long id;
    @Min(value = 1)
    private Long enrichmentId;
    @Min(value = 1)
    private Long ruleId;
    @NotBlank
    private String fieldName;
    @NotBlank
    private String fieldNameEnrichment;
    @NotBlank
    private String fieldValue;
    @NotBlank
    private String fieldValueDefault;
    public Enrichment(long id, long enrichmentId, long ruleId, String fieldName, String fieldNameEnrichment, String fieldValue, String fieldValueDefault) {
        this.id = id;
        this.enrichmentId = enrichmentId;
        this.ruleId = ruleId;
        this.fieldName = fieldName;
        this.fieldNameEnrichment = fieldNameEnrichment;
        this.fieldValue = fieldValue;
        this.fieldValueDefault = fieldValueDefault;
    }
}
