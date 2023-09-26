package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double vlr_sal , qtd_kw , vlr_kw , vlr_reais  , desc , vlr_desc;
		
		
		
		System.out.println("O valor do salario minimo é : ");
		vlr_sal = sc.nextDouble();
		System.out.println("A quantidade de quilowatts consumida por uma residencia : ");
		qtd_kw = sc.nextDouble();
		vlr_kw = vlr_sal/ 5;
		vlr_reais = vlr_kw * qtd_kw;
		desc = vlr_reais * qtd_kw;
		vlr_desc = vlr_reais *15 /100;
		vlr_desc = vlr_reais - desc;
		
		System.out.println("O valor de cada quilowatt : "+ vlr_kw);
		System.out.println("O valor a ser pago por essa residência : "+vlr_reais);
		System.out.println("O valor a ser pago com desconto de 15% : "+vlr_desc);
		

	}



		
	}


