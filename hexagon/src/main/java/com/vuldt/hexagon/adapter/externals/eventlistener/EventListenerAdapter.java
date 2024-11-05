package com.vuldt.hexagon.adapter.externals.eventlistener;

import com.vuldt.hexagon.application.domain.event.EmployeeConsumeEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EventListenerAdapter {

    @EventListener
    public void handle(EmployeeConsumeEvent event){
        log.info("Product created with id " + event.getId() + " at " + event.getDate());
    }
}
