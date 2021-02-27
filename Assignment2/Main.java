package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        AppointmentQueue current = new AppointmentQueue(new Patient("There are no other current appointments in the queue.", " "));
        boolean run = true;

        while (run) {
            System.out.println("Input number for desired function: \n 1) Add Patient \n 2) Remove Patient \n 3) Show Queue \n 4) Quit");
            int option = Input.nextInt();
            if (option > 4 || option < 1) {
                System.out.println("Please select a valid option");
            } else if (option == 1) {
                System.out.println("Patient's name: ");
                String pName = Input.next();
                System.out.println("Patient's Appointment Time (HH:MM): ");
                String pTime = Input.next();
                System.out.println("Patient's Position: ");
                int pPosition = Input.nextInt();
                current.insert(new Patient(pName, pTime), (pPosition-1));
            } else if (option == 2) {
                System.out.println("Please Select the position to delete: ");
                int dPosition = Input.nextInt();
                dPosition++;
                current.delete(dPosition);
            } else if (option == 3) {
                current.print();
            } else if (option == 4) {
                run = false;
                System.out.println("Successfully Quit");
            }
        }
    }
}