package com.bridgelabz.Day2basicproblems;

import java.util.Scanner;

public class Reverseintforloop {
	 public static void main(String[] args) {
	        int num;
	        int reversed = 0;

	        System.out.println("enter number:- ");
	        Scanner sc = new Scanner(System.in);
	        num = sc.nextInt();

	        for (;num != 0; num /= 10) {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	        }
	        System.out.println("Reversed Number: " + reversed);
	    }
}
