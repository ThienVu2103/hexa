package com.vuldt.hexagon.adapter.rest.mapper;

import com.vuldt.hexagon.application.dtos.EmployeeDto;
import com.vuldt.hexagon.application.domain.entities.Employee;
import com.vuldt.hexagon.adapter.rest.data.request.EmployeeRequest;
import com.vuldt.hexagon.adapter.rest.data.response.EmployeeResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmployeeMapper {
    EmployeeDto toDto(EmployeeRequest request);

    EmployeeDto toDto(Employee employee);

    EmployeeResponse toResponse(EmployeeDto dto);

    List<EmployeeResponse> toResponse(List<EmployeeDto> dto);
}
