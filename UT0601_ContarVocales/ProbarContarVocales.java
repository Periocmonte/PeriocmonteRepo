/**
* 1. Crear una clase que recoja un texto por teclado
* 2. Cuente las vocales del texto introducido por teclado
* 	- Debe considerar mayúsculas como minúsculas y tiles
*/

<<<<<<< HEAD

package UT0601_ContarVocales;

import java.util.Scanner;

public class ProbarContarVocales{
=======
package fp_Programacion_Clases_UT06.UT0601_ContarVocales;

import java.util.Scanner;

public class ProbarContarVocales {
>>>>>>> main
	public static void main(String[] args){
		String sTeclado="";
		boolean bSeguir=false;

		System.out.println("********* Contar vocales *********\n\n");

		//Leemos la el literal introducido por teclado chequeando que no supera los 20 caracteres
		System.out.println("Introduce un texto no superior a 20 caracteres");
		Scanner objScaner=new Scanner(System.in);
		do{
			sTeclado=objScaner.nextLine();
			if(sTeclado.length()>20){
				bSeguir=false;
				System.out.println("Has superado el límite de 20 caracteres. Por favor, introduce nuevamente el texto");
			}else{
				bSeguir=true;
			}//if
		}while(!bSeguir);

		ContarVocales objContarVoc=new ContarVocales(sTeclado);

		//Invocamos al método toString() para mostrar el recuento
		System.out.println(objContarVoc);

	}//main
}//ProbarContarVocales