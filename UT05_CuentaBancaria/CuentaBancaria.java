package UT05_CuentaBancaria;

private class CuentaBancaria{
	private String sNombreTit="", sNumCuenta="";
	private char cTipoCuenta=' '; //F=Fijo, S=Simple, V=Variable y C=Compuesto
	private double dSaldo=0.0;
	private String aTiposCuenta={"Fijo", "Simple", "Variable", "Compuesto"};


	//Constructor por defecto
	public CuentaBancaria(){
		this.sNombreTit="";
		this.sNumCuenta="";
		this.cTipoCuenta=' ';
		this.dSaldo=0.0;
	}//Constructor por defecto

	public CuentaBancaria(String sNombreTit, String sNumCuenta, char cTipoCuenta, double dIngreso){
		this.fsetNombreTit(sNombreTit);
		this.fsetNumCuenta(sNumCuenta);
		this.fsetTipoCuenta(cTipoCuenta);
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
		return cTipoCuenta;
	}//fgetTipoCuenta

	public void fsetTipoCuenta(char cTipoCuenta){
		this.cTipoCuenta=cTipoCuenta;
	//fsetTipoCuenta

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
	*/
	public void fIngreso(double dIngreso){
		if (dIngreso<0){
			System.out.println("El importe facilitado debe superar los 0 €");
		}else{
			this.dSaldo=+dIngreso;
		}//if dingreso<0
	}//fIngreso

	/**
	* Método encargado de extraer dinero de la variable dSaldo. 
	* En caso de la cantidad enviada como parámetro sea < 1, se informará al usuario que debe informar de una cantidad >0
	* En caso de la cantidad enviada como parámetro sea superior a la cantidad de la variable dSaldo, se informará al usuario que debe informar de una cantidad inferior a la del saldo
	*
	* @param dExtraccion [double] --> Cantidad a extraer el montante almacenado en la variable dSaldo
	*/
	public void fReintegro(double dExtraccion){
		if (dExtraccion<1){
			System.out.println("La cantidad a extraer debe superior a 0");
		}else if(dExtracción>dSaldo){
			System.out.println("La cantidad a extraer no puede superar el importe de " + dSaldo + " de la cuenta");
		}else{
			dSaldo=-dExtraccion;
			System.out.println("Se extraen " + dExtraccion + " € de saldo. Finalmente quedan " + dSaldo + " € de saldo final");
		}//dExtraccion?
	}//fReintegro
}//CuentaBancaria