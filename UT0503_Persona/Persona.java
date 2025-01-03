package UT0503_Persona;

public class Persona{
	private String sNombre="", sDNI="";
	private char cSexo=' ';
	private int iEdad=0;
	private double dPeso=0.0, dAltura=0.0, dIMC=0.0;

	//Constructor
	public Persona(){
		this.sNombre="";
		this.sDNI="";
		this.cSexo=' ';
		this.iEdad=0;
		this.dPeso=0.0;
		this.dAltura=0.0;
	}//Constructor

	/**
	* Constructor con 4 parametros
	*
	* @param nombre de la persona
	* @param DNI de la persona
	* @param edad de la persona
	* @param sexo de la persona
	*/
	public Persona(String sNombre, String sDNI, int iEdad, char cSexo){
		this.sNombre=sNombre;
		this.sDNI=sDNI;
		this.cSexo=cSexo;
		this.iEdad=iEdad;
		this.dPeso=0.0;
		this.dAltura=0.0;
	}//Constructor

	/**
	* Constructor con 6 parametros
	*
	* @param nombre de la persona
	* @param DNI de la persona
	* @param edad de la persona
	* @param sexo de la persona
	* @param peso de la persona
	* @param altura de la persona
	*/
	public Persona(String sNombre, String sDNI, int iEdad, char cSexo, double dPeso, double dAltura){
		this.sNombre=sNombre;
		this.sDNI=sDNI;
		this.cSexo=cSexo;
		this.iEdad=iEdad;
		this.dPeso=dPeso;
		this.dAltura=dAltura;
	}//Constructor

	public void fsetNombre(String sNombre){
		this.sNombre=sNombre;
	}//fsetNombre

	public void fsetDNI(String sDNI){
		this.sDNI=sDNI;
	}//fsetDNI

	public void fsetSexo(char cSexo){
		this.cSexo=cSexo;
	}//fsetSexo

	public void fsetEdad(int iEdad){
		this.iEdad=iEdad;
	}//fsetEdad

	public void fsetPeso(double dPeso){
		this.dPeso=dPeso;
	}//fsetPeso

	public void fsetAltura(double dAltura){
		this.dAltura=dAltura;
	}//fsetAltura

	public String fgetNombre(){
		return this.sNombre;
	}//fgetNombre	


	public double fgetPeso(){
		return this.dPeso;
	}//fgetPeso	

	public double fgetAltura(){
		return this.dAltura;
	}//fgetAltura	

	public int fgetEdad(){
		return this.iEdad;
	}//fgetEdad


	
	/**
	* Método encargado de calcular el índice de masa corporal
	* @return [double] el índice de masa corporal
	*/
	private double fIndiceMasaCoporal(double dPeso, double dAltura){
		double dResultado=0.0;

		//System.out.println("\nfIndiceMasaCorporal().dPeso=" + dPeso + " - dAltura=" + dAltura);
		try{
			dResultado= dPeso / Math.pow(dAltura, 2);
			//System.out.println("\nfIndiceMasaCorporal().dResultado=" + dResultado);
		}catch(Exception e){
			dResultado=0.0;
			System.out.println("\nError al calcular la masa corporal.");
			e.printStackTrace();
		}//try exception
		return dResultado;
	}//fIndiceMasaCoporal

	/**
	* Método encargado de devolver una valoración sobre el ICM
	* @return [String] mensaje informativo sobre su ICM
	*/
	private String fValoracionIMC(){
		String sMsg="";
		this.dIMC=fIndiceMasaCoporal(fgetPeso(), fgetAltura());

		//Valoramos el ICM
		if(this.dIMC<20){
			sMsg=" está delgado";
		}else if(this.dIMC>=25){
			sMsg=" está gordo";
		}else{
			sMsg=" está perfect!!!";
		}//if dICM?
		return sMsg;
	}//fValoracionIMC

	/**
	* Método encargado de comprobar si el sexo informado es correcto. Si recibe una 'M' el atributo cSexo se iniciarlizará a 'M', en caso contrario a 'H'
	* @param [char] --> Informará del sexo a comprobar
	*/
	private void fCompruebaSexo(char cSexo){
		if(cSexo=='H'){
			this.cSexo='H';
		}else if(cSexo=='M'){
			this.cSexo='M';
		}else{
			this.cSexo='H';
		}//if cSexo?
	}//fCompruebaSexo

	/**
	* Método encargado de indicar si es mayor de edad con 18 años (TRUE) o no (FALSE)
	* return [boolean] --> TRUE si es mayor de edad de 18 años o FALSE si es menor de 18 años
	*/
	public boolean fEsMayorDeEdad(){
		if(fgetEdad()>=18){
			return true;
		}else{
			return false;
		}//if fgetEdad()
	}//fEsMayorDeEdad

	/**
	* Método encargado de devolver la información del objeto
	* return [String] --> Devuelve una cadena informando del nombre, DNI, sexo, edad, peso, altura, IMC y la valoración
	*/
	@Override
	public String toString(){
		return "El individuo " + this.sNombre + " de sexo " + this.cSexo + " y edad " + this.iEdad + " con peso " + this.dPeso + " y altura " + this.dAltura + fValoracionIMC() + " por presentar un IMC de " + this.dIMC;
	}//toString


}//Persona