package com.project.logMonitor.alert;

import com.project.logMonitor.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlertService {
    private  static  final int ERROR_THRESHOLD = 2;
    @Autowired
    private LogRepository logRepository;
    public void checkErrorThreshold(){
        long errorCount  = logRepository.countByLevel("ERROR");

        if(errorCount >= ERROR_THRESHOLD){
            System.out.println("🚨 ALERT: ERROR logs crossed threshold. Count = " + errorCount);
        }
    }
}
