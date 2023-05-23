package com.cleam.cleanarchitecture.common;

import jakarta.validation.*;

import java.util.Set;

//비즈니스가 아닌 유효성 검증 코드 분리
public abstract class SelfValidating<T> {

    private final Validator validator;

    protected SelfValidating() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    protected void validateSelf() {
        Set<ConstraintViolation<T>> violations = validator.validate((T) this);
        if (!violations.isEmpty()) {
            throw new ConstraintViolationException(violations);
        }
    }
}