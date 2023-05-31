package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        //int[] fizzbuzz = new int[100];
        Scanner keyboardReader = new Scanner(System.in);


        System.out.println("Quanti numeri vuoi stampare? Inserisci un numero maggiore di 0 e minore di 1000: ");
        int printedNumbers = keyboardReader.nextInt();

        if (printedNumbers < 0 || printedNumbers > 1000) {
            System.out.println("Non hai inserito un numero maggiore di 0 e minore di 1000");
            return;
        }
        for (int i = 0; i <= printedNumbers ; i++) {
         if (i % 3 == 0 && i % 5 == 0){
             System.out.println("FizzBuzz ");
         } else if (i % 3 == 0) {
             System.out.println("Fizz ");
         } else if (i % 5 == 0) {
             System.out.println("Buzz ");
         }  else {
             System.out.println(i);
         }
        }
    }
}
