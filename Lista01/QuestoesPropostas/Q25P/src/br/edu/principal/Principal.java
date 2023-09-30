package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double hora , minutos ,min_total , segundos , hr_min ;
		
		System.out.println("Digite um valor para hora:");
		hora = sc.nextDouble();
		System.out.println("Digite o valor de minutos:");
		minutos = sc.nextDouble();
		
		
		hr_min = hora*60;
		min_total = minutos + hr_min;
		segundos = min_total * 60;
				
		
		// Alternativa A
		System.out.println("A hora digitada convertida em minutos resultam em " +hr_min+ " minutos.");
		//Alternativa B
		System.out.println("O total de minutos mais a conversao que fizemos anteriormente: " +min_total);
		//Alternativa C
		System.out.println("Os minutos convertidos em segundos resultam em " +segundos+ " segundos.");

	}



	}


