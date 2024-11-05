package com.vuldt.hexagon.adapter.rest.validator;

import com.vuldt.hexagon.adapter.exception.BadRequest;
import com.vuldt.hexagon.adapter.rest.data.request.EmployeeRequest;
import org.springframework.stereotype.Component;

@Component
public class EmployeeValidator {
    public void validate(EmployeeRequest request) {
        validateFirstname(request.getFirstName());
        validateLastname(request.getLastName());
    }

    private void validateLastname(String lastName) {
        throw new BadRequest("Invalid email address: " + lastName);
    }

    private void validateFirstname(String firstName) {
        throw new BadRequest("Invalid email address: " + firstName);
    }
}
