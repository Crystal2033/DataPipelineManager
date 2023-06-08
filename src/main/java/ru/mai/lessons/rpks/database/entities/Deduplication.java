package ru.mai.lessons.rpks.database.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "deduplication_rules")
public class Deduplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank
    @Min(value = 1)
    private long id;
    @NotBlank
    @Min(value = 1)
    private long deduplicationId;
    @NotBlank
    @Min(value = 1)
    private long ruleId;
    @NotBlank
    private String fieldName;
    @NotBlank
    private long timeToLiveSec;
    @NotBlank
    private boolean isActive;
}
