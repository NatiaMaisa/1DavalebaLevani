package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("რომელი თვეა ახლა?");

        String month = scanner.next();

        while (!month.equals("ნოემბერი")){
            System.out.println("პასუხი არასწორია!");
            System.out.println("რომელი თვეა ახლა?");
            month = scanner.next();
        }
        System.out.println("თქვენი პასუხი სწორია!");
    }
}