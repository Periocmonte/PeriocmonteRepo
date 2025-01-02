package UT0505_Punto;
import java.lang.Math;

public class Punto{
	private double dX=0.0, dY=0.0;
	private static int iNumObjPuntos=0;

	//Constructor
	public Punto(){
		this.dX=0.0;
		this.dY=0.0;
		iNumObjPuntos++;
	}//Constructor por defecto

	//Constructor por parámetros
	public Punto(double dX, double dY){
		this.dX=dX;
		this.dY=dY;
		iNumObjPuntos++;
	}//Constructor por parámetros

	//Constructor copia
	public Punto(Punto objP){
		this.dX=objP.fgetValorX();
		this.dY=objP.fgetValorY();
		iNumObjPuntos++;
	}//Constructor copia


	//Getters y Setters
	public void fsetValorX(double dX){
		this.dX=dX;
	}//fsetValorX

	public double fgetValorX(){
		return this.dX;
	}//fgetValorX

	public void fsetValorY(double dY){
		this.dY=dY;
	}//fsetValorY

	public double fgetValorY(){
		return this.dY;
	}//fgetValorY

	/**
	* Método encargado de calcular la distancia de un punto pasado por parámetros con respecto al punto del objeto
	* @param dXpuntoB [double] --> Informa de la coordenada X del punto B que se requiere calcular
	* @param dYpuntoB [double] --> Informa de la coordenada Y del punto B que se requiere calcular	
	* @return dResultado [double] --> Devuelve la distancia entre el punto X e Y del objeto con respecto a las coordenadas pasadas por parámetro
	*/
	public double fDistancia(double dXpuntoB, double dYpuntoB){
		double dResultado=0.0;
		
		try{
			//Fórmula a aplicar Raiz_cuadrada [ (x2-x1)^2 + (y2-y1)^2 ]
			dResultado=Math.sqrt(Math.pow((dXpuntoB - fgetValorX()), 2) + Math.pow((dYpuntoB - fgetValorY()), 2));
		}catch(Exception e){
			System.out.println("fDistancia() - Error al cálcula la distancia entre los 2 puntos. La distancia se resolverá con valor 0.0");
			dResultado=0.0;
		}//try e
		return dResultado;
	}//fDistancia

	/**
	* Método encargado de calcular la distancia de un punto pasado por parámetros con respecto al punto del objeto
	* @param dXpuntoA [double] --> Informa de la coordenada X del punto A que se requiere calcular
	* @param dYpuntoA [double] --> Informa de la coordenada Y del punto A que se requiere calcular	
	* @param dXpuntoB [double] --> Informa de la coordenada X del punto B que se requiere calcular
	* @param dYpuntoB [double] --> Informa de la coordenada Y del punto B que se requiere calcular	
	* @return dResultado [double] --> Devuelve la distancia entre el punto X e Y del objeto con respecto a las coordenadas pasadas por parámetro
	*/
	public double fDistancia2Ptos(double dXpuntoA, double dYpuntoA, double dXpuntoB, double dYpuntoB){
		double dResultado=0.0;
		
		try{
			//Fórmula a aplicar Raiz_cuadrada [ (x2-x1)^2 + (y2-y1)^2 ]
			dResultado=Math.sqrt(Math.pow((dXpuntoB - dXpuntoA), 2) + Math.pow((dYpuntoB - dYpuntoA), 2));
		}catch(Exception e){
			System.out.println("fDistancia() - Error al cálcula la distancia entre los 2 puntos. La distancia se resolverá con valor 0.0");
			dResultado=0.0;
		}//try e
		return dResultado;
	}//fDistancia

	/**
	* Método encargado de restar 1 a la variable iNumObjPuntos cuando se elimine un objeto Punto
	*
	*/
	public void finalize(){
		iNumObjPuntos--;
	}//finalize

}//Punto