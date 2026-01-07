package com.project.logMonitor.controller;

import com.project.logMonitor.dto.LogRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/logs")
public class LogController {

    @PostMapping
    public String ingestLog(@RequestBody LogRequest logRequest){
        System.out.println("Recieved log: ");
        System.out.println("Level " + logRequest.getLevel());
        System.out.println("Service: " + logRequest.getService());
        System.out.println("Message: " + logRequest.getMessage());
        System.out.println("Timestamp: " + logRequest.getTimestamp());
        return "Log recieved Sucessfully";
    }
}
