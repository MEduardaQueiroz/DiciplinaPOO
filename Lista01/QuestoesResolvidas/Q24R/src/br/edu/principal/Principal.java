package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double hora , m , conversao;

		System.out.println("Receba uma hora formada por hora e minutos : ");
		hora = sc.nextDouble();
		int h = (int ) hora ;
		m = hora - h;
		conversao = (h*60) + (m*100);
		System.out.println(" A hora em minutos é :"+conversao+ "minutos");



		}

		

	}


