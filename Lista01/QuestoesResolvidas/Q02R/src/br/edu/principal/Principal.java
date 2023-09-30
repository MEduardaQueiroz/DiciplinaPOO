package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double nota1,nota2,nota3,media;
		Scanner sc = new Scanner(System.in);

		        System.out.println("O valor da nota1 é:");
		        nota1 = sc.nextDouble();
		        System.out.println("O valor da nota2 é:");
		        nota2 = sc.nextDouble();
		        System.out.println("O valor da nota3 é:");
		        nota3 = sc.nextDouble();
		       
		        media= (nota1+ nota2+nota3)/3;
		        System.out.println("A média é:"+ media);
		       
		}

		

	}


