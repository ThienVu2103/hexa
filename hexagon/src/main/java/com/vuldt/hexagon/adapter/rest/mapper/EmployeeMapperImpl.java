package com.vuldt.hexagon.adapter.rest.mapper;

import com.vuldt.hexagon.application.dtos.EmployeeDto;
import com.vuldt.hexagon.application.domain.entities.Employee;
import com.vuldt.hexagon.adapter.rest.data.request.EmployeeRequest;
import com.vuldt.hexagon.adapter.rest.data.response.EmployeeResponse;

import java.util.List;

public class EmployeeMapperImpl implements EmployeeMapper {

    public EmployeeDto toDto(EmployeeRequest request) {
        return new EmployeeDto(request.getFirstName(), request.getLastName());
    }

    @Override
    public EmployeeDto toDto(Employee employee) {
        return null;
    }

    @Override
    public EmployeeResponse toResponse(EmployeeDto dto) {
        return null;
    }

    @Override
    public List<EmployeeResponse> toResponse(List<EmployeeDto> dto) {
        return List.of();
    }
}
