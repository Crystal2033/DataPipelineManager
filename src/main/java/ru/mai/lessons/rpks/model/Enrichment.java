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
public class Enrichment{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Min(value = 1)
    private long id;
    @Min(value = 1)
    private long enrichmentId;
    @Min(value = 1)
    private long ruleId;
    @NotBlank(message = "fieldName must be inputted")
    @NotNull
    private String fieldName;
    @NotBlank(message = "fieldNameEnrichment must be inputted")
    @NotNull
    private String fieldNameEnrichment;
    @NotBlank(message = "fieldValue must be inputted")
    @NotNull
    private String fieldValue;
    @NotBlank(message = "fieldValueDefault must be inputted")
    @NotNull
    private String fieldValueDefault;
}
