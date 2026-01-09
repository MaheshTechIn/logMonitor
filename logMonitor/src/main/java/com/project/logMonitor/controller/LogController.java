package com.project.logMonitor.controller;

import com.project.logMonitor.dto.LogRequest;
import com.project.logMonitor.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/logs")

public class LogController {
    @Autowired
    private LogService logService;
    @PostMapping
    public String ingestLog(@RequestBody LogRequest logRequest){
        logService.processLog(logRequest);
        return "Log recieved Sucessfully";
    }
}
