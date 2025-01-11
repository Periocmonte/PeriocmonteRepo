package UT05_CuentaBancaria;

private class CuentaBancaria{
	private String sNombreTit="", sNumCuenta="";
	private char cTipoInteres=' '; //F=Fijo, S=Simple, V=Variable y C=Compuesto
	private double dSaldo=0.0;

	//Constructor por defecto
	public CuentaBancaria(){
		this.sNombreTit="";
		this.sNumCuenta="";
		this.cTipoInteres=' ';
		this.dSaldo=0.0;
	}//Constructor por defecto

	public CuentaBancaria(String sNombreTit, String sNumCuenta, char cTipoInteres, double dIngreso){
		this.fsetNombreTit(sNombreTit);
		this.fsetNumCuenta(sNumCuenta);
		this.fsetTipoCuenta(cTipoInteres);
		this.fIngreso(dIngreso);
	}//Constructor por parámetros

	//Getters y Setters
	public String fgetNombreTit(){
		return sNombreTit;
	}//fgetNombreTit

	public void fsetNombreTit(String sNombreTit){
		this.sNombreTit=sNombreTit;
	}//fsetNombreTit

	public String fgetNumCuenta(){
		return this.sNumCuenta;
	}//fgetNumCuenta

	public void fsetNumCuenta(String sNumCuenta){
		this.sNumCuenta=sNumCuenta;
	}//fsetNumCuenta

	public char fgetTipoCuenta(){
		return this.cTipoInteres;
	}//fgetTipoCuenta

	/**
	* Método encargado de devolver en formato cadena el tipo de interés de la cuentas. 
	* En caso de no especificar el tipo de Tipo de interés, por defecto se devolverá como Simple
	*
	* @param cTipo [char] --> Caracter identificador del tipo de interes. F=Fijo, S=Simple, V=Variable y C=Compuesto
	* @return sTipoInteres [String] --> Devuelve la descripción del tipo de interés de la cuenta. 
	*/
	public String fgetDescripcionTipoCuenta(){
		String sTipoInteres="";

		switch (this.cTipoInteres){
			case 'F':
				sTipoInteres="Fijo";
				break;	
			case 'S':
				sTipoInteres="Simple";
				break;	
			case 'V':
				sTipoInteres="Variable";
				break;	
			case 'C':
				sTipoInteres="Compuesto";
				break;	
			default:
				sTipoInteres="Simple";
				break;	
		}//switch
		return sTipoInteres;
	}//fgetDescripcionTipoCuenta

	public void fsetTipoCuenta(char cTipoInteres){
		this.cTipoInteres=cTipoInteres;
	}//fsetTipoCuenta

	public double fgetSaldo(){
		return this.dSaldo;
	}//fgetSaldo

	public void fsetSaldo(double dSaldo){
		this.dSaldo=dSaldo;
	}//fsetSaldo

	/**
	* Método encargado de incrementar el saldo existente en la cantidad pasada por parámetro
	*
	* @param dIngreso [double] --> Informará de la cantidad que debe incrementarse el atributo dSaldo
	* @return bResultado [boolean] --> Devuelve TRUE se ha podido realizar el ingreso y FALSE si ha fallado el ingreso
	*/
	public boolean fIngreso(double dIngreso){
		boolean bResultado=false;

		if (dIngreso<0){
			System.out.println("                        --> El importe facilitado debe superar los 0 €");
			bResultado=false;
		}else{
			this.dSaldo+=dIngreso;
			bResultado=true;
			System.out.println("                        --> Se ingresan " + dIngreso + " € al saldo. Finalmente el saldo es de " + this.dSaldo + " €");
		}//if dingreso<0
		return bResultado;
	}//fIngreso

	/**
	* Método encargado de extraer dinero de la variable dSaldo. 
	* En caso de la cantidad enviada como parámetro sea < 1, se informará al usuario que debe informar de una cantidad >0
	* En caso de la cantidad enviada como parámetro sea superior a la cantidad de la variable dSaldo, se informará al usuario que debe informar de una cantidad inferior a la del saldo
	*
	* @param dExtraccion [double] --> Cantidad a extraer el montante almacenado en la variable dSaldo
	*/
	public boolean fReintegro(double dExtraccion){
		boolean bResultado=false;
		
		if (dExtraccion<1){
			System.out.println("                        --> La cantidad a extraer debe superior a 0");
			bResultado=false;
		}else if(dExtraccion>this.dSaldo){
			System.out.println("                        --> La cantidad a extraer no puede superar el importe de " + this.dSaldo + " de la cuenta");
			bResultado=false;
		}else{
			this.dSaldo-=dExtraccion;
			System.out.println("                        --> Se extraen " + dExtraccion + " € de saldo. Finalmente el saldo es de " + this.dSaldo + " €");
			bResultado=true;
		}//dExtraccion?
		
		return bResultado;
	}//fReintegro
	
	@Override
	public String toString() {
		return  "Nombre del Titular: " + this.fgetNombreTit() + "\r\n"+
				"Número de cuenta: " + this.fgetNumCuenta() + "\r\n"+
				"Tipo de Interés: " + this.fgetDescripcionTipoCuenta() + "\r\n"+
				"Saldo: " + this.fgetSaldo() + "\r\n";
	}//toString
	
}//CuentaBancaria