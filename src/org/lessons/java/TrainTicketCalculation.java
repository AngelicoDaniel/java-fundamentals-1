package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TrainTicketCalculation {
    public static void main(String[] args) {

        double pricePerKm = 0.21;
        double discountUnder18 = 0.2;
        double discountOver65 = 0.4;

        Scanner keyboardReader = new Scanner(System.in);

        System.out.println("Quanti chilometri vuoi percorrere?");
        double km = keyboardReader.nextDouble();

        System.out.println("Quanti anni hai?");
        int age = keyboardReader.nextInt();

        double price = km * pricePerKm;

        if (age <= 18) {
            price -= price * discountUnder18;
        } else if (age >= 65) {
            price -= price * discountOver65;
        }

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String finalPrice = decimalFormat.format(price);

        System.out.println("il prezzo del biglietto è: " + finalPrice + " €" );
    }
}
