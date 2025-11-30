package com.delivery_api.Projeto.delivery.API.validation;

import jakarta.validation.ConstraintValidator;

public class TelefoneValidator implements ConstraintValidator<com.deliverytech.delivery_api.validation.ValidTelefone, String> {

    @Override
    public void initialize(com.deliverytech.delivery_api.validation.ValidTelefone constraintAnnotation) {

    }

    @Override
    public boolean isValid(String telefone, jakarta.validation.ConstraintValidatorContext context) {
        return telefone != null && telefone.matches("\\(\\d{2}\\) \\d{4,5}-\\d{4}");
    }

}