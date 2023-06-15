package ru.mai.lessons.rpks.validation;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class FunctionNameValidator implements ConstraintValidator<ValidateFilterFunctionName, String>  {

    @Override
    public boolean isValid(String filterFunctionName, ConstraintValidatorContext context) {
        List<String> filterFunctionNames = Arrays.asList("equals", "not_equals", "contains", "not_contains");
        return filterFunctionNames.contains(filterFunctionName);
    }
}
