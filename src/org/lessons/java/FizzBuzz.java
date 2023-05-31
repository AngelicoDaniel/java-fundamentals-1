package org.lessons.java;

public class FizzBuzz {
    public static void main(String[] args) {
//        int[] fizzbuzz = new int[100];

        for (int i = 0; i <= 100 ; i++) {
         if (i % 3 == 0 && i % 5 == 0){
             System.out.print("FizzBuzz ");
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
