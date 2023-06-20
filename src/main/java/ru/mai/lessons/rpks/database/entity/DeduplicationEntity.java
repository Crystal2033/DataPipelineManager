package ru.mai.lessons.rpks.database.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "deduplication_rules")
public class DeduplicationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long deduplicationId;
    private long ruleId;
    private String fieldName;
    private long timeToLiveSec;
    private boolean isActive;
}
