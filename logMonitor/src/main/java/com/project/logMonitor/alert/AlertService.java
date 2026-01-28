package com.project.logMonitor.alert;

import com.project.logMonitor.entity.AlertEntity;
import com.project.logMonitor.repository.AlertRepository;
import com.project.logMonitor.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AlertService {
    private  static  final int ERROR_THRESHOLD = 2;

    @Autowired
    private LogRepository logRepository;

    @Autowired
    private AlertRepository alertRepository;

    public void checkErrorThreshold(){
        long errorCount  = logRepository.countByLevel("ERROR");

        if(errorCount >= ERROR_THRESHOLD){
            AlertEntity alert = new AlertEntity();
            alert.setType("ERROR_THRESHOLD");
            alert.setMessage("Error logs crossed threshold. count "+errorCount);
            alert.setCreatedAt(LocalDateTime.now().toString());

            alertRepository.save(alert);

            System.out.println("🚨 ALERTs Triggered successfully");

        }
    }
}
