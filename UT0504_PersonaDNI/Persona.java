package UT0504_PersonaDNI;

public class Persona{
	private String sNombre="", sApellido1="", sApellido2="", sDNI="";
	private int iEdad=0;
	private char cSexo=' '; //Puede tomar los valores de 'F' o 'M' 
	private static int iNroPersonas=0;
	DNI objDNI;

	//Constructor
	public Persona(){
		this.sNombre="";
		this.sApellido1="";
		this.sApellido2="";
		this.iEdad=0;
		this.cSexo=' ';
		this.sDNI="";
		objDNI=new DNI();

		//Incrementamos el contador del objeto Personas
		iNroPersonas++;
	}//constructor de Persona

	public Persona(String sNombre, String sApellido1, String sApellido2, int iEdad, char cSexo, int iDNI){
		this.sNombre=sNombre;
		this.sApellido1=sApellido1;
		this.sApellido2=sApellido2;
		this.iEdad=iEdad;
		this.cSexo=cSexo;

		objDNI=new DNI(iDNI);
		this.sDNI=objDNI.fgetNIF();

		//Incrementamos el contador del objeto Personas
		iNroPersonas++;
	}//constructor de Persona con DNI

	public Persona(String sNombre, String sApellido1, String sApellido2, int iEdad, char cSexo, String sDNI){
		this.sNombre=sNombre;
		this.sApellido1=sApellido1;
		this.sApellido2=sApellido2;
		this.iEdad=iEdad;
		this.cSexo=cSexo;

		objDNI=new DNI(sDNI);
		this.sDNI=objDNI.fgetNIF();

		//Incrementamos el contador del objeto Personas
		iNroPersonas++;
	}//constructor de Persona con NIF

	//Constructor Copia
	public Persona(Persona objP){
		this.sNombre=objP.fgetNombre();
		this.sApellido1=objP.fgetApellido1();
		this.sApellido2=objP.fgetApellido2();
		this.iEdad=objP.fgetEdad();
		this.cSexo=objP.fgetSexo();
		this.sDNI=objP.fgetNIF();

		//Incrementamos el contador del objeto Personas
		iNroPersonas++;
	}//constructor copia de Persona


	//getters
	public String fgetNombre(){
		return this.sNombre;
	}//fgetNombre

	public String fgetApellido1(){
		return this.sApellido1;
	}//fgetApellido1

	public String fgetApellido2(){
		return this.sApellido2;
	}//fgetfgetApellido2

	public int fgetEdad(){
		return this.iEdad;
	}//fgetEdad	

	public char fgetSexo(){
		return this.cSexo;
	}//fgetSexo	

	public String fgetNIF(){
		return this.sDNI;
	}//fgetNIF

	//setters
	public void fsetNombre(String sNombre){
		this.sNombre=sNombre;
	}//fsetNombre

	public void fsetApellido1(String sApellido1){
		this.sApellido1=sApellido1;
	}//fsetApellido1

	public void fsetApellido2(String sApellido2){
		this.sApellido2=sApellido2;
	}//fsetApellido2

	/**
	* Método encargado de asignar la edad. Si la edad es <0 se asignará una edad de 0. Si edad > 120 se asignará edad=120
	* @param [int] --> Edad de la persona a crear
	*	
	*/
	public void fsetEdad(int iEdad){
		if(iEdad<1){
			this.iEdad=0;
		}else if(iEdad>119){
			this.iEdad=120;
		}else{
			this.iEdad=iEdad;
		}//if iEdad
	}//fsetEdad

	/**
	* Método encargado de inicializar el sexo. Si se recibe un caracter distinto de 'M' se asignará siempre 'F'
	* @param [char] --> Se debe recibir una 'M' para masculino o una 'F' para femenino
	*/
	public void fsetSexo(char cSexo){
		if(cSexo!='M'){
			cSexo='F';
		}//if cSexo!=M?
		this.cSexo=cSexo;
	}//fsetSexo

	/**
	* Método encargado de asignar el DNI. Se realiza una comprobación del DNI informado, si el DNI es incorrecto se asigna el DNI "0000ERROR"
	*
	* @param [String] --> El DNI incluyendo letra
	*/
	public void fsetDNI(String sDNI){
		try{
			if(objDNI.fValidarDNI(sDNI)){
				this.sDNI=sDNI;
			}else{
				this.sDNI="0000ERROR";
			}//if 
		}catch(Exception e){
			System.out.println("Error al asignar el DNI");
			this.sDNI="0000ERROR";
		}//try e
	}//fsetDNI

	/**
	* Método toString() sobrescrito para devolver toda la información de la persona incluyendo nombre y apellidos, edad, sexo y dni
	*
	*/
	@Override
	public String toString(){
		String sMsg="";
		sMsg="La persona se llama:" + 
			this.sNombre + " " + this.sApellido1 + " " + this.sApellido2 + 
			" y tiene " + this.iEdad + " años." +
			"Es de sexo ";
		if(this.cSexo=='M'){
			sMsg=sMsg + "Masculino.";
		}else{
			sMsg=sMsg + "Femenino.";
		}//if cSexo
		sMsg=sMsg + " Su DNI es:" + this.sDNI;
		return sMsg;
	}//toString()

	/**
	* Método encargado de devolver el número de objetos de la clase Persona existen
	* @return [int] --> Número de objetos Persona creados
	*/
	public static int fgetNroPersonas(){
		return iNroPersonas;
	}//fgetNroPersonas
	

	/**
	* Método finalize implementado para actualizar el valor de la variable iNroPersonas
	*
	*/
	public void finalize(){
		if(iNroPersonas>0){
			iNroPersonas--;
		}//if iNroPersonas>0?
	}//finalize
}//Persona