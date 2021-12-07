package com.example.employees.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DataBaseService implements HealthIndicator {

    private String dbService = "Data base service";
    @Override
    public Health health() {
        return true == isDBHealthGood() ? Health.up().withDetail(dbService, "Service is running").build()
                : Health.down().withDetail(dbService, "Service is not available").build();
    }

    private boolean isDBHealthGood(){
        //logic
        return true;
    }
}