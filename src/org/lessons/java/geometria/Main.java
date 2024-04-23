package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Inserisci un valore per la base: ");
		int base = scanner.nextInt();
		System.out.println("Il valore della base del rettangolo è: " + base);
		System.out.print("Inserisci un valore per l'altezza: ");
		int altezza = scanner.nextInt();
		System.out.println("Il valore dell'altezza del rettangolo è: " + altezza);
		scanner.close();
		Rettangolo rettangolo = new Rettangolo(base, altezza);
		System.out.println("Il valore dell'area è: " + rettangolo.calcolaArea());
		System.out.println("Il valore del perimetro è: " + rettangolo.calcolaPerimetro());
	}

}