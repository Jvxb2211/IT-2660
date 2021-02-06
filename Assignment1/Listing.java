package com.company;

import java.util.Scanner;

public class Listing {
    private String name;
    private int age;
    Listing(){
        name = " ";
        age = 0;
    }
    Listing(String inputName, int inputInt){
        name = inputName;
        age = inputInt;
    }
    public String toString(){
        return name + " " + age;
    }

    public void setAge(int age) { this.age = age; }
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public static void addListing(Listing listingName){
        Scanner Input = new Scanner(System.in);
        String mName;
        int mAge;
        System.out.println("Enter name for listing: ");
        mName = Input.next();
        System.out.println("Enter age for listing: ");
        mAge = Input.nextInt();
        listingName.setName(mName);
        listingName.setAge(mAge);
    }
    public static void printTest(Listing listing){
        System.out.println(listing.toString());
    }
}
