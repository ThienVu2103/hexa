package com.vuldt.hexagon.application.domain.event;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EmployeePublishEvent {
    private Long id;
    private LocalDateTime date;
}
