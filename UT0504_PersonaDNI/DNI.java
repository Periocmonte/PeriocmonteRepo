package UT0504_PersonaDNI;

public class DNI{
	private int iNumDNI=0;
	private String sDNI="";

	//Constructor
	public DNI(){
		this.iNumDNI=0;
		this.sDNI="";
	}//Constructor
	
	public DNI(String sDNI){
		try{
			if(fValidarDNI(sDNI)){
				this.sDNI=sDNI;
			}//if fValidarDNI(sDNI)?
		}catch(Exception e){
			System.out.println("Error en el constructor 1 del DNI");
			this.sDNI="00000XXXX";
		}//try
	}//Constructor

	public DNI(int iDNI){
		try{
			this.sDNI=String.valueOf(iDNI) + fCalcularLetra(iDNI);
		}catch(Exception e){
			System.out.println("Error en el constructor 2 del DNI");
			this.sDNI="00000XXXX";
		}//try
	}//Constructor	

	//getters
	/**
	* Método encargado de devolver el número del DNI sin letra
	* return [int] --> El número del DNI sin letra
	*/
	public int fgetNumDNI(){
		return this.iNumDNI;
	}//fgetNumDNI

	/**
	* Método encargado de devolver el número del DNI incluyendo la letra
	* return [int] --> El número del DNI incluyendo la letra
	*/
	public String fgetNIF(){
		return sDNI;
	}//fgetNIF

	//setters
	public void fsetNumDNI(int iNumDNI) throws Exception{
		this.iNumDNI=iNumDNI;
	}//fsetNumDNI

	public void fsetNIF(String sDNI) throws Exception{
		if(fValidarDNI(sDNI)){
			this.sDNI=sDNI;
		}//if fValidarDNI(sDNI)?
	}//fsetNIF	

	/**
	* Método encargado de validar/comprobar si el DNI facilitado es correcto
	* @param [String] --> Número de DNI con su letra asociada
	* @return [boolean] --> Devuelve TRUE si el DNI es correcto y FALSE si es incorrecto
	*/
	public static boolean fValidarDNI(String sDNI) throws Exception{
		try{
			//Comprobamos el número de dígitos. Si supera los 8 devolvermos un error
			if(sDNI.length()>8){
				System.out.println("Error. El número de DNI [" + sDNI + "] facilitado no puede superar los 8 dígitos");
				return false;
			}//if sDNI.length()		
	
			//Comprobamos la letra informada
			char cLetraInformada=' ';
			int iNumDNIInformado=0;
			cLetraInformada=fExtraeLetraDNI(sDNI);
			iNumDNIInformado=fExtraeNumeroDNI(sDNI);
			if(cLetraInformada!=fCalcularLetra(iNumDNIInformado)){
				System.out.println("Error en fValidarDNI(). El número de DNI [" + sDNI + "] facilitado no presenta la letra correcta");
				return false;
			}else{
				return true;
			}//if cLetraInformada correcta?
		}catch(Exception e){
			System.out.println("Error genérico en fValidarDNI().");
		}//try e
		return false;
	}//fValidarDNI


	/**
	* Método static encargado de extraer la letra de un DNI informado
	* @param [String] --> Número del DNI al que se le debe extraer la letra
	* @return [char] --> La letra extraida del DNI facilitado
	*/
	private static char fExtraeLetraDNI(String sDNI) throws Exception{
		char cLetra=' ';
		try{
			cLetra=sDNI.charAt(sDNI.length()-1);
		}catch(Exception e){
			cLetra=' ';
			System.out.println("Error. El DNI facilitado no presenta letra al final del DNI");
		}//try e
		return cLetra;
	}//fExtraeLetraDNI


	/**
	* Método static encargado de extraer el número de un DNI informado
	* @param [String] --> Número del DNI al que se le debe extraer la letra
	* @return [int] --> El número extraido del DNI facilitado
	*/
	private static int fExtraeNumeroDNI(String sDNI) throws Exception{
		int iDNI=0;
		iDNI=Integer.parseInt(sDNI.substring(0,sDNI.length()-1));
		return iDNI;
	}//fExtraeNumeroDNI

	/**
	* Método encargado de calcular la letra a partir del número del DNI
	* @param [int] --> Número del DNI al que se debe calcular la letra
	* @return [char] --> La letra calculada a partir del número del DNI
	*/
	private static char fCalcularLetra(int iNumDNI){
		char cLetraNIF=' ';
		String sSecuenciaLetrasNIF = "TRWAGMYFPDXBNJZSQVHLCKE"; 
		int i = iNumDNI % 23;
	        cLetraNIF = sSecuenciaLetrasNIF.charAt(i);
		return cLetraNIF;
	}//fCalcularLetra


}//DNI

