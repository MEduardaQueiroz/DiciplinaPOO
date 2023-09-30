package br.edu.principal;

import java.util.Scanner;

public class Pricipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double preço , novo_preço;

		System.out.print("Digite o preço do produto:");
		preço = sc.nextDouble();
		novo_preço = (preço*10)/100;
		System.out.println("O valor do novo produto é: "+novo_preço);

		}

		
	}


