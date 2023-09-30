package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num , frac , arred ;
		int i;

		System.out.println("Receba um numero real :  ");
		num = sc.nextDouble();
		i = (int)num;
		frac = num - i;
		arred =Math.round(num);

		System.out.println("A parte inteira desse número :  " + i);
		System.out.println("A parte fracionaria desse número : "+frac);
		System.out.println("O arredondamento desse numero : "+ arred);


		}

		

	}


