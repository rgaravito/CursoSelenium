package com.java;

public class DataTypes {

	public static void main(String[] args) {
		// Datos primitivos

		byte var1 = 1; // num�rico entero
		short var2 = 1; // num�rico entero
		int var3 = 1; // num�rico entero
		long var4 = 1L; // num�rico entero
		float var5 = 1.2f;
		double var6 = 1.2;
		char var7 = 'a';
		boolean var8 = true;

		// Char symbol example (Unicode)
		char symbol = '\u00A9';

		// Cadena char
		String message = "Hello";

		// Imprimir en consola
		System.out.println(symbol);
		System.out.println(message);

		// Concatenaci�n se representa con el signo +
		System.out.println(message + symbol);

		int numero = 1;
		String nombre = "Roc�o";
		System.out.println(nombre + numero);
		
		int numero1 = 21;
		int numero2 = 30;
		System.out.println(numero1+numero2);
		
		int numero12 = 21;
		int numero23 = 30;
		System.out.println(numero12+" "+numero23);

	}

}
