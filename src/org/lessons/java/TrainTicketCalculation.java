package org.lessons.java;

import java.util.Scanner;

public class TrainTicketCalculation {
    public static void main(String[] args) {
        Scanner keyboardReader = new Scanner(System.in);

        System.out.println("Quanti kilometri vuoi percorrere?");
        double km = keyboardReader.nextDouble();

        System.out.println("Quanti anni hai?");
        int age = keyboardReader.nextInt();

        double price = km * 0.21;

        if (age <= 18) {
            price -= price * 0.2;
        } else if (age >= 65) {
            price -= price * 0.4;
        }

        System.out.println("il prezzo del biglietto è: " + price + " €" );
    }
}
