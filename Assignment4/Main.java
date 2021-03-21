package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        LinkedList list = new LinkedList(new Patient("", ""));
        boolean run = true;

        while (run) {
            System.out.println("\nInput number for desired function: \n 1) Add Patient \n 2) Show Queue \n 3) Quit");
            int option = Input.nextInt();
            if (option > 3 || option < 1) {
                System.out.println("Please select a valid option");
            } else if (option == 1) {
                System.out.println("Patient's name: ");
                String pName = Input.next();
                System.out.println("Patient's Appointment Time (HH:MM): ");
                String pTime = Input.next();
                System.out.println("Patient's Position: ");
                int pPosition = Input.nextInt();
                list.insertPatientAtPosition(new Patient(pName, pTime), (pPosition-1));
            } else if (option == 2) {
                list.print();
            } else {
                run = false;
                System.out.println("Successfully Quit");
            }
        }
    }
}