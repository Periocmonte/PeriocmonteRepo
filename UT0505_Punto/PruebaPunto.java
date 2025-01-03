package UT0505_Punto;
import java.util.Scanner;


public class PruebaPunto{
	public static void main (String[] args){
		double dDistancia=0.0;
		String sTeclado="", sPuntoAX="", sPuntoAY="", sPuntoBX="", sPuntoBY="";

		System.out.println("*********** PruebaPunto ************");

		Punto objPuntoP=new Punto(0,0);
		Punto objPuntoQ=new Punto(2,2);
		Punto objPuntoR=new Punto(3,3);
		Punto objPuntoS=new Punto(objPuntoR);

		//Calculamos la distancia entre el punto P y punto Q 
		System.out.println("\n\nEjercicio 1: Calcula la distancia entre un objeto punto (objeto Q) y otro obj (objeto R)");
	
		try{
			dDistancia=objPuntoQ.fDistancia(objPuntoR);
			System.out.printf("La distancia entre el punto Q (%f, %f) y el punto R (%f, %f) es de %d",
				objPuntoQ.fgetValorX(), objPuntoQ.fgetValorY(), objPuntoR.fgetValorX(), objPuntoR.fgetValorY(), Math.round(dDistancia));
		}catch(Exception e){
			System.out.println("PruebaPunto - Error al calcular la distancia entre 2 objetos");
			e.printStackTrace();
		}//try e


		//Calculamos la distancia entre el punto P y punto Q pasando sus coordenadas por parámetro
		try{
			System.out.println("\n\nEjercicio 2: Calcula la distancia entre un punto y otro a partir de coordenadas pasadas por parámetro del 2º punto");
			dDistancia=objPuntoP.fDistancia(objPuntoQ.fgetValorX(), objPuntoQ.fgetValorY());
			System.out.printf("La distancia entre el punto P (%,05.2f , %,05.2f) y el punto Q (%,05.2f, %,05.2f) es de %-,5d",
				objPuntoP.fgetValorX(), objPuntoP.fgetValorY(), objPuntoQ.fgetValorX(), objPuntoQ.fgetValorY(), Math.round(dDistancia));
		}catch(Exception e){
			System.out.println("PruebaPunto - Error al calcular la distancia entre punto P y Q");
			e.printStackTrace();
		}//try e


		//Calculamos la distancia entre 2 puntos pasados como parámetros recogidos de la consola
		System.out.println("\n\nEjercicio 3: Calcula la distancia entre un punto y otro a partir de coordenadas introducidas por teclado para los 2 puntos");
		do{
			System.out.println("\n\nIntroduce las coordenadas del Punto A con formato \"X,Y\"");
			Scanner objScanner=new Scanner(System.in);
			sTeclado=objScanner.nextLine();
			//System.out.println("sTeclado.lastIndexOf(\",\"): " + sTeclado.lastIndexOf(","));
		}while(sTeclado.lastIndexOf(",")<0);		

		sPuntoAX=sTeclado.substring(0, sTeclado.lastIndexOf(","));
		sPuntoAY=sTeclado.substring(sTeclado.lastIndexOf(",")+1, sTeclado.length());
		System.out.println("sPuntoAX: " + sPuntoAX + " - sPuntoAY: " + sPuntoAY);

		do{
			System.out.println("\n\nIntroduce las coordenadas del Punto B con formato \"X,Y\"");
			Scanner objScanner=new Scanner(System.in);
			sTeclado=objScanner.nextLine();
			//System.out.println("sTeclado.lastIndexOf(\",\"): " + sTeclado.lastIndexOf(","));
		}while(sTeclado.lastIndexOf(",")<0);		

		sPuntoBX=sTeclado.substring(0, sTeclado.lastIndexOf(","));
		sPuntoBY=sTeclado.substring(sTeclado.lastIndexOf(",")+1, sTeclado.length());
		System.out.println("sPuntoBX: " + sPuntoBX + " - sPuntoBY: " + sPuntoBY);

		dDistancia=Punto.fDistancia2Ptos(Double.valueOf(sPuntoAX), Double.valueOf(sPuntoAY), Double.valueOf(sPuntoBX), Double.valueOf(sPuntoBY));
		System.out.printf("La distancia entre el punto A (%s, %s) y el punto B (%s, %s) es de %-5d",
			sPuntoAX, sPuntoAY, sPuntoBX, sPuntoBY, Math.round(dDistancia));

		//Mostramos el nombre común de todos los objetos
		System.out.printf("\nEl nombre común del objeto objPuntoP es [%s]", objPuntoP.fgetNombre());
		System.out.printf("\nEl nombre común del objeto objPuntoQ es [%s]", objPuntoQ.fgetNombre());
		System.out.printf("\nEl nombre común del objeto objPuntoR es [%s]", objPuntoR.fgetNombre());
		System.out.printf("\nEl nombre común del objeto objPuntoS es [%s]", objPuntoS.fgetNombre());

		//Mostramos el número de objetos instanciados de la clase Punto
		System.out.printf("\n\nEl número de objetos instanciados de la clase Punto es: %d", objPuntoP.fgetNumObjetos());
		objPuntoR.finalize();
		objPuntoS.finalize();
		System.out.printf("\nTras eliminar los objetos objPuntoR y objPuntoS, el número de objetos instanciados de la clase Punto actualmente es: %d", 
					objPuntoP.fgetNumObjetos());

		System.out.println("\n\n*********** FIN PruebaPunto ************\n");
		
	}//main

}//PruebaPunto



