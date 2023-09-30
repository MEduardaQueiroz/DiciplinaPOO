package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		double n1, n2 ,n3 ,n4,soma;
		Scanner nn = new Scanner(System.in);

		System.out.println("O valor da n1 é:");
		n1 = nn.nextDouble();
		System.out.println("O valor da n2 é:");
		n2 = nn.nextDouble();
		System.out.println("O valor da n3 é:");
		n3 = nn.nextDouble();
		System.out.println("O valor da n4 é:");
		n4 = nn.nextDouble();

		soma= n1 + n2 + n3 + n4;
		System.out.println("O valor da soma é:" + soma);

		}

		}