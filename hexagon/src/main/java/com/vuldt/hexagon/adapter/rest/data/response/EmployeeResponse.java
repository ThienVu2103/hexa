package com.vuldt.hexagon.adapter.rest.data.response;

import lombok.Data;

@Data
public class EmployeeResponse {
    private Long id;
    private String name;
    private String surname;
    private String email;
}
