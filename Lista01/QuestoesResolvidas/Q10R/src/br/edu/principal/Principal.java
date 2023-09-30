package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double area,raio;
		Scanner sc = new Scanner(System.in);

		System.out.println("area:");
		area = sc.nextDouble();
		System.out.println("raio:");
		raio = sc.nextDouble();
		   area = 3.1415*Math.pow(raio, 2);
		System.out.println("area de um circulo:"+ area);

		}

		

	}


