package ru.mai.lessons.rpks.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Enrichment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long enricherId;
    private long ruleId;
    private String fieldName;
    private String fieldNameEnrichment;
    private String fieldValue;
    private String fieldValueDefault;
}
