
package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ELECTRICITY BILL CALCULATOR");
        System.out.println("---------------------------");

        System.out.print("Enter Consumer Name:  ");
        String name = sc.nextLine();

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        double bill;

        if (units <= 100) {
            bill = units * 2.0;
        }
        else if (units <= 200) {
            bill = (100 * 2.0) + (units - 100) * 3.0;
        }
        else {
            bill = (100 * 2.0) + (100 * 3.0)
                    + (units - 200) * 5.0;
        }

        System.out.println("\n------ BILL DETAILS ------");
        System.out.println("Consumer Name : " + name);
        System.out.println("Units Used    : " + units);
        System.out.println("Total Bill    : Rs. " + bill);

        if (bill > 1000) {
            System.out.println("Category      : High Consumption");
        }
        else {
            System.out.println("Category      : Normal Consumption");
        }

        sc.close();
    }
}