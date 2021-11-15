package br.com.dio.exercicios.arrays;

import java.util.Random;

public class Ex4_ArrayMultidimensional {

	public static void main(String[] args) {
		Random random = new Random();
		int[][] matriz = new int[4][4];
		
		for(int i = 0; i < 4;i++) {
			for(int j = 0; j < 4; j++) {
				int numero = random.nextInt(10);
				matriz[i][j] = numero;
			}
		}
		
		for(int i = 0; i < 4;i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print("[" + matriz[i][j] + "] ");
			}
			System.out.println("\n");
		}
	}

}
