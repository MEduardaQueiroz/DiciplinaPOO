package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double custo , convite , qtd;

		System.out.println("Digite o custo de um espetaculo teatral : ");
		custo = sc.nextDouble();
		System.out.println(" Digite o preço do convite desse espetaculo : ");
		convite = sc.nextDouble();

		qtd = custo / convite;

		System.out.println("Dem ser vendidos "+qtd + "convites para que o custo seja alcançado");

		}

		


	}


