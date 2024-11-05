package com.vuldt.hexagon.adapter.rest;

import com.vuldt.hexagon.application.ports.input.EmployeeUsecase;
import com.vuldt.hexagon.adapter.rest.data.request.EmployeeRequest;
import com.vuldt.hexagon.adapter.rest.data.response.EmployeeResponse;
import com.vuldt.hexagon.adapter.rest.mapper.EmployeeMapper;
import com.vuldt.hexagon.adapter.rest.validator.EmployeeValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeUsecase employeeUsecase;
    private final EmployeeValidator employeeValidator;
    private final EmployeeMapper employeeMapper;

    @GetMapping("employees")
    public ResponseEntity<List<EmployeeResponse>> getEmployee() {
        return ResponseEntity.ok(employeeMapper.toResponse(employeeUsecase.getAllEmployees()));
    }

    @GetMapping("employees/{id}")
    public ResponseEntity<EmployeeResponse> updateEmployee(
            @Validated @RequestBody EmployeeRequest request,
            @PathVariable Long id) {
        //validate
        employeeValidator.validate(request);

        // process
        var employeeDto = employeeUsecase.updateEmployee(id, employeeMapper.toDto(request));

        // Domain to response
        return new ResponseEntity<>(employeeMapper.toResponse(employeeDto), HttpStatus.OK);
    }
}
