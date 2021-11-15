package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class Ex2_Consoantes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] letras = new String[6];
		int consoantes = 0;
		
		int i = 0;
		do {
			System.out.println(i+1 + "° Letra: ");
			String letra = scan.next();
			
			if(!(letra.equalsIgnoreCase("a") |
					letra.equalsIgnoreCase("e") |
					letra.equalsIgnoreCase("i") |
					letra.equalsIgnoreCase("o") |
					letra.equalsIgnoreCase("u"))){
				letras[i] = letra;
				consoantes++;
			}
			i++;
		}while(i < letras.length); 
		
		for(String c : letras) {
			if(c != null) System.out.print(c + " ");
		}
		System.out.println("\nQuantidade de consoantes: " + consoantes);
		scan.close();
	}
}
