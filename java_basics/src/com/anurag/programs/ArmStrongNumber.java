package com.anurag.programs;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNumber = sc.nextInt();
		sc.close();
		isArmStrongNumber(inputNumber);

	}

	private static void isArmStrongNumber(int inputNumber) {
		// TODO Auto-generated method stub
		int noOfDigit = String.valueOf(inputNumber).length();
		int inputNumberCopy = inputNumber;
		int sum = 0;
		while (inputNumberCopy > 0) {
			int digit = inputNumberCopy % 10;
			sum = (int) (sum + Math.pow(digit, noOfDigit));
			inputNumberCopy = inputNumberCopy / 10;
		}
		if(sum==inputNumber){
			System.out.println("Yes");
		}else{
			System.out.println("NO");
		}
		
	}
}
