package UT0506_RectanguloPunto;
import java.lang.Math;

public class Punto{
	private double dX=0.0, dY=0.0;
	private static int iNumObjPuntos=0;
	private static final String sNOMBREOBJ="Punto";

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
	public double fgetValorX(){
		return this.dX;
	}//fgetValorX	

	public void fsetValorX(double dX){
		this.dX=dX;
	}//fsetValorX

	public double fgetValorY(){
		return this.dY;
	}//fgetValorY	

	public void fsetValorY(double dY){
		this.dY=dY;
	}//fsetValorY

	
	/**
	 * Método encargado de devolver el nombre del objetoo
	 * @return sNOMBREOBJ [String] --> Devuelve el nombre común de los objetos
	 */
	public String fgetNombre() {
		return sNOMBREOBJ;			
	}//fgetNombre
	
	/**
	 * Método encargado de devolver el número de objetos creados
	 * @return iNumObjPuntos [int] --> Devuelve el número de objetos Punto creados
	 */
	public int fgetNumObjetos() {
		return iNumObjPuntos;			
	}//fgetNumObjetos

	/**
	* Método encargado de calcular la distancia de un punto pasado el objeto por parámetros con respecto al punto del objeto
	* @param objPtoB [Punto] --> Objeto del 2º punto
	* 
	* @return dResultado [double] --> Devuelve la distancia entre el punto X e Y del objeto con respecto a las coordenadas pasadas por parámetro
	*/
	public double fDistancia(Punto objPtoB){
		double dResultado=0.0;
		
		try{
			//Fórmula a aplicar Raiz_cuadrada [ (x2-x1)^2 + (y2-y1)^2 ]
			dResultado=Math.sqrt(Math.pow((objPtoB.fgetValorX() - fgetValorX()), 2) + Math.pow((objPtoB.fgetValorY() - fgetValorY()), 2));
		}catch(Exception e){
			System.out.println("fDistancia() - Error al cálcular la distancia entre los 2 puntos. La distancia se resolverá con valor 0.0");
			dResultado=0.0;
		}//try e
		return dResultado;
	}//fDistancia


	/**
	* Método encargado de calcular la distancia de un punto pasado sus coordenadas X e Y por parámetros con respecto al punto del objeto
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
	* Método static encargado de calcular la distancia de un punto pasado por parámetros con respecto a un segundo punto pasado por parámetros
	* @param dXpuntoA [double] --> Informa de la coordenada X del punto A que se requiere calcular
	* @param dYpuntoA [double] --> Informa de la coordenada Y del punto A que se requiere calcular	
	* @param dXpuntoB [double] --> Informa de la coordenada X del punto B que se requiere calcular
	* @param dYpuntoB [double] --> Informa de la coordenada Y del punto B que se requiere calcular	
	* @return dResultado [double] --> Devuelve la distancia entre el punto X e Y del objeto con respecto a las coordenadas pasadas por parámetro
	*/
	public static double fDistancia2Ptos(double dXpuntoA, double dYpuntoA, double dXpuntoB, double dYpuntoB){
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
	* Método encargado de presentar la información del Punto
	*
	*/
	@Override
	public String toString(){
		return " con nombre " + this.fgetNombre() + " y coordenadas (" + this.fgetValorX() + ", " + this.fgetValorY() + ")";
	}//toString

	/**
	* Método encargado de restar 1 a la variable iNumObjPuntos cuando se elimine un objeto Punto
	*
	*/
	public void finalize(){
		iNumObjPuntos--;
	}//finalize

}//Punto