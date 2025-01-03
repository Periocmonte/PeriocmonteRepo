package UT0506_RectanguloPunto;

public class Rectangulo{
	private double dXIzq=0.0, dXDere=0.0, dYIzq=0.0, dYDere=0.0;
 
	
	//Constructor por defecto
	public Rectangulo(){
		this.dXIzq=0.0;
		this.dXDere=0.0;
		this.dYIzq=0.0;
		this.dYDere=0.0;
	}//Constructor por defecto

	//Constructor Copia
	public Rectangulo(Rectangulo objR){
		this.dXIzq=objR.fgetXIzq();
		this.dYIzq=objR.fgetYIzq();
		this.dXDere=objR.fgetXDere();
		this.dYDere=objR.fgetYDere();
	}//Constructor copia

	//Constructor inicializado por 2 obj puntos
	public Rectangulo(Punto objPto1, Punto objPto2){
		this.dXIzq=objPto1.fgetValorX();
		this.dYIzq=objPto1.fgetValorY();
		this.dXDere=objPto2.fgetValorX();
		this.dYDere=objPto2.fgetValorY();
	}//Constructor inicializado por 2 obj puntos

	//Constructor inicializado con 4 parámetros
	public Rectangulo(double dXIzq, double dYIzq, double dXDere, double dYDere){
		this.dXIzq=dXIzq;
		this.dYIzq=dYIzq;
		this.dXDere=dXDere;
		this.dYDere=dYDere;
	}//Constructor de 4 parámetros

	//Constructor inicializado por 1 obj puntos + Ancho y Alto
	public Rectangulo(Punto objPto1, double dAncho, double dAlto){
		this.dXIzq=objPto1.fgetValorX();
		this.dYIzq=objPto1.fgetValorY();
		this.dXIzq=objPto1.fgetValorX() + dAncho;
		this.dYIzq=objPto1.fgetValorY() + dAlto;
	}//Constructor inicializado por 1 obj puntos + Ancho y Alto


	//GETTERS y SETTERS
	public int fgetXIzq(){
		return this.dXIzq;
	}//fgetXIzq

	public void fsetXIzq(double dXIzq){
		this.dXIzq=dXIzq;
	}//fsetXIzq

	public int fgetYIzq(){
		return this.dYIzq;
	}//fgetYizq

	public void fsetYIzq(double dYIzq){
		this.dYIzq=dYIzq;
	}//fsetYIzq

	public int fgetXDere
		return this.dXDere
	}//fgetXDere

	public void fsetXDere(double dXDere){
		this.dXDere=dXDere;
	}//fsetXDere

	public int fgetYDere(){
		return this.dYDere;
	}//fgetYDere

	public void fsetYDere(double dYDere){
		this.dYDere=dYDere;
	}//fsetYDere

	@Override
	public String toString(){
		return "Las coordenadas son Superior Izquierda (" + this.fgetXIzq() + ", " + this.fgetYIzq() + ") e Inferior Derecha: (" + this.fgetXDere() + ", " + this.fgetYDere() + ")";
	}//toString

	

}//Rectangulo