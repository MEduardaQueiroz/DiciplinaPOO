package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double peso , novo_peso15 , novo_peso20  ;
		
		System.out.println("Digite o peso da pessoa:");
		peso = sc.nextDouble();
		
		novo_peso15 = peso + (peso*15/100);
		novo_peso20 = peso - (peso*20/100);
		
		System.out.println("Se você engordar 15%,ficará com " +novo_peso15+ " kg.");
		System.out.println("Se você emagrecer 20%, ficará com " +novo_peso20+ " kg.");
		

	}

}
