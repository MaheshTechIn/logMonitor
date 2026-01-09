package com.project.logMonitor.controller;

import com.project.logMonitor.entity.LogEntity;
import com.project.logMonitor.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/logs")

public class LogController {
    @Autowired
    private LogService logService;
//
//    @PostMapping
//    public String ingestLog(@RequestBody LogRequest logRequest){
//        logService.processLog(logRequest);
//        return "Log recieved Sucessfully";
//    }
    @GetMapping
    public Page<LogEntity> getLogs(
            @RequestParam(required = false)String level,
            @RequestParam(required = false)String service,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ){
        return logService.getLogs(level, service, page, size);
    }
}
