package com.bridgelabz.review1;

public class Reversed {
    public static void main(String[] args) {
        int num = 1234, reversed = 0;
        System.out.println("Enter Number: " + num);
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}
