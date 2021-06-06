

/*
 *  UCF COP3330 Summer 2021 Assignment 10
 *  Copyright 2021 Steven Ortiz
 */

//Enter the price of item 1: 25
//Enter the quantity of item 1: 2
//Enter the price of item 2: 10
//Enter the quantity of item 2: 1
//Enter the price of item 3: 4
//Enter the quantity of item 3: 1
//Subtotal: $64.00
//Tax: $3.52
//Total: $67.52
package org.example;
import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

    private static int firstint() {

        System.out.print("Enter the price of item 1: ");
        String cost1 = in.nextLine();
        return Integer.parseInt(cost1);
    }
    private static int amount1() {

        System.out.print("Enter the quantity of item 1: ");
        String amount1 = in.nextLine();
        return Integer.parseInt(amount1);
    }

    private static int secondint() {

        System.out.print("Enter the price of item 2: ");
        String cost2 = in.nextLine();
        return Integer.parseInt(cost2);
    }

    private static int amount2() {

        System.out.print("Enter the quantity of item 2: ");
        String amount2 = in.nextLine();
        return Integer.parseInt(amount2);
    }

    private static int thirdint() {

        System.out.print("Enter the price of item 3: ");
        String cost3 = in.nextLine();
        return Integer.parseInt(cost3);
    }

    private static int amount3() {

        System.out.print("Enter the quantity of item 3: ");
        String amount3 = in.nextLine();
        return Integer.parseInt(amount3);
           }

    public static void main(String[] args) {

        double firstcost = firstint();
        double firstamount = amount1();

        double secondcost = secondint();
        double secondamount = amount2();

        double thirdcost = thirdint();
        double thirdamount = amount3();

        double subtotal = (firstcost * firstamount) + (secondcost * secondamount) + (thirdcost * thirdamount);
        double taxes = subtotal * .055;

        double total = subtotal + taxes;

        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));

        System.out.println("Tax: $" + String.format("%.2f", taxes));

        System.out.println("Total: $" + String.format("%.2f", total));
    }
}
