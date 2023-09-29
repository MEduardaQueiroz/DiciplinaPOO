package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double  sal_fixo , vlr_das_vendas , comissao , sal_final;
		
		System.out.println("Digite o salário fixo do funcionário:");
		sal_fixo = sc.nextDouble();
		System.out.println("O valor de suas vendas:");
		vlr_das_vendas = sc.nextDouble();
		
		comissao = vlr_das_vendas * 4/100;
		sal_final = sal_fixo + comissao;
		System.out.println("O valor de comissão é de R$" +comissao+ " e o salário final é de R$" +sal_final);
		
		
		

	}

}
