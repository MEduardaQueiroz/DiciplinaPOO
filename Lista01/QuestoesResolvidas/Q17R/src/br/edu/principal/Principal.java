package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double sal , cheque1 , cheque2 , cpmf1 , cpmf2 , saldo;
		Scanner sc = new Scanner(System.in);

		System.out.println("O valor do salario que recebeu : ");
		sal = sc.nextDouble();
		System.out.println("Emitiu o cheque 1 : ");
		cheque1 = sc.nextDouble();
		System.out.println("Emitiu o cheque 2 : ");
		cheque2 = sc.nextDouble();

		cpmf1 = cheque1 *0.38 / 100;
		cpmf2 = cheque2 *0.38 / 100;
		saldo = sal - cheque1 - cheque2 - cpmf1 - cpmf2;
		System.out.println("saldo : "+saldo);

		}

		
	}


