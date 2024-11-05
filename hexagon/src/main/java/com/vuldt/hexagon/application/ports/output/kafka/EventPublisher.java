package com.vuldt.hexagon.application.ports.output.kafka;

import com.vuldt.hexagon.application.domain.event.EmployeePublishEvent;

public interface EventPublisher {
    void publish(EmployeePublishEvent event);
}
