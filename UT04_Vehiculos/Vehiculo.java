package UT04_Vehiculos;

public class Vehiculo{
	private String sTipo="";
	private String sModelo="";
	private int iNroRuedas=0;
	private double dVelocidad=0.0;

	//Constructor 1
	public Vehiculo(){
		sTipo="";
		sModelo="";
		iNroRuedas=0;
		dVelocidad=0.0;
	}//constructor 1

	//Constructor 2
	public Vehiculo(String Ptipo, String Pmodelo, int PnroRuedas, double Pvelocidad){
		this.sTipo=Ptipo;
		this.sModelo=Pmodelo;
		this.iNroRuedas=PnroRuedas;
		this.dVelocidad=Pvelocidad;
	}//constructor 2

	/**
	 * Método encargado de actualizar la velocidad=0
	 * @param 
	 * @return --> No devuelve nada, únicamente se iniciliza el atributo dVelocidad=0
	 */
	public void fParar(){
		this.dVelocidad=0;
	}//fParar

	/**
	 * Método encargado incrementar o decrementar la velocidad siempre que la velocidad no resulte negativa
	 * @param dIncremento --> Parámetro tipo double que informa del incremento que debe experimentar la velocidad en positivo o negativo
	 * @return --> No devuelve nada, únicamente se modifica el atributo dVelocidad del objeto
	 */
	public void fAcelerar(double dIncremento){
		double dResultado=0.0;
		double dVelocidadInicial=this.dVelocidad;

		dResultado=this.dVelocidad + dIncremento;
		if (dResultado>=0){
			this.dVelocidad=dResultado;
		}else{
			this.dVelocidad=dVelocidadInicial;
		}//if dResultado>=0?
	}//fAcelerar

	/** 
	 * Método encargado de devolver un String con la descripción del vehículo incluyendo los atributos sTipo, sModelo, iNroRuedas y dVelocidad
	 * @param 
	 * @return --> Devuelve un String con la descripción del vehículo incluyendo los atributos sTipo, sModelo, iNroRuedas y dVelocidad
	 */
	public String fsToString(){
		String sDetalle="";
		sDetalle="Este es un vehículo de tipo [" + this.sTipo + "] modelo [" + sModelo + "] con [" + iNroRuedas + "] ruedas y velocidad: [" + dVelocidad + "] km/h.";
		return sDetalle;
	}//fsToString


}//Vehiculo