/**
* Requisitos:
* 1. Instanciar un objeto de tipo CuentaBancaria con saldo inicial 100€ comprobando el saldo
* 2. Sacar un reintegro de 50€ comprobando el saldo
* 3. Ingresar 100€ comprobando el saldo
* 
*/

package Ejercicio_UT05;

import java.util.Scanner;

public class PruebaCuantaBancaria{
	public static void main (String[] args){
		boolean bSalir=false;
		String sTeclado="";
		int iImporte=0;
		String sAccion=""; 	// Donde sAccion=I --> Ingresar
				       		//	 sAccion=S --> Sacar dinero
		

		//Requisito 1 - Instanciar Objeto CuentaBancaria inicializado con 100€ 
		CuentaBancaria objCB=new CuentaBancaria("Antoñito Pakito", "ES6695-564-54-23", 'F', 100);
		//System.out.println("objCB.fgetNumCuenta():" + objCB.fgetNumCuenta());
		//System.out.println("objCB.fgetNombreTit():" + objCB.fgetNombreTit());
		//System.out.println("objCB.fgetDescripcionTipoCuenta():" + objCB.fgetDescripcionTipoCuenta());
		//System.out.println("objCB.fgetSaldo():" + objCB.fgetSaldo());
		
		//Obtenemos el saldo inicial
		System.out.printf("La cuenta con número \"%s\" cuyo titular es \"%s\" con tipo de interes \"%s\" tiene un saldo inicial de %,07.2f €\n",
			objCB.fgetNumCuenta(), objCB.fgetNombreTit(), objCB.fgetDescripcionTipoCuenta(), objCB.fgetSaldo());
		
		//Requisito 2 - Sacar 50€ (reintegro)
		objCB.fReintegro(50);
		//Obtenemos el saldo 
		System.out.printf("El saldo de la cuenta con número \"%s\" cuyo titular es \"%s\" con tipo de interes \"%s\" tras la retirada de 50€ es de %,07.2f €\n", 
			objCB.fgetNumCuenta(), objCB.fgetNombreTit(), objCB.fgetDescripcionTipoCuenta(), objCB.fgetSaldo());

		//Requisito 3 - Ingresar 100€ 
		objCB.fIngreso(100);
		//Obtenemos el saldo 
		System.out.printf("El saldo de la cuenta con número \"%s\" cuyo titular es \"%s\" con tipo de interes \"%s\" tras el ingreso de 100€ es de %,07.2f €", 
			objCB.fgetNumCuenta(), objCB.fgetNombreTit(), objCB.fgetDescripcionTipoCuenta(), objCB.fgetSaldo());

		//Bloque de gestión de la cuenta
		System.out.println("\n\n******************************************************************************************************************");
		System.out.println("******************************************************************************************************************");
		System.out.println("************************ GESTIÓN DEL SALDO POR CONSOLA ***********************************************************");
		System.out.println("******************************************************************************************************************");
		System.out.println("******************************************************************************************************************");
		Scanner objScanner=new Scanner(System.in);
		
		do{
			System.out.println("\nIndique la gestión a realizar sobre la cuenta donde \"I\"=Ingresar dinero, \"E\"=Sacar dinero, \"S\"=Saldo  y \"X\"=Salir");	
			sTeclado=objScanner.nextLine();
			sTeclado=sTeclado.toUpperCase();
			if (sTeclado.length()>1){
				System.out.println("Ha indicado una opción no disponible. Por favor introduzca una letra \"I\"=Ingresar dinero, \"E\"=Sacar dinero o \"S\"=Saldo o \"X\"=Salir");
				bSalir=false;
			}//if sTeclado.length()<>1;
			
			if ((sTeclado.indexOf("I")<0) && (sTeclado.indexOf("E")<0) && (sTeclado.indexOf("S")<0) && (sTeclado.indexOf("X")<0)){
				System.out.println("Ha indicado una opción no disponible.");
			}//if sTeclado <> "I", "E",  "S" o "X"
			
			if (sTeclado.equalsIgnoreCase("I") || sTeclado.equalsIgnoreCase("E") || sTeclado.equalsIgnoreCase("S")){
				sAccion=sTeclado; //Asignamos la acción a realizar (E=Sacar o I=Ingresar dinero)				
				bSalir=false;
			}else if (sTeclado.equalsIgnoreCase("X")) {
				bSalir=true;
				break;
			}else {
				sAccion="";
				bSalir=false;
			}//if sTeclado = "I", "E"? 
			
			//System.out.println("sAcción=[" + sAccion + "]" );

			if(sAccion.equalsIgnoreCase("S")){ //Petición de saldo
				System.out.println(objCB.toString());
			}else if(sAccion.equalsIgnoreCase("")){ //Opción incorrecta
				//Volvemos al menú inicial para que se indique la operación a realizar
			}else {
				if(sAccion.equalsIgnoreCase("I")){
					System.out.println("Indique la cantidad a ingresar en la cuenta");
				}else{
					System.out.println("Indique la cantidad a sacar de la cuenta");
				}//if sAccion
	
			
				do{
					try {
						sTeclado=objScanner.nextLine();
						iImporte=Integer.parseInt(sTeclado);
						if(iImporte<0 || iImporte>100000){
							System.out.println("Vuelva a indicar la cantidad puesto que debe comprenderse entre 0 y 100.000");
						}//if iImporte
					}catch(Exception e) {
						System.out.println("Ha introducido una cantidad incorrecta.");
						e.printStackTrace();
						System.out.println("Vuelva a indicar la cantidad puesto que debe comprenderse entre 0 y 100.000");
					}//try e
				}while(iImporte<0 || iImporte>100000);
		
				if(sAccion.equalsIgnoreCase("I")){
					if(objCB.fIngreso(iImporte)){
						//System.out.printf("\n El ingrseso fue correcto, por lo que ahora se presenta un saldo de %f \n", objCB.fgetSaldo());
					}//objCB.fIngreso()==true
				}else{
					if(objCB.fReintegro(iImporte)){
						//System.out.printf("\n El reintegro/extacción fue correcta, por lo que ahora se presenta un saldo de %f \n", objCB.fgetSaldo());
					}//objCB.fReintegro()==true
				}//if sAccion
			}//if sAccion==S
		}while(!bSalir);
		System.out.println("**************** FIN DEL PROCESO ***********************");
	}//main
}//PruebaCuantaBancaria