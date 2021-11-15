package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("--------- FATORIAL ---------");
		System.out.println("\nDigite a o numero desejado para calculo de fatorial: ");
		int total = 1, fatorial = scan.nextInt();
		for (int i = fatorial; i >= 1; i--) total *= i;
		System.out.println("Fatorial de "+ fatorial + " é igual a: "+ total);
		scan.close();
	}
}
