package br.com.dio.exercicios.arrays;

public class Ex1_OrdemInversa {
	public static void main(String[] args) {
		int[] vetor = {0, -5, 15, 50, 8, 4};
		int i = vetor.length - 1;
		 while(i >= 0){
			System.out.print(vetor[i]+ " ");
			i--;
		}
	}
}
