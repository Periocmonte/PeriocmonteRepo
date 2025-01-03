package UT0501_Libros;

public class Libro{
	private String sTitulo="", sAutor="";
	private int iCodigo=0;
	private boolean bPrestado=false;

	//Constructor 
	Libro(){
		sTitulo="";
		sAutor="";
		iCodigo=0;
		bPrestado=false;
	}//Constructor

	Libro(String sTitulo, String sAutor, int iCodigo, boolean bPrestado){
		this.sTitulo=sTitulo;
		this.sAutor=sAutor;
		this.iCodigo=iCodigo;
		this.bPrestado=bPrestado;
	}//Constructor

	/**
	* Método encargado de devolver el Titulo sTitulo
	* @return sTitulo
	*/
	public String fgetTitulo(){
		return this.sTitulo;
	}//fgetTitulo

	/**
	* Método encargado de devolver el atributo sAutor
	* @return sAutor
	*/
	public String fgetAutor(){
		return this.sAutor;
	}//fgetAutor

	/**
	* Método encargado de devolver el atributo iCodigo
	* @return iCodigo
	*/
	public int fgetCodigo(){
		return this.iCodigo;
	}//fgetCodigo

	/**
	* Método encargado de devolver el atributo bPrestado
	* @return bPrestado
	*/
	public boolean fgetPrestado(){
		return this.bPrestado;
	}//fgetPrestado


	/**
	* Método encargado de setear el atributo sTitulo
	* @param sTitulo --> El Título del libro
	*/
	public void fsetTitulo(String sTitulo){
		this.sTitulo=sTitulo;
	}//fsetTitulo


	/**
	* Método encargado de setear el atributo sAutor
	* @param sAutor --> El nombre del autor del libro
	*/
	public void fsetAutor(String sAutor){
		this.sAutor=sAutor;
	}//fsetAutor

	/**
	* Método encargado de setear el atributo iCodigo
	* @param iCodigo --> El código del libro
	*/
	public void fsetCodigo(int iCodigo){
		this.iCodigo=iCodigo;
	}//fsetCodigo

	/**
	* Método encargado de setear el atributo bPrestado
	* @param bPrestado --> Indica con TRUE si el libro es prestado
	*/
	public void fsetPrestar(boolean bPrestado){
		this.bPrestado=bPrestado;
	}//fsetPrestar

	/**
	* Método encargado de realizar el préstamos devolviendo el resultado
	* @return bResultado --> Devuelve TRUE si el préstamos finaliza OK o FALSE si el préstamo ha dado KO
	*/
	public boolean fPrestar(){
		boolean bResultado=false;
		if(bPrestado){
			System.out.println("\nEl libro ya estaba prestado. No se ha podido prestar");
			bResultado=false;
		}else{
			bPrestado=true;
			System.out.println("\nEl libro se presta OK");
			bResultado=true;
		}//bPrestado=true
		return bResultado;
	}//fPrestar

	/**
	* Método encargado de realizar la devolución del libro y muestra el resultado
	* @return bResultado --> Devuelve TRUE si el préstamos finaliza OK o FALSE si el préstamo ha dado KO
	*/
	public boolean fDevolverLibro(){
		boolean bResultado=false;
		if(fgetPrestado()){
			bPrestado=false;
			System.out.println("\nEl libro es devuelto OK");
			bResultado=true;
		}else{
			System.out.println("\nEl libro no es devuelto porque no estaba prestado.");
			bResultado=false;
		}//bPrestado=true
		return bResultado;
	}//fDevolverLibro
}//Libro

