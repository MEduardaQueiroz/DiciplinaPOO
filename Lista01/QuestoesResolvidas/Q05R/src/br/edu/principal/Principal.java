package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double sal, perc, aumento, novosal;
		Scanner sc = new Scanner (System.in);

		System.out.println("o valor do salario é:");
		sal = sc.nextDouble();
		System.out.println("O percentual de aumento:");
		perc = sc.nextDouble();
		aumento= sal*perc/100;
		System.out.println("aumento:"+ aumento);
		novosal = sal + aumento;
		System.out.println("novo salario :"+ novosal);

		}

		



	}


