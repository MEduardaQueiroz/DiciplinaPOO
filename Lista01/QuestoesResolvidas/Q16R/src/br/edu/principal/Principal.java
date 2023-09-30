package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double horas_t , vlr_min , vlr_hora_t , vlr_bru , imp , vlr_liq;
		Scanner sc = new Scanner(System.in);

		System.out.println("Receber o numero de horas trabalhadas :");
		horas_t = sc.nextDouble();
		System.out.println("Receber o valor do salário minimo :");
		vlr_min = sc.nextDouble();

		vlr_hora_t = vlr_min / 2;
		vlr_bru = vlr_hora_t * horas_t;
		imp = vlr_bru *3 / 100;
		vlr_liq = vlr_bru - imp;

		System.out.println("O valor a receber do salário liquido : "+ vlr_liq);

		}

		




	}


