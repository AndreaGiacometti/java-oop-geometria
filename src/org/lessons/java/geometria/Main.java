package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Rettangolo rettangolo = new Rettangolo();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserisci un valore per la base: ");
		
		rettangolo.base = scanner.nextInt();
		
		System.out.println("il valore della base del rettangolo è: " + rettangolo.base);
		
		System.out.print("Inserisci un valore per l'altezza: ");
		
		rettangolo.altezza = scanner.nextInt();
		
		System.out.println("il valore dell'altezza del rettangolo è: " + rettangolo.altezza);
		
		scanner.close();
		
		int area = rettangolo.calcolaArea();
		
		System.out.println("Area: " + area);
		
		int perimetro = rettangolo.calcolaPerimetro();
		
		System.out.println("Perimetro: " + perimetro);
		
	}

}
