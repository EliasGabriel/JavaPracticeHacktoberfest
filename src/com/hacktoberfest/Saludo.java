package com.hacktoberfest;
import java.util.Scanner;

public class Saludo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String nombre;
		int edad;
		
		System.out.print("HOLA!!! ");
		
		System.out.print("Cual es tu nombre? ");
		nombre = sc.nextLine();
		
		System.out.print("Que edad tienes? ");
		edad = sc.nextInt();
		
		System.out.print("Buenas tardes " + nombre + ",tienes " + edad + " años");
		sc.close();
		
		if (edad>=18) {
			System.out.print(" y eres mayor de edad");
		}
			else
			System.out.print(" y eres menor de edad");
		sc.close();
		}
	}
