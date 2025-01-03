package UT0502_Libros2;

import java.util.Scanner;

public class PruebaLibro2{

	public static void main(String[] args){
		String sTeclado="";
		int iNum=0;
		boolean bSalir=false;
		PruebaLibro2 objLibro2=new PruebaLibro2();
		
		
		System.out.println("\nIntroduce el número de libros disponibles");
		Scanner objScanner = new Scanner(System.in);
		do{
			sTeclado=objScanner.nextLine();
			iNum=Integer.parseInt(sTeclado);
			if(iNum<=0){
				System.out.println("\nEl número introducido debe ser superior a 0");
			}else{
				//Registramos el número de ejemplares disponibles
				Libro2.fsetNumEjemplares(iNum); 
				System.out.println("\nOK, se han registrado " + Libro2.fgetNumEjemplares() + " libros por lo que hay " + Libro2.fgetNumPrestados() + " libros prestados");
			}//if iNum<=0?
		}while(iNum<=0);

		//Registramos el libro por defecto
		Libro2 objLibro1=new Libro2("Libro por defecto", "JAVA", 1234);
		System.out.printf("El libro por defecto es \"%s\" del autor \"%s\" con código %08d\n\n",
					objLibro1.fgetTitulo(), objLibro1.fgetAutor(), objLibro1.fgetCodigo());

		//Iniciamos menú de opciones
		do{
			System.out.println("\n\n\nIndica la opción a realizar: \n1.Alta de un libro \n2.Prestar un libro \n3.Devolver un libro \n4.Salir\n\n");
			sTeclado=objScanner.nextLine();
			iNum=Integer.parseInt(sTeclado);
			if (iNum>0 && iNum<=4){
				switch(iNum){
					case 1: //Alta de un libro
						objLibro2.fAltaLibro();
						break;
					case 2: //Prestar un libro
						Libro2.fPrestar();
						break;					
					case 3: //Devolver un libro
						Libro2.fDevolver();
						break;
					case 4: //Salir
						bSalir=true;
						break;
				}//switch iNum
			}else{
				System.out.println("Por favor introduce una opción correcta entre 1 y 4");
			}//if (iNum>0 && iNum<=4)
			
			if(bSalir){
				break;
			}//if bSalir
		}while(iNum>0);
	}//main

	public void fAltaLibro(){
		String sTeclado="";
		int iCod=0;
		Libro2 objLibro=new Libro2();

		System.out.println("\nProcedemos a dar de alta un libro.");
		Scanner objScanner=new Scanner(System.in);
		System.out.println("\nIntroduce el Título.");
		sTeclado=objScanner.nextLine();
		objLibro.fsetTitulo(sTeclado);

		System.out.println("\nIntroduce el Autor.");
		sTeclado=objScanner.nextLine();
		objLibro.fsetAutor(sTeclado);

		System.out.println("\nIntroduce el Código.");
		sTeclado=objScanner.nextLine();
		iCod=Integer.parseInt(sTeclado);
		objLibro.fsetCodigo(iCod);

		System.out.printf("OK, se ha creado el libro \"%s\" del autor \"%s\" con código %08d",
					objLibro.fgetTitulo(), objLibro.fgetAutor(), objLibro.fgetCodigo());

	}//fAltaLibro
}//PruebaLibro2