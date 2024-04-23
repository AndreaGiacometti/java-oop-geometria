package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Rettangolo rettangolo = new Rettangolo();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserisci un valore per la base: ");
		
		rettangolo.base = scanner.nextInt();
		
		System.out.println("Il valore della base del rettangolo è: " + rettangolo.base);
		
		System.out.print("Inserisci un valore per l'altezza: ");
		
		rettangolo.altezza = scanner.nextInt();
		
		System.out.println("Il valore dell'altezza del rettangolo è: " + rettangolo.altezza);
		
		scanner.close();
		
		System.out.println("Il valore dell'area è: " + rettangolo.calcolaArea());
		
		System.out.println("Il valore del perimetro è: " + rettangolo.calcolaPerimetro());
		
	}

}
