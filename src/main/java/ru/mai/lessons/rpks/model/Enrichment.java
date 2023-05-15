package ru.mai.lessons.rpks.model;

import jakarta.persistence.*;
import lombok.*;

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
    private String fieldName;
    private String fieldNameEnrichment;
    private String fieldValue;
    private String fieldValueDefault;
}
