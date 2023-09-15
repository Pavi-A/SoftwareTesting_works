package org.scanner;

import java.util.Scanner;

public class scanner {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("1. what is employeer name?");
	String name = scanner.nextLine();
	System.out.println("My name is"+ name);
	System.out.println("2.what is your employement Id number?");
	int Id = scanner.nextInt();
	System.out.println("My Id number is"+ Id);
	System.out.println("3.Give me your mail?");
	String mail = scanner.nextLine();
	System.out.println("My mail is pavialagar03@gmail.com");
	System.out.println("4. Give me your salary details?");
	int salary = scanner.nextInt();
    System.out.println("5.where are you from?");
    String from = scanner.nextLine();
    System.out.println("coming from madurai");
}
}
