package com.delivery_api.Projeto.delivery.API.validation;

import java.util.regex.Pattern;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CEPValidator implements com.delivery_api.Projeto.delivery.API.validation.ConstraintValidator<com.deliverytech.delivery_api.validation.ValidCEP, String> {

    private static final Pattern CEP_PATTERN =
            Pattern.compile("^\\d{5}-?\\d{3}$");

    @Override
    public void initialize(com.deliverytech.delivery_api.validation.ValidCEP constraintAnnotation) {
        // Inicialização se necessária
    }

    @Override
    public boolean isValid(String cep, ConstraintValidatorContext context) {
        if (cep == null || cep.trim().isEmpty()) {
            return false;
        }

        String cleanCep = cep.trim().replaceAll("\s", "");
        return CEP_PATTERN.matcher(cleanCep).matches();
    }

}