package ru.mai.lessons.rpks.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
    private long enrichmentId;
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
