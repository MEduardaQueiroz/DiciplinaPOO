package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double real,dolar,marco,libra;
		
		System.out.println("Digite o valor que vai ser levado para a viagem em reais : ");
		 real = sc.nextInt();
		 
		 dolar = real*1.80;
		 marco = real*2;
		 libra = real*3.57;
		 
		 System.out.println("Digite o valor que vai ser levado para a viagem em dolares ser� : " + dolar);
		 System.out.println("Digite o valor que vai ser levado para a viagem em marcos alem�es ser� : " + marco);
		 System.out.println("Digite o valor que vai ser levado para a viagem em libras ser� : " + libra);
	}



	}
 

