package com.java;

import java.util.Scanner;

public class Ejercicio5Números {

	public static void main(String[] args) {
		
	
	int número;
	String respuesta;
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Ingrese un número entero: " );
	número = teclado.nextInt();
	
		if (número % 2 == 0)
		{
			respuesta = "ES PAR ";
		}
		else
		{
			respuesta = "ES IMPAR ";
		}
		
		if (número < 0)
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
