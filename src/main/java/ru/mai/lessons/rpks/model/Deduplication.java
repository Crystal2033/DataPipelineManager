package ru.mai.lessons.rpks.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "deduplication_rules")
@Data
public class Deduplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Min(value = 1)
    private long id;

    @Min(value = 1)
    private long deduplicationId;

    @Min(value = 1)
    private long ruleId;

    @NotBlank(message = "Name is required")
    private String fieldName;

    @Min(value = 1)
    private long timeToLiveSec;

    @NotNull
    private boolean isActive;
}
