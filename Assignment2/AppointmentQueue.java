package com.company;

public class AppointmentQueue {

    private Patient[] queue;

    public AppointmentQueue(Patient firstPatient){
        this.queue = new Patient[1];
        this.queue[0] = firstPatient;
    }

    public void print(){
        for (Patient patient: this.queue){
            System.out.println(patient.getName() + " " + patient.getTime());
        }
    }

    public void insert(Patient patient, int position){

        if (this.queue.length == 0 && position == 0){
            this.queue = new Patient [1];
            this.queue[0] = patient;
            return;
        }

        if (position < 0 || position > (this.queue.length - 1)){
            System.out.println("This is not a valid position. There are only " + (this.queue.length - 1) +" people in the queue");
            return;
        }

        Patient[] newQueue = new Patient[this.queue.length + 1];

        for (int i=0; i<this.queue.length+1; i++){
            if (i < position){
                newQueue[i] = this.queue[i];
            }
            else if (i > position){
                newQueue[i] = this.queue[i-1];
            }
            else{
                newQueue[i] = patient;
            }
        }

        this.queue = newQueue;
    }

    public void delete(int position){

        if (position < 0 || position > (this.queue.length + 1)){
            System.out.println("This is not a valid position. There are only " + (this.queue.length - 1) +" people in the queue");
            return;
        }

        Patient[] newQueue = new Patient[this.queue.length - 1];

        for (int i=0; i<this.queue.length-1; i++){
            if (i < position){
                newQueue[i] = this.queue[i];
            }
            else if (i == position){
                newQueue[i] = this.queue[i-1];
            }
        }

        this.queue = newQueue;

    }
}
