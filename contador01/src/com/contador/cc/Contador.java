package com.contador.cc;

public class Contador {
	public static void main(String[] args) {
		int cc = 1;
		while (cc < 10) {
			cc++;
			if (cc == 3 || cc == 5 || cc == 9 ) {
				continue;
			}
			if(cc==8) {
				break;
			}
			System.out.println("Número é: " + cc);
			
		}
	}
}
