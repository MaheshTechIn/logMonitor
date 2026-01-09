package com.project.logMonitor.service;

import com.project.logMonitor.dto.LogRequest;
import org.springframework.stereotype.Service;

@Service
public class LogService {

    public void processLog(LogRequest logRequest){
        System.out.println("Process logs inn service class");
        System.out.println("Level : "+logRequest.getLevel());
        System.out.println("Service : "+logRequest.getService());
        System.out.println("Message : "+logRequest.getMessage());
        System.out.println("Timestamp : " +logRequest.getTimestamp());
    }
}
