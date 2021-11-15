package br.com.dio.exercicios.arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] numerosAleatorios = new int[20];
		
		for(int i = 0; i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		System.out.println("Numeros Aleatórios: ");
		for(int c:numerosAleatorios) {
			System.out.print(c + " ");
		}
		System.out.println("\nSucessores dos Numeros aleatórios: ");
		for(int c:numerosAleatorios) {
			System.out.print(c+1 + " ");
		}
		System.out.println("\nAntecessores dos Numeros aleatórios: ");
		for(int c:numerosAleatorios) {
			System.out.print(c-1 + " ");
		}
	}

}
