package Numeros;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n,num,cont=0,suma=0;
		System.out.println("Ingrese la cantidad de numeros a evaluar:");
		n = scan.nextInt();
		for(int i =1 ; i<=n ; i++)
		{
			do {
			System.out.println("Ingrese el numero");
			num = scan.nextInt();
			}
			while(num==0);
			if(num>=1) {
				suma=suma+num;
				
			}
			else if(num<1)
			{
				
			cont= cont +1;	
			}
		}
		System.out.println("La suma es:"+suma);
		System.out.println("Contador de negativos:"+cont);

	}

}
