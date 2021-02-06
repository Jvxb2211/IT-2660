package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("How many listings?: ");
        int listingNumber = Input.nextInt();
        Listing[] listingArray = new Listing[listingNumber];
        for (int i = 0; i < listingArray.length; i++){
            listingArray[i] = new Listing();
        }
        for (int i = 0; i < listingArray.length; i++){
            Listing.addListing(listingArray[i]);
        }
        for (int i = (listingNumber - 1); i > -1; i--){
            Listing.printTest(listingArray[i]);
        }
    }
}
