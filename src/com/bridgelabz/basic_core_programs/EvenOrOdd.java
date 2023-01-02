package com.bridgelabz.basic_core_programs;
import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A Number");
        int number = scan.nextInt();
        if (number % 2 == 0)
            System.out.println(number + " is a Even Number");
        else
            System.out.println(number + " is a Odd Number");
    }

}
