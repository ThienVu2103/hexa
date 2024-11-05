package com.vuldt.hexagon.application.ports.input;

import com.vuldt.hexagon.application.dtos.EmployeeDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeUsecase {
    EmployeeDto getEmployeeById(Long id);

    void deleteEmployee(Long id);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto);
}
