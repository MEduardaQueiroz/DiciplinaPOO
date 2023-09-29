package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ang,dist,rad,escada;
		

        System.out.print("Digite o ângulo em graus: ");
        ang = sc.nextDouble();
        System.out.print("Digite a distancia em que a escada esta da parede: ");
        dist = sc.nextDouble();
        
        rad = Math.toRadians(ang);
        escada = dist/ Math.cos(rad);
        
        System.out.print("O comprimento da escada é:" + escada );
        
	}



	}


