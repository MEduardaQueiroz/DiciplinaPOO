package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double ano_atual, ano_nascimento,idade_atual,idade_2050;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("O ano atual que est� : ");
		ano_atual = sc.nextDouble();
		
		System.out.println(" O ano que nasceu : ");
		ano_nascimento = sc.nextDouble();
		
		idade_atual = ano_atual - ano_nascimento;
		idade_2050 = 2050 - ano_nascimento;
		
		System.out.println("Sua idade atual : " +idade_atual );
		System.out.println("A idade que ter� em 2050 : "+idade_2050);
		

	}

}
