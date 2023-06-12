package ru.mai.lessons.rpks.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "deduplication_rules")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Deduplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Min(value = 1)
    private long deduplicationId;

    @Min(value = 1)
    private long ruleId;

    @NotBlank(message = "fieldName is required")
    @NotNull
    private String fieldName;

    @Min(value = 1)
    private long timeToLiveSec;

    private boolean isActive;
}
