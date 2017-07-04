package fr.operateurs.console;

import java.util.Scanner;

public class OperateursApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Veuillez saisir le premier nombre ");
		int a= scan.nextInt();
		
		System.out.println("Veuillez saisir le premier nombre ");
		int b= scan.nextInt();
		int result = a + b;
		System.out.println(a + "+" + b + " = " +result);
		result = a - b;
		System.out.println(a + "-" + b + " = " +result);
		result = a * b;
		System.out.println(a + "*" + b + " = " +result);
		result = a / b;
		System.out.println(a + "/" + b + " = " +result);
		result = a % b;
		System.out.println(a + "%" + b + " = " +result);

		
		

	}

}
