package org.lessons.java.geometria;

public class Rettangolo {
		int base;
		int altezza;
		
		public Rettangolo (int base, int altezza) {
			this.base = base;
			this.altezza = altezza;
		}

		int calcolaArea() {
			int area = base * altezza;
			return area;
		}
		
		int calcolaPerimetro() {
			int perimetro = (base * 2) + (altezza * 2);
			return perimetro;
		}
	}