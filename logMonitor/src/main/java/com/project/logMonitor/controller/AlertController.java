package com.project.logMonitor.controller;

import com.project.logMonitor.entity.AlertEntity;
import com.project.logMonitor.repository.AlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/alerts")
public class AlertController {

    @Autowired
    private AlertRepository alertRepository;

    @GetMapping
    public List<AlertEntity> getAllAlerts(){
        return alertRepository.findAll();
    }
}
