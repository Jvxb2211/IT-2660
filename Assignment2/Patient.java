package com.company;

public class Patient {

    private String name;
    private String appointmentTime;

    public String getName() {
        return this.name;
    }

    public String getTime() {
        return this.appointmentTime;
    }

    public Patient(String name, String appointmentTime){
        this.name = name;
        this.appointmentTime = appointmentTime;
    }

}
