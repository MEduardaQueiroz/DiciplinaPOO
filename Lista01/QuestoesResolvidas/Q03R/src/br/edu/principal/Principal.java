package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args ) {
		double nota1,nota2,nota3,peso1,peso2,peso3,media;
		Scanner sc = new Scanner(System.in);

		        System.out.println("Insira a nota1:");
		        nota1 = sc.nextDouble();
		        System.out.println("Insira a nota2:");
		        nota2 = sc.nextDouble();
		        System.out.println("Insira a nota3:");
		        nota3 = sc.nextDouble();
		        System.out.println("Insira a peso1:");
		        peso1 = sc.nextDouble();
		        System.out.println("Insira a peso2:");
		        peso2 = sc.nextDouble();
		        System.out.println("Insira a peso3:");
		        peso3 =sc.nextDouble();
		       
		        media =(nota1 *peso1+ nota2 * peso2+ nota3* peso3 )/(peso1+peso2+peso3);
		        System.out.println("O resultado da media final é:"+media);
		       
		}

		

	}


