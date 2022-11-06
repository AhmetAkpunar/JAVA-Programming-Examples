package basic_java_questions;

public class Q1_SumOfTheDigits {
    public static void main(String[] args) {

        /*
         * Write a method which accepts a String as parameter and prints the sum of the
         * digits, present in the given string.
         *
         * input : ade1r4d3
         *
         * output : 8
         *
         * Hint : Use Character.isDigit() Integer.valueOf()
         */

        String str = "ade1r4d3a46t5y9u4";

        sumOfDigits(str);

    }
    public static void sumOfDigits(String str){

        int total =0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {

             total += Integer.valueOf(""+ str.charAt(i));

            }
        }
      System.out.println("The sum of the digits in the given string :   "+total);
    }
}