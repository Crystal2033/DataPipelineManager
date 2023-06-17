package ru.mai.lessons.rpks.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "deduplication_rules")
public class Deduplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Min(value = 1)
    private Long id;
    @Min(value = 1)
    private Long deduplicationId;
    @Min(value = 1)
    private Long ruleId;
    @NotBlank
    private String fieldName;
    @Min(value = 1)
    private Long timeToLiveSec;
    @NotNull
    private Boolean isActive;

    // Конструктор нужен, только чтобы в тестах не было ошибок, т.к. значение 1 не кастится к Long (в отличие от 1L)
    public Deduplication(long id, long deduplicationId, long ruleId, String fieldName, long timeToLiveSec, boolean isActive) {
        this.id = id;
        this.deduplicationId = deduplicationId;
        this.ruleId = ruleId;
        this.fieldName = fieldName;
        this.timeToLiveSec = timeToLiveSec;
        this.isActive = isActive;
    }

    public Boolean isActive() {
        return isActive;
    }
}
