package com.RegexDemo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailId {

	public static void main(String[] args) {
		String emailId = "^(.+)@(.+)$" ;
		Pattern emailIdPattern = Pattern.compile(emailId);
		System.out.println("Enter the email Id");
		Scanner sc = new Scanner(System.in);
				String emailInput = sc.nextLine();
		
		if (emailIdPattern.matcher(emailId).matches())
		{
			System.out.println("Valid email Id");
		}else {
			System.out.println("invalid input,plz enter valid input");
		}
		sc.close();
	}

}
