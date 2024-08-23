package com.todo.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class StatusValidator implements ConstraintValidator<ValidStatus, String> {

    private List<String> validStatuses;

    @Override
    public void initialize(ValidStatus constraintAnnotation) {
        String statusOptions = System.getenv("REACT_APP_STATUS_OPTIONS");
        if (statusOptions != null) {
            validStatuses = Arrays.asList(statusOptions.split(","));
        }
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && validStatuses.contains(value);
    }
}