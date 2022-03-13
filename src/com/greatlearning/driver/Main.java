package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.entity.Employee;
import com.greatlearning.services.CredentialService;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String firstName;
		String lastName;
		String department = null;

		System.out.println("Welcome to IT Support");

		System.out.println("Enter your first name");

		firstName = scanner.nextLine();

		System.out.println("Enter your last name");

		lastName = scanner.nextLine();

		System.out.println("Your first name: " + firstName + ", your last name: " + lastName);

		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		int departmentOption = scanner.nextInt();

		switch (departmentOption) {

		case 1:
			department = "tech";
			break;
		case 2:
			department = "adm";
			break;
		case 3:
			department = "hr";
			break;
		case 4:
			department = "lgl";
			break;
		default:
			System.out.println("Invalid department");
			break;
		}

		System.out.println("Department selected: " + department);

		scanner.close();

		Employee employee = new Employee(firstName, lastName, department);
		CredentialService credentialService = new CredentialService(employee);
		credentialService.generateEmailAddress();
		credentialService.generatePassword();
		credentialService.showCredentials();

	}

}
