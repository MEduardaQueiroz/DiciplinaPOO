import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double num,quad,cubo,raio2,raio3;
		Scanner sc = new Scanner(System.in);

		System.out.println("num:");
		num = sc.nextDouble();
		quad = Math.pow(num,2);
		cubo = Math.pow(num,3);
		raio2 = Math.sqrt(num);
		raio3 = Math.sqrt(num);
		System.out.println("o numero digitado ao quadrado:"+quad);
		System.out.println("o numero digitado ao cubo:"+cubo);
		System.out.println("a raiz quadrada do numero digitado:"+raio2);
		System.out.println("a raiz cubica do numero digitado:"+raio3);
		}

		

}
