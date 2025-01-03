package UT0501_Libros;

import java.util.Scanner;

public class PruebaLibro{
	public static void main(String[] args) {
		String sTitulo="", sAutor="", sTeclado="", sEstado="";
		int iCodigo=0;
		boolean bPrestado=false;


		System.out.println("Manotaskpy");

		Libro objLibro1=new Libro("El nombre del viento", "Carlos Zafón", 12345678, true);
		Libro objLibro2=new Libro();

		//****************************************************************************************
		//****************************************************************************************
		//******************** CREAMOS EL LIBRO 2 POR TECLADO ************************************
		//****************************************************************************************
		//****************************************************************************************
		//Damos de alta los datos del objeto objLibro2
		Scanner objScanner=new Scanner(System.in);

		System.out.println("\n Introduce el Título del libro");
		sTeclado=objScanner.nextLine();
		sTitulo=sTeclado;
		objLibro2.fsetTitulo(sTitulo);

		System.out.println("\n Introduce el nombre del autor del libro");
		sTeclado=objScanner.nextLine();
		sAutor=sTeclado;
		objLibro2.fsetAutor(sAutor);

		System.out.println("\n Introduce el código del libro");
		sTeclado=objScanner.nextLine();
		try{
			iCodigo=Integer.parseInt(sTeclado);		
			objLibro2.fsetCodigo(iCodigo);
		}catch(Exception e){
			iCodigo=0;
			System.out.println("Error el código es incorrecto, por lo que inicializará a 0");
			e.printStackTrace();
		}//try

		System.out.println("\n Indica si el libro está o no ya prestado introduciendo \"Sí\" o \"No\"");
		sTeclado=objScanner.nextLine();
		try{
			if(sTeclado.equalsIgnoreCase("Sí")){
				bPrestado=true;
			}else if(sTeclado.equalsIgnoreCase("Si")){
				bPrestado=true;
			}else{
				bPrestado=false;
			}//if sTeclado=Sí
			objLibro2.fsetPrestar(bPrestado);
		}catch(Exception e){
			bPrestado=false;
			e.printStackTrace();
		}//try

		//Informamos del estado del libro 2 introducido por el usuario
		sTitulo=objLibro2.fgetTitulo();
		sAutor=objLibro2.fgetAutor();
		iCodigo=objLibro2.fgetCodigo();
		bPrestado=objLibro2.fgetPrestado();
		if(bPrestado){
			sEstado="está prestado";
		}else{
			sEstado="no está prestado";
		}//if bPrestado
		System.out.printf("\nEl libro 2 \"%s\" del autor \"%s\" tiene un código %d y %s",
			sTitulo, sAutor, iCodigo, sEstado);


		//****************************************************************************************
		//****************************************************************************************
		//************************ LIBRO 1 *******************************************************
		//****************************************************************************************
		//****************************************************************************************

		//Informamos del estado del libro 1
		sTitulo=objLibro1.fgetTitulo();
		sAutor=objLibro1.fgetAutor();
		iCodigo=objLibro1.fgetCodigo();
		bPrestado=objLibro1.fgetPrestado();
		if(bPrestado){
			sEstado="está prestado";
		}else{
			sEstado="no está prestado";
		}//if bPrestado
		System.out.printf("\nEl libro 1 \"%s\" del autor \"%s\" tiene un código %d y %s",
			sTitulo, sAutor, iCodigo, sEstado);


		//****************************************************************************************
		//****************************************************************************************
		//************************ LIBRO 3 - CREADO POR SETTERS **********************************
		//****************************************************************************************
		//****************************************************************************************
		
		//Creamos otro libro
		objLibro2.fsetTitulo("Los pilares de la tierra");
		objLibro2.fsetAutor("Ken follet");
		objLibro2.fsetCodigo(987654);
		objLibro2.fsetPrestar(false);

		//Informamos sobre el nuevo libro
		sTitulo=objLibro2.fgetTitulo();
		sAutor=objLibro2.fgetAutor();
		iCodigo=objLibro2.fgetCodigo();
		bPrestado=objLibro2.fgetPrestado();
		if(bPrestado){
			sEstado="está prestado";
		}else{
			sEstado="no está prestado";
		}//if bPrestado
		System.out.printf("\nEl libro 2 \"%s\" del autor \"%s\" tiene un código %d y %s",
			sTitulo, sAutor, iCodigo, sEstado);

		//Pasamos a prestar el nuevo libro
		objLibro2.fsetPrestar(true);

		//Informamos sobre el nuevo libro
		sTitulo=objLibro2.fgetTitulo();
		sAutor=objLibro2.fgetAutor();
		iCodigo=objLibro2.fgetCodigo();
		bPrestado=objLibro2.fgetPrestado();
		if(bPrestado){
			sEstado="está prestado";
		}else{
			sEstado="no está prestado";
		}//if bPrestado
		System.out.printf("\nEl libro 2 \"%s\" del autor \"%s\" tiene un código %d y %s \n",
			sTitulo, sAutor, iCodigo, sEstado);

		//Pasamos a prestar el nuevo libro que ya estaba prestado
		System.out.println("\n\nPasamos a prestar el libro " + objLibro2.fgetTitulo());
		objLibro2.fPrestar();
		// Como está prestado lo devolvemos
		objLibro2.fDevolverLibro();
		//Volvemos a prestarlo 
		objLibro2.fPrestar();


	}//main
}//PruebaLibro

