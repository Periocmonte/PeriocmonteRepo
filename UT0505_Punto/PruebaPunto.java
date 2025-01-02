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

		//Calculamos la distancia entre P y Q
		try{
			dDistancia=objPuntoP.fDistancia(objPuntoQ.fgetValorX(), objPuntoQ.fgetValorY());
			System.out.printf("La distancia entre el punto P (%,05.2f , %,05.2f) y el punto Q (%,05.2f, %,05.2f) es de %-,5d",
				objPuntoP.fgetValorX(), objPuntoP.fgetValorY(), objPuntoQ.fgetValorX(), objPuntoQ.fgetValorY(), Math.round(dDistancia));
		}catch(Exception e){
			System.out.println("PruebaPunto - Error al calcular la distancia entre punto P y Q");
			e.printStackTrace();
		}//try e

		//Calculamos la distancia entre 2 puntos pasados como parámetros recogidos de la consola
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






	}//main

}//PruebaPunto

