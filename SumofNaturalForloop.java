package com.bridgelabz.Day2basicproblems;

import java.util.Scanner;

public class SumofNaturalForloop {
	//Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5

	
	    public static void main(String[] args) {
	        int i;
	        int num;
	        int sum = 0;
	        System.out.println("Enter Number:- ");
	        Scanner sc = new Scanner(System.in);
	        num = sc.nextInt();

	        for ( i = 1; i <= num; ++i) {
	            sum = sum + i;
	        }
	        System.out.println("sum of natural number is " + sum);
	    }
	}

