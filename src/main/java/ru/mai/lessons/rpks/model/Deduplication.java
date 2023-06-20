package ru.mai.lessons.rpks.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Deduplication {
    private long id;
    @Positive
    private long deduplicationId;
    @Positive
    long ruleId;
    @NotBlank
    String fieldName;
    @PositiveOrZero
    private long timeToLiveSec;
    private boolean isActive;
}
