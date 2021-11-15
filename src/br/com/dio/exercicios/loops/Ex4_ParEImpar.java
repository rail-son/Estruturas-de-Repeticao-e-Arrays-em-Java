package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de números a ser digitados: ");
		int qtd_numeros = scan.nextInt();
		
		System.out.println("Digite " + qtd_numeros + " números inteiros: ");
		
		int pares = 0, impares = 0, i = 0;
		
		do {
			System.out.println("Numero " + (i+1) + ": ");
			int numero = scan.nextInt();
			if(numero%2 == 0) pares++;
			else impares++;
			i++;
		} while(i < qtd_numeros);
		
		System.out.println("\nForam digitados " + pares + " números PARES e " + impares + " números IMPARES.");
	}
}
