package com.greatlearning.services;

import java.util.Random;

import com.greatlearning.entity.Employee;

public class CredentialService {

	Employee employee;
	private String email;
	private String password = "";

	public CredentialService(Employee employee) {
		this.employee = employee;
	}

	public void generatePassword() {
		String alphabet = "ABCDEFGHIIJKLMNOPQRSTUVQXYZabcdefghijklmnopqrstuvwqyz1234567890!@#$%^&*";
		Random random = new Random();
		char generatedChar;
		for (int i = 0; i < 8; i++) {
			generatedChar = alphabet.charAt(random.nextInt(alphabet.length()));
			password += generatedChar;
		}
	}

	public void generateEmailAddress() {
		email = employee.getFirstName().toLowerCase() + employee.getLastName().toLowerCase() + "@"
				+ employee.getDepartment() + "." + "xyz" + "." + "com";
	}

	public void showCredentials() {
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);
	}

}
