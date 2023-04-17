package calculadora;

import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, op;
		double result;
		String aux;
		Scanner sc= new Scanner (System.in);	
		
		System.out.println("Primer número");
		aux=sc.nextLine();
		num1=Integer.parseInt(aux);
		System.out.println("Segundo número");
		aux=sc.nextLine();
		num2=Integer.parseInt(aux);
		System.out.println("Opcion:");
		aux=sc.nextLine();
		op=Integer.parseInt(aux);
		do {
			System.out.println("Opcion:");
			System.out.println("1.- sumar");
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			switch(op) {
			case 1:
				result=num1+num2;
				System.out.println("La suma entre los dos números es: "+result);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 0:
				System.out.println( "Saliendo");
				break;
			default:
				System.out.println("Opción no valida");
				break;
			}
		}while(op!=0);
		System.out.println("Gracias");

	}

}
