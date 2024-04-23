package org.lessons.java.geometria;

public class Rettangolo {
	public int base;
	public int altezza;

	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	public int calcolaArea() {
		int area = base * altezza;
		return area;
	}

	public int calcolaPerimetro() {
		int perimetro = (base * 2) + (altezza * 2);
		return perimetro;
	}
}