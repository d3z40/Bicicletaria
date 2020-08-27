package sistemabicicletaria;

import java.util.Scanner;

public class DigitoUser {
	private static Scanner sc;
	
	public static int intUser(String msg) {
		int intVal = -1;
		sc = new Scanner(System.in);
		while(intVal < 0) {
			System.out.println(msg);
			try {
				intVal = sc.nextInt();
			} catch (Exception e) {
				sc.next();
				System.out.println("Valor Inválido, tente novamente!");
			}
		}
		
		return intVal;
	}

	public static String stringUser(String msg) {
		sc = new Scanner(System.in);
		System.out.println(msg);
		
		return sc.next();
	}

	public static double doubleUser(String msg) {
		double dblVal = -1;
		sc = new Scanner(System.in);
		while (dblVal < 0) {
			System.out.println(msg);
			try {
				dblVal = sc.nextDouble();
			} catch (Exception e) {
				sc.next();
				System.out.println("Valor Inválido, tente novamente!");
			}
		}
		
		return dblVal;
	}

}