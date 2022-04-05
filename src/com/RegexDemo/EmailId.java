package com.RegexDemo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailId {

	public static void main(String[] args) {
		String emailId = ("^[a-z0-9]{1,20}([_.+-][a-z0-9]+)?@[a-z0-9]+.[a-z]{2,3}(.[a-z]{2})?$");
		Pattern emailIdPattern = Pattern.compile(emailId);
		System.out.println("Enter the email Id");
		Scanner sc = new Scanner(System.in);
				String emailInput = sc.nextLine();
		boolean result = emailInput.matches(emailId);
		if (result)
		{
			System.out.println("Valid email Id");
		}else {
			System.out.println("invalid input,plz enter valid input");
		}
		sc.close();
	}

}
