package com.vuldt.hexagon.application.ports.output.notification;

import org.springframework.stereotype.Component;

@Component
public interface NotificationPort {
    void send();
}
