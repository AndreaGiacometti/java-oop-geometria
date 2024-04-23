package org.lessons.java.geometria;

public class Rettangolo {
		int base;
		int altezza;

		int calcolaArea() {
			int area = base * altezza;
			return area;
		}
		
		int calcolaPerimetro() {
			int perimetro = (base * 2) + (altezza * 2);
			return perimetro;
		}
	}