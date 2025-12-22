package com.exercicio_spring_github_actions.controller;

import com.exercicio_spring_github_actions.model.HealthModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/health")
    public ResponseEntity<HealthModel> healthController() {
        var health = new HealthModel("UP");
        return ResponseEntity.ok(health);
    }
}
