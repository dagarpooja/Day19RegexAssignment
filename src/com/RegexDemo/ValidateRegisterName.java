package com.RegexDemo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateRegisterName {

	public static void main(String[] args) {
		String registerUserName = "^[A-Za-z]\\w{8,50}$";

		Pattern registerUserNamePattern = Pattern.compile(registerUserName);

		System.out.println("Enter the register user name : ");

		Scanner sc = new Scanner(System.in);

		String userInput = sc.nextLine();

		if (registerUserNamePattern.matcher(userInput).matches()) {
			System.out.println("Valid user name");
		} else {
			System.out.println("Invalid input, Enter the valid valid user name");
		}
		sc.close();
	}

}
