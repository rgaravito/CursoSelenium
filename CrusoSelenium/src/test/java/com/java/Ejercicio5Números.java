package com.java;

import java.util.Scanner;

public class Ejercicio5N�meros {

	public static void main(String[] args) {
		
	
	int n�mero;
	String respuesta;
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Ingrese un n�mero entero: " );
	n�mero = teclado.nextInt();
	
		if (n�mero % 2 == 0)
		{
			respuesta = "ES PAR ";
		}
		else
		{
			respuesta = "ES IMPAR ";
		}
		
		if (n�mero < 0)
		{
			respuesta = respuesta + "Y" + " ES NEGATIVO";
		}
		else
		{
			respuesta = respuesta + "Y" + " ES POSITIVO";
		}
		
		System.out.println(respuesta);
	}

}
