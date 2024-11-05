package com.vuldt.hexagon.application.ports.output.repositories;

import com.vuldt.hexagon.application.domain.entities.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepositoryPort {
    Optional<Employee> findById(long id);

    void save(Employee employee);

    void delete(long id);

    List<Employee> findAll();

    void updateEmployee(Employee employee);

    Optional<Employee> findByEmail(String email);
}
