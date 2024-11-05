package com.vuldt.hexagon.adapter.externals.repositories;

import com.vuldt.hexagon.application.domain.entities.Employee;
import com.vuldt.hexagon.application.ports.output.repositories.EmployeeRepositoryPort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepositoryPortImpl extends JpaRepository<Employee, Long>, EmployeeRepositoryPort {

    @Override
    Optional<Employee> findByEmail(String email);
}