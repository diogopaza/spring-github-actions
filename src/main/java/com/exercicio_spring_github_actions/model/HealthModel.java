package com.exercicio_spring_github_actions.model;

public class HealthModel {
    private String status;
    public HealthModel(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

}
