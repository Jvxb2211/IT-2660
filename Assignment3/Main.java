package com.company;

import java.util.Stack;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        boolean run = true;
        Stack<Patient>queue = new Stack<Patient>();
        while (run) {
            System.out.println("Input number for desired function: \n 1) Enter Schedule \n 2) Show Next Appointment \n 3) Complete Appointment \n 4) Quit");
            int option = Input.nextInt();
            if (option > 4 || option < 1) {
                System.out.println("Please select a valid option");
            } else if (option == 1) {
                System.out.println("Enter today's appointments from last to first \n Patient's name: ");
                String pName = Input.next();
                System.out.println("Patient's Appointment Time (HH:MM): ");
                String pTime = Input.next();
                queue.push(new Patient(pName,pTime));
            } else if (option == 2) {
                System.out.println("Here is the next appointment: " + queue.peek().getName() + " " + queue.peek().getTime());
            } else if (option == 3) {
                System.out.println("The appointment for " + queue.pop().getName() + " is complete");
                if (queue.empty()){
                    System.out.println("All entered appointments are complete");
                    run = false;
                }
            } else if (option == 4) {
                run = false;
                System.out.println("Successfully Quit");
            }
        }

    }
}
