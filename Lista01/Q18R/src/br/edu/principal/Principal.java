package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double peso_do_saco , racao_gato1 , racao_gato2 , total_final;
		
		System.out.println("O peso do saco :");
		peso_do_saco = sc.nextDouble();
		System.out.println("A quantidade de raçao fornecida ao gato 1 : ");
		racao_gato1 = sc.nextDouble();
		System.out.println("A quantidade de raçao fornecida ao gato 2 : ");
		racao_gato2 = sc.nextDouble();
		
		racao_gato1 = racao_gato1 /1000;
		racao_gato2 = racao_gato2 /1000;
		total_final = peso_do_saco - 5 * (racao_gato1 +racao_gato2);
		
		System.out.println("O que restará no saco : "+total_final);
		


	}

}
