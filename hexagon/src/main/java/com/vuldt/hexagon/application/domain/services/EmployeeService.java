package com.vuldt.hexagon.application.domain.services;

import com.vuldt.hexagon.application.dtos.EmployeeDto;
import com.vuldt.hexagon.application.ports.input.EmployeeUsecase;
import com.vuldt.hexagon.application.ports.output.notification.NotificationPort;
import com.vuldt.hexagon.application.ports.output.repositories.EmployeeRepositoryPort;
import com.vuldt.hexagon.application.domain.entities.Employee;
import com.vuldt.hexagon.application.domain.exception.NotFound;
import com.vuldt.hexagon.adapter.rest.mapper.EmployeeMapper;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * inner service, core business here
 */
@RequiredArgsConstructor
public class EmployeeService implements EmployeeUsecase {

    // D in SOLID
    private final EmployeeRepositoryPort employeeRepositoryPort;
    private final NotificationPort notificationPort;
    private final EmployeeMapper employeeMapper;

    @Override
    public EmployeeDto getEmployeeById(Long id) {
        Employee employee = employeeRepositoryPort.findById(id).orElseThrow(() -> new NotFound("Employee not found"));

        return employeeMapper.toDto(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepositoryPort.delete(id);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employees = employeeRepositoryPort.findAll();
        return List.of();
    }

    @Override
    public EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto) {
        // throw business validation here
        var employee = employeeRepositoryPort.findById(id).orElseThrow(() -> new NotFound("Employee not found"));

        // do core business logic here
        updateProcess(employee);

        employeeRepositoryPort.updateEmployee(employee);

        notificationPort.send();
        return new EmployeeDto();
    }

    private void updateProcess(Employee employee) {

    }
}
