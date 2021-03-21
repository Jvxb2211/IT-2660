package com.company;

public class LinkedList {

    private Patient root;
    private Patient last;
    private int size;

    public LinkedList(Patient patient){
        root = patient;
        last = patient;
        size = 1;
    }

    private Patient getPatient(int position)  {

        Patient walker = root;

        for (int i=1; i<=position; i++) {
            walker = walker.getNextPatient();
        }

        return walker;
    }

    private void insert(Patient patient, int index) {
        Patient targetPatient = getPatient(index);
        patient.setNextPatient(targetPatient.getNextPatient());
        targetPatient.setNextPatient(patient);
        size++;
    }

    public void append(Patient patient){
        last.setNextPatient(patient);
        last = patient;
        size++;
    }

    private void insertNewRoot(Patient patient) {
        patient.setNextPatient(root);
        root = patient;
        size++;
    }

    public void insertPatientAtPosition(Patient patient, int position){
        if (position == 0 ) insertNewRoot(patient);
        else if (position == size) append(patient);
        else if (position > size) append(patient);
        else insert(patient, position);
    }

    public static void recursivePrint(LinkedList list, int position){
        if (list.size == position){
            return;
        }
        System.out.println(list.getPatient(position).getName() + " " + list.getPatient(position).getTime());
        recursivePrint(list,position + 1);
    }
}
