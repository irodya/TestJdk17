package ru.test.service;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Order(value = 1)
    @EventListener(ApplicationReadyEvent.class)
    public void handler(ApplicationReadyEvent event) {
        System.out.println("test");
    }
}
