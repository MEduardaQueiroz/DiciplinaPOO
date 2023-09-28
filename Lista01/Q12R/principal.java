import java.util.Scanner;
//aluna 
public class principal {

	public static void main(String[] args) {
		double num1,num2,raio1,raio2;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("num1:");
	    num1 = sc.nextDouble();
	    System.out.println("num2");
	    num2 = sc.nextDouble();
	    raio1 = Math.pow(num1, num2);
	    raio2 = Math.pow(num2,num1);
	    System.out.println("raio1");
		System.out.println("raio2");

	}

}
