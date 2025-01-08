package Ejercicio_UT05;

import java.util.Scanner;

public class PruebaCuantaBancaria{
	public static void main (String[] args){
		private String sTeclado="";
		private int iIngreso=0;
		CuentaBancaria objCB=new CuentaBancaria();
	
		System.out.println("Indique la cantidad a ingresar en la cuenta");
		do{
			Scanner objScanner=new Scanner(System.in);
			sTeclado=objScanner.nextLine();
			iIngreso=Integer.parseInt(sTeclado);
			if(iIngreso<0 && iIngreso>100.000){
				System.out.println("Vuelva a indicar la cantidad a ingresar en la cuenta y que sea entre 0 y 100.000");
			}//if iIngreso
		}while(iIngreso<0 && iIngreso>100.000);
		if(objCB.fIngreso(iIngreso)){
			System.out.printf("\n El ingreso fue correcto, por lo que ahora se presenta un saldo de %d \n",
				objCB.fgetSaldo());
		}//objCB.fIngreso()==true

		
		
	}//main
}//PruebaCuantaBancaria