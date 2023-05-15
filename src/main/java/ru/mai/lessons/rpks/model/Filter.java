package ru.mai.lessons.rpks.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "filter_rules")
public class Filter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long filterId;
    private long ruleId;
    private String fieldName;
    private String filterFunctionName;
    private String filterValue;
}
