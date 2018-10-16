package com.labSeven;

import java.util.Scanner;

public class RegEx {

	public static void main(String[] args) {
		
	Scanner scnr = new Scanner (System.in);
		
	//I call the methods pertaining to each value requiring validation and pass in the corresponding parameters
	
	//The RegEx helps to check if there are the correct number of digits in the correct places
	getPhoneMatchingRegex(scnr, "Please enter a phone number: ", "\\(?\\d{3}(.?|\\)?)-?\\d{3}(.?|-?)\\d{4}");
	
	//The RegEx helps to check if the name contains letters, capitals and common name-associated characters are accepted. The length is capped at 30.
	getNameMatchingRegex(scnr, "Please enter a name: ", "^[a-zA-Z \\-\\.\\']{1,30}$");
	
	//The RegEx helps to check if the email follows the correct format and the lengths of each portion are the correct lengths.
	getEmailMatchingRegex(scnr, "Please enter an email: ", "^([\\w-\\.]+){5,30}@([\\w&&[^_]]+){5,10}.[a-z]{2,3}$");
	
	//The RegEx helps to check if the date contains only digits and follows the correct format.
	//If the user omits preceding zeroes, the regex allows for that as well and returns valid.
	getDateMatchingRegex(scnr, "Please enter a date in the format of DD/MM/YYYY: ", "^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$");
	}
	
	//I include the getString method, as it is required within the other validation methods
	
	public static String getString(Scanner scnr, String prompt) {
		System.out.print(prompt);
		String s = scnr.next(); // read user entry
		scnr.nextLine(); // discard any other data entered on the line
		return s;
	}
	
	//I validate the name passed in using the RegEx validation method and updated sysout statements
	
	public static String getNameMatchingRegex(Scanner scnr, String prompt, String regex) {
		boolean isValid = false;
		String input;

		do {
			input = getString(scnr, prompt);
			if (input.matches(regex)) {
				isValid = true;
				System.out.println("Name is valid :)");
			} else {
				System.out.println("Invalid name, sorry!");
				isValid = false;
			}
		} while (!isValid);

		return input;
	}
	
	//I validate the email passed in using the RegEx validation method and updated sysout statements

	public static String getEmailMatchingRegex(Scanner scnr, String prompt, String regex) {
		boolean isValid = false;
		String input;

		do {
			input = getString(scnr, prompt);
			if (input.matches(regex)) {
				isValid = true;
				System.out.println("Email is valid :)");
			} else {
				System.out.println("Invalid email, sorry!");
				isValid = false;
			}
		} while (!isValid);

		return input;
	}
	
	//I validate the phone number passed in using the RegEx validation method and updated sysout statements
	
	public static String getPhoneMatchingRegex(Scanner scnr, String prompt, String regex) {
		boolean isValid = false;
		String input;

		do {
			input = getString(scnr, prompt);
			if (input.matches(regex)) {
				isValid = true;
				System.out.println("Phone number is valid :)");
			} else {
				System.out.println("Invalid phone number, sorry!");
				isValid = false;
			}
		} while (!isValid);

		return input;
	}
	
	//I validate the date passed in using the RegEx validation method and updated sysout statements
	
	public static String getDateMatchingRegex(Scanner scnr, String prompt, String regex) {
		boolean isValid = false;
		String input;

		do {
			input = getString(scnr, prompt);
			if (input.matches(regex)) {
				isValid = true;
				System.out.println("Date is valid :)");
			} else {
				System.out.println("Invalid date, sorry!");
				isValid = false;
			}
		} while (!isValid);

		return input;
	}

}
