package UT0506_RectanguloPunto;

public class Rectangulo{
	private double dXIzq=0.0, dXDere=0.0, dYIzq=0.0, dYDere=0.0;
	private static int iNumObjRectangulo=0;
 
	//Constructor por defecto
	public Rectangulo(){
		this.dXIzq=0.0;
		this.dXDere=0.0;
		this.dYIzq=0.0;
		this.dYDere=0.0;
		iNumObjRectangulo++;
	}//Constructor por defecto

	//Constructor Copia
	public Rectangulo(Rectangulo objR){
		this.dXIzq=objR.fgetXIzq();
		this.dYIzq=objR.fgetYIzq();
		this.dXDere=objR.fgetXDere();
		this.dYDere=objR.fgetYDere();
		iNumObjRectangulo++;
	}//Constructor copia

	//Constructor inicializado con 4 parámetros
	public Rectangulo(double dXIzq, double dYIzq, double dXDere, double dYDere){
		this.dXIzq=dXIzq;
		this.dYIzq=dYIzq;
		this.dXDere=dXDere;
		this.dYDere=dYDere;
		iNumObjRectangulo++;
	}//Constructor de 4 parámetros

	//Constructor inicializado por 2 obj puntos
	public Rectangulo(Punto objPto1, Punto objPto2){
		this.dXIzq=objPto1.fgetValorX();
		this.dYIzq=objPto1.fgetValorY();
		this.dXDere=objPto2.fgetValorX();
		this.dYDere=objPto2.fgetValorY();
		iNumObjRectangulo++;
	}//Constructor inicializado por 2 obj puntos

	//Constructor inicializado por 1 obj puntos + Ancho y Alto
	public Rectangulo(Punto objPto1, double dAncho, double dAlto){
		this.dXIzq=objPto1.fgetValorX();
		this.dYIzq=objPto1.fgetValorY();
		this.dXDere=objPto1.fgetValorX() + dAncho;
		this.dYDere=objPto1.fgetValorY() + dAlto;
		iNumObjRectangulo++;
	}//Constructor inicializado por 1 obj puntos + Ancho y Alto

	//GETTERS y SETTERS
	public double fgetXIzq(){
		return this.dXIzq;
	}//fgetXIzq

	public void fsetXIzq(double dXIzq){
		this.dXIzq=dXIzq;
	}//fsetXIzq

	public double fgetYIzq(){
		return this.dYIzq;
	}//fgetYizq

	public void fsetYIzq(double dYIzq){
		this.dYIzq=dYIzq;
	}//fsetYIzq

	public double fgetXDere(){
		return this.dXDere;
	}//fgetXDere

	public void fsetXDere(double dXDere){
		this.dXDere=dXDere;
	}//fsetXDere

	public double fgetYDere(){
		return this.dYDere;
	}//fgetYDere

	public void fsetYDere(double dYDere){
		this.dYDere=dYDere;
	}//fsetYDere

	/**
	* Método encargado de devolver el número de objetos Rectangulo creados	
	* @return iNumObjRectangulo [int] --> Devuelve el número de objetos Rectangulos creados
	*/
	public static int fNumObjRectangulo(){
		return iNumObjRectangulo;
	}//fNumObjRectangulo

	@Override
	public String toString(){
		return " coordenadas Superior Izquierda (" + this.fgetXIzq() + ", " + this.fgetYIzq() + ") e Inferior Derecha: (" + this.fgetXDere() + ", " + this.fgetYDere() + ")";
	}//toString

	/**
	* Método encargado de calcular el área del rectángulo
	*
	* @return dArea [double] --> Devuelve el área del rectángulo
	*/
	public double fCalcularArea(){
		double dArea=0.0, dBase=0.0, dAltura=0.0;
		try{
			//Inicializamos la variables con las del objeto
			dBase=Math.abs(this.fgetXIzq() - this.fgetXDere());
			dAltura=Math.abs(this.fgetXIzq() - this.fgetYIzq());
		}catch(Exception e){
			System.out.println("\n RECTANGULO - Error al calcular la Base y la Altura del rectángulo");
			e.printStackTrace();
			dBase=0.0;
			dAltura=0.0;
		}//try

		//Area= Base * Altura
		try{
			dArea=dBase * dAltura;
			System.out.println("\nRECTANGULO - (" + this.fgetXIzq() + "," + this.fgetYIzq() + "),(" + this.fgetXDere() + ", " + this.fgetYDere() + ") - dBase: " + dBase + " - dAltura: " + dAltura + " - dArea: " + dArea);
		}catch(Exception e){
			System.out.println("\n fCalcularArea - Error al calcular el área del rectángulo.");
			e.printStackTrace();
			dArea=0.0;
		}//e
		return dArea;
	}//fCalcularArea
	
	/**
	* Método encargado de calcular el perímetro del rectángulo
	*
	* @return dPerimetro [double] --> Devuelve el perímetro del rectángulo
	*/
	public double fCalcularPerimetro(){
		double dPerimetro=0.0, dBase=0.0, dAltura=0.0;

		try{
			//Inicializamos la variables con las del objeto
			dBase=Math.abs(this.fgetXIzq() - this.fgetXDere());
			dAltura=Math.abs(this.fgetXIzq() - this.fgetYIzq());
		}catch(Exception e){
			System.out.println("\n RECTANGULO - Error al calcular la Base y la Altura del rectángulo");
			e.printStackTrace();
			dBase=0.0;
			dAltura=0.0;
		}//try

		//Perímetro= 2 * (Base + Altura)
		try{
			dPerimetro=2 * (dBase + dAltura);
			System.out.println("RECTANGULO - (" + this.fgetXIzq() + "," + this.fgetYIzq() + "),(" + this.fgetXDere() + ", " + this.fgetYDere() + ") - dBase: " + dBase + " - dAltura: " + dAltura + " - dPerimetro: " + dPerimetro);

		}catch(Exception e){
			System.out.println("\n fCalcularPerimetro - Error al calcular el perímetro del rectángulo.");
			e.printStackTrace();
			dPerimetro=0.0;
		}//e
		return dPerimetro;
	}//fCalcularPerimetro

	/**
	* Método encargado de restar un valor al atributo iNumObjRectangulo cuando se elimina un objeto Rectangulo
	*
	*/
	public void finalize(){
		iNumObjRectangulo--;
	}//finalize
	

}//Rectangulo