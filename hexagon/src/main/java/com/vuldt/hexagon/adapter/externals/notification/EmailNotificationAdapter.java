package com.vuldt.hexagon.adapter.externals.notification;

import com.vuldt.hexagon.application.ports.output.notification.NotificationPort;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmailNotificationAdapter implements NotificationPort {
    @Override
    public void send() {
        log.info("Sending email");
    }
}
