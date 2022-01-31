package com.exmple.datadog.logging.controllers;

import com.example.datadog.logging.models.LoggerRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class LoggerController {
    private static final Logger LOGGER = LogManager.getLogger("DatadogErrorLogger");

    @PostMapping("logger")
    public String postError(@RequestHeader(value = "Content-Type") String contentType,
                            @RequestBody LoggerRequest request) {
        if ("error".equalsIgnoreCase(request.getLevel())
                && "application/json".equalsIgnoreCase(contentType)) {
            System.setProperty("client", request.getTags().getClient());
            System.setProperty("browser", request.getBrowser().getName());
            System.setProperty("component", request.getTags().getComponent());
            System.setProperty("exception", request.getException());
            System.setProperty("errorLogger", request.getLogger());
            System.setProperty("errorLevel", request.getLevel());
            System.setProperty("sdk", request.getSdk().getName());

            LOGGER.error(request);
        }
        return request.toString();
    }

}
