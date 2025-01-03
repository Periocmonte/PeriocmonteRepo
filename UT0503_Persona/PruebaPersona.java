package UT0503_Persona;
import java.util.Scanner;

public class PruebaPersona{
	public static void main(String[] args){
		String sTeclado="", sNombre="", sDNI="";
		char cSexo=' ';
		int iEdad=0;
		double dPeso=0.0, dAltura=0.0;
		
		//Solicitamos el nombre, edad, DNI, sexo, peso y altura de una persona
		Scanner objScanner=new Scanner(System.in);
		System.out.println("\nPor favor, introduce el nombre de la persona");
		sTeclado=objScanner.nextLine();
		sNombre=sTeclado;

		System.out.println("\nPor favor, introduce el edad de la persona");
		sTeclado=objScanner.nextLine();
		iEdad=Integer.parseInt(sTeclado);

		System.out.println("\nPor favor, introduce el DNI de la persona");
		sTeclado=objScanner.nextLine();
		sDNI=sTeclado;

		System.out.println("\nPor favor, introduce el sexo de la persona");
		sTeclado=objScanner.nextLine();
		cSexo=sTeclado.charAt(0);

		System.out.println("\nPor favor, introduce el peso de la persona");
		sTeclado=objScanner.nextLine();
		sTeclado=sTeclado.replace(",", ".");
		dPeso=Double.valueOf(sTeclado);

		System.out.println("\nPor favor, introduce la altura de la persona");
		sTeclado=objScanner.nextLine();
		sTeclado=sTeclado.replace(",", ".");
		dAltura=Double.valueOf(sTeclado);
		
		System.out.println("\n\n");

		//Creamos objeto 1 de Persona con los datos introducidos
		Persona objPersona1=new Persona(sNombre, sDNI, iEdad, cSexo, dPeso, dAltura);

		//Creamos objeto 2 de Persona con los datos introducidos menos peso y altura
		Persona objPersona2=new Persona(sNombre, sDNI, iEdad, cSexo);
		
		//Creamos objeto 3 de Persona con los datos mínimos y le asignamos directamente los datos
		Persona objPersona3=new Persona();
		objPersona3.fsetNombre("Alfonso");
		objPersona3.fsetDNI("000023R");
		objPersona3.fsetSexo('H');
		objPersona3.fsetEdad(8);
		objPersona3.fsetPeso(53.32);
		objPersona3.fsetAltura(1.58);

		//Comprobando si las personas son mayores de edad
		fEsMayorDeEdad(objPersona1);
		fEsMayorDeEdad(objPersona2);
		fEsMayorDeEdad(objPersona3);

		System.out.println("\n\n");


		//Informamos de los datos de las personas registradas
		System.out.println("\n" + objPersona1.toString());
		System.out.println("\n" + objPersona2.toString());
		System.out.println("\n" + objPersona3.toString());		
		
	}//main
	
	/**
	* Método encargado de averiguar si el individuo es mayor de ed
	* @param [Persona] Objeto de la clase Persona
	*/
	public static void fEsMayorDeEdad(Persona objP){
		String sMsg="";

		if(objP.fEsMayorDeEdad()){
			sMsg="SÍ";
		}else{
			sMsg="NO";
		}//if
		System.out.printf("\nEl individuo %s %s es mayor de edad por tener %02d años", 
					objP.fgetNombre(), sMsg, objP.fgetEdad());
	}//fEsMayorDeEdad()

}//PruebaPersona