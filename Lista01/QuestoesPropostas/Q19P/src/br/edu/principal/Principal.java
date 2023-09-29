package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double lado1 , lado2 , area , potencia ;
		
		System.out.println("Digite a dimencao do lado 1:");
		lado1 = sc.nextDouble();
		System.out.println("Digite a dimencao do lado 2:");
		lado2 = sc.nextDouble();
		
		area = lado1*lado2;
		potencia = area*18;
		
		System.out.println("A area de um comodo em metros quatrados é:" + area + (" ") + "A potencia de iluminaçao que ira ser necessaria é:" + potencia );

	}

}
