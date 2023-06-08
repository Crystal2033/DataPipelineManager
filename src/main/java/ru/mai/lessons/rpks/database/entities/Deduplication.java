package ru.mai.lessons.rpks.database.entities;

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
@Entity(name = "deduplication_rules")
public class Deduplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Min(value = 1)
    private long id;
    @NotNull
    @Min(value = 1)
    private long deduplicationId;
    @NotNull
    @Min(value = 1)
    private long ruleId;
    @NotBlank
    private String fieldName;
    @NotBlank
    private long timeToLiveSec;
    @NotBlank
    private boolean isActive;
}
