package ru.mai.lessons.rpks.model;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "deduplication_rules")
public class Deduplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long deduplicationId;
    private long ruleId;
    private String fieldName;
    private long timeToLiveSec;
    private boolean isActive;
}
