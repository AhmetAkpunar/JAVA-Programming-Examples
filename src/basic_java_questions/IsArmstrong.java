package basic_java_questions;

import java.util.Scanner;

public class IsArmstrong {
    public static void main(String[] args) {
        /*
            Check if the integer is an Armstrong numbers

            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Is an Armstrong number or not?");
        System.out.print("Write a number: ");
        int number = scan.nextInt();
        int copyNum=number;

        int total=0;
        while (copyNum >0){

            int digit = copyNum%10;
            total += (digit*digit*digit);
            copyNum /=10;

        }

        if (total == number) System.out.println("Armstrong number !");
        else System.out.println("Try another number");

    }
}
