package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any letter: ");
        char letter = input.next().charAt(0);
        if (letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U') {
            System.out.println("The letter is vowel");
        }else {
            System.out.println("The letter is consonant");
        }
    }
}
