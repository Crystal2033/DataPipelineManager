package ru.mai.lessons.rpks.model;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Filter {
    private long id;
    @Positive
    long filterId;
    @Positive
    long ruleId;
    @NotBlank(message = "filterFunctionName may not be blank ")
    String fieldName;
    @NotBlank
    @Pattern(regexp = "\\w{2,8}a\\w{1,2}s")
    String filterFunctionName;
    @NotBlank
    String filterValue;
}
