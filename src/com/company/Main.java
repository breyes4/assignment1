package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[ ] arr = new int[2];
        int[] myChoices = {0, 1};
        String[] [] theChoices = { {"mild", "tea", "breakfast", "summer", "paper"}, {"spicy", "coffee", "brunch", "winter", "plastic"} };

        int count = 0;

        System.out.println("Preference Quiz");


        System.out.println("Do you prefer " + theChoices[0][0] + " or " + theChoices[1][0] + "?" +
                " Press 0 for preference on left" + ", Press 1 for preference on right");
        int myVar1 = scanner.nextInt();

        if (myVar1 == myChoices[1]) {
            count++;
        }


        System.out.println("Do you prefer " + theChoices[0][1] + " or " + theChoices[1][1] + "?" +
                " Press 0 for preference on left" + ", Press 1 for preference on right");
        int myVar2 = scanner.nextInt();

        if (myVar2 == myChoices[1]) {
            count++;
        }


        System.out.println("Do you prefer " + theChoices[0][2] + " or " + theChoices[1][2] + "?" +
                " Press 0 for preference on left" + ", Press 1 for preference on right");
        int myVar3 = scanner.nextInt();

        if (myVar3 == myChoices[1]) {
            count++;
        }

        System.out.println("Do you prefer " + theChoices[0][3] + " or " + theChoices[1][3] + "?" +
                " Press 0 for preference on left" + ", Press 1 for preference on right");
        int myVar4 = scanner.nextInt();

        if (myVar4 == myChoices[1]) {
            count++;
        }

        System.out.println("Do you prefer " + theChoices[0][4] + " or " + theChoices[1][4] + "?" +
                " Press 0 for preference on left" + ", Press 1 for preference on right");
        int myVar5 = scanner.nextInt();

        if (myVar5 == myChoices[1]) {
            count++;
        }


        int countNum = countNumbers();


    }

    public static int countNumbers() {

        int count = 0;

        if (count > 3) {

            System.out.print("You prefer life to be spontaneous and active");
        } if  (count < 3) {

            System.out.print("You prefer life to be calm and organized");
        } if (count == 3) {

            System.out.print("You prefer a good balance in life.");

        }
        return count;
    }
}


