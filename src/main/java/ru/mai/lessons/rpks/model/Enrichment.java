package ru.mai.lessons.rpks.model;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Enrichment {
    private long id;
    @Positive
    private long enrichmentId;
    @Positive
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
