package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex1_NomeEIdade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome;
		int idade;


		while(true){
			System.out.println("Digite seu nome: ");
			nome = scan.next();

			if(nome.equals("0")) break; // O método equals é utilizado para comparações.
			// break para o laço caso a condição for verdadeira(digitar o número 0 no campo nome)
			
			System.out.println("Idade: ");
			idade = scan.nextInt();
		}

		System.out.println("Continua aqui...");
		
		
		
	}

}

