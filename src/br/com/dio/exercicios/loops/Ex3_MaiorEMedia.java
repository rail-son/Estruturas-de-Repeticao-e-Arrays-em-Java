package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero, i=0, maior = 0, soma = 0, media;
		do {
			System.out.println("Numero "+ (i+1) + ": ");
			numero = scan.nextInt();
			if(numero > maior) {
				maior = numero;
			}
			soma += numero; 
			
			i++;
		}while(i<5);
		
		media = soma/5;
		System.out.println("\nO maior número é: " + maior + "\nE a média entre eles é: " + media);
		scan.close();
	}
}
