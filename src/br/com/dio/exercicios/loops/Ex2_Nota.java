package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex2_Nota {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nota: ");
		int nota;
		nota = scan.nextInt();
		
		while(nota < 0 | nota > 10) {
			System.out.println("Nota Inválida! Digite novamente: ");
			nota = scan.nextInt();
		}
		
		scan.close();
		/**
		 * while(true) {
			
			System.out.print("Digite uma nota: ");
			Float nota = scan.nextFloat();
			if(nota < 0 || nota > 10) {
				System.out.println("Valor inválido!!! A nota deve ser entre 0 e 10. Tente novamente");	
				continue;
			}
			System.out.println("Nota incluída com sucesso!");
			break;
		}
		 */
	}
}
