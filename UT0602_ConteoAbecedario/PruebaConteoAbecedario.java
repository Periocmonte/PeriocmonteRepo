/**
 * 1. Clase que permite introducir una cadena por teclado
 * 2. Imprimir por pantalla el número de veces que aparece cada letra del abecedario en el texto
 * 	- Utilizar un array de contadores donde se asocie la posición con el contador correspondiente ('a'-'a'=0, 'b'-'a'=1 y así sucesivamente)
 * 3. En una línea aparecerán las letras del abecedario y en la siguiente el número de veces que aparece cada letra
 * 4. No se distinguirán entre mayúsculas y minúsculas (no case sensitive)
 */

package UT0602_ConteoAbecedario;

import java.util.Scanner;

public class PruebaConteoAbecedario{
	public static void main(String[] args){
		String sTeclado="";
		boolean bSalir=false;

		System.out.println(" ************** Conteo de Abecedario **************");
	
		//Capturamos el texto introducido por teclado
		System.out.println("Por favor, introduce un texto que no supere los 20 caracteres");
		Scanner objScanner=new Scanner(System.in);
		do{
			sTeclado=objScanner.nextLine();
			if((sTeclado.length()==0)||(sTeclado.length()>20)){
				bSalir=false;
				System.out.println("No has introducido ningún texto válido (" + sTeclado.length() + "). Por favor, introduce un texto no superior a 20 caracteres");
			}else{
				bSalir=true;
			}//if sTeclado=0?
		}while(!bSalir);

		//Transformamos el texto introducido a minúsculas porque el requisito indica que no se distinguirán mayúsculas de minúsculas
		sTeclado=sTeclado.toLowerCase();
		ConteoAbecedario objLetras=new ConteoAbecedario(sTeclado);
		objLetras.fCuentaLetras();

		
		System.out.println(" ************** FIN Conteo de Abecedario **************");
	}//main
}//PruebaConteoAbecedario