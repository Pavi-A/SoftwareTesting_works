package org.biodata;

import java.util.Scanner;

public class BioData {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("1.Student Name?");
		String name = scanner.nextLine();
		System.out.println("2.Student Id?");
		int Id = scanner.nextInt();
		System.out.println("3.Student mail?");
		String mail = scanner.next();
		System.out.println("4.Department name?");	
		String department = scanner.next();
		System.out.println("5.Gender?");
		String gender = scanner.next();
		System.out.println("6.Your city?");
		String city = scanner.next();
		System.out.println("7.what is your mobile number?");
		float number = scanner.nextInt();
				}
}
