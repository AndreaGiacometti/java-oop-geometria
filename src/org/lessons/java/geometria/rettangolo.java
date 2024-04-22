package org.lessons.java.geometria;

public class rettangolo {
	int base;
	int altezza;
	
	public int calcolaArea(int numero1, int numero2) {
		int area = base * altezza;
		return area;
	}
	
	public int calcolaPerimetro(int numero1, int numero2) {
		int perimetro = (base * 2) + (altezza * 2);
		return perimetro;
	}
}