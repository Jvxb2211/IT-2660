package com.company;

public class Patient {

    private String name;
    private String appointmentTime;
    private Patient nextPatient;

    public String getName() {
        return this.name;
    }

    public String getTime() {
        return this.appointmentTime;
    }

    public Patient getNextPatient(){ return this.nextPatient; }

    public void setNextPatient(Patient patient){ nextPatient = patient; }

    public Patient(String name, String appointmentTime){
        this.name = name;
        this.appointmentTime = appointmentTime;
    }


}
