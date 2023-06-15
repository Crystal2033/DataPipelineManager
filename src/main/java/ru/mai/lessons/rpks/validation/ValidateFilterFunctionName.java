package ru.mai.lessons.rpks.validation;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = FunctionNameValidator.class)
public @interface ValidateFilterFunctionName {
    public String message() default "Invalid FilterFunctionName: It should be either equals Or not_equals Or contain Or not_contain";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

