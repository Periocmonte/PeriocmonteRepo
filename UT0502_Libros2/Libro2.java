package UT0502_Libros2;

public class Libro2{
	private String sTitulo="", sAutor="";
	private int iCodigo=0;
	private static int iNumEjemplares=0, iNumPrestados=0;

	//Constructor
	public Libro2(){
		sTitulo="";
		sAutor="";
		iCodigo=0;
	}//Constructor

	public Libro2(String sTitulo, String sAutor, int iCodigo){
		this.sTitulo=sTitulo;
		this.sAutor=sAutor;
		this.iCodigo=iCodigo;
		this.iNumEjemplares=iNumEjemplares;
		this.iNumPrestados=iNumPrestados;
	}//Constructor

	public void fsetTitulo(String sTitulo){
		this.sTitulo=sTitulo;
	}//fsetTitulo

	public void fsetAutor(String sAutor){
		this.sAutor=sAutor;
	}//fsetAutor

	public void fsetCodigo(int iCodigo){
		this.iCodigo=iCodigo;
	}//fsetCodigo

	/**
	* Método encargado de inicializar el número de ejemplares disponibles
	*
	*/
	public static void fsetNumEjemplares(int iNum){
		System.out.println("Inicio - fsetNumEjemplares().iNumEjemplares: " + iNumEjemplares);
		iNumEjemplares=iNum;
		System.out.println("Fin - fsetNumEjemplares().iNumEjemplares: " + iNumEjemplares);
	}//fsetNumEjemplares

	public String fgetTitulo(){
		return this.sTitulo;
	}//fgetTitulo

	public String fgetAutor(){
		return this.sAutor;
	}//fgetAutor

	public int fgetCodigo(){
		return this.iCodigo;
	}//fgetCodigo

	/**
	 * Método encargado de devolver el número de ejemplares disponibles
	 * @return [int] con el número de ejemplares disponibles
	 */
	public static int fgetNumEjemplares(){
		return iNumEjemplares;
	}//fgetNumEjemplares

	/**
	 * Método encargado de devolver el número de ejemplares prestados
	 * @return [int] con el número de ejemplares prestados
	 */
	public static int fgetNumPrestados(){
		return iNumPrestados;
	}//fgetNumPrestados

	/**
	* Método encargado de devolver los datos del libro
	* @return [String] con los datos del libro Título + Autor + Código
	*/
	public String sListadoLibros(){
		return "El libro tiene el título " + fgetTitulo() + " del autor " + fgetAutor() + " y código " + fgetCodigo();
	}//sListadoLibros

	/**
	* Método encargado de prestar un nuevo libro
	* @return [boolean] TRUE si se ha podido prestar un libro y FALSE si no se ha podido prestar
	*/
	public static boolean fPrestar(){
		boolean bResultado=false;
		String sTxt="";
		System.out.println("fPrestar().fgetNumEjemplares(): " + fgetNumEjemplares());
		System.out.println("fPrestar().fgetNumPrestados(): " + fgetNumPrestados());

		if(fgetNumEjemplares()>fgetNumPrestados()){
			iNumPrestados++;
			sTxt="OK, libro prestado.";
			bResultado=true;
		}else{
			sTxt="KO, actualmente no hay libros disponibles para prestar.";
			bResultado=false;
		}//if iNumEjemplares<iNumPrestados?
		System.out.println("\n" + sTxt + " Actualmente hay prestados: " + fgetNumPrestados() + " de " + fgetNumEjemplares());
		return bResultado;
	}//fPrestar

		/**
	* Método encargado de devolver un libro
	* @return [boolean] TRUE si se ha podido devolver un libro y FALSE si no se ha podido devolver porque se ha llegado al total de ejemplares devueltos
	*/
	public static boolean fDevolver(){
		boolean bResultado=false;
		String sTxt="";
		if(iNumPrestados==0){
			sTxt="KO, no se puede ningún libro porque no hay ninguno prestado.";
			bResultado=false;
		}else{	
			iNumPrestados--;
			sTxt="OK, libro devuelto.";
			bResultado=true;
		}//if iNumPrestados==0?
		System.out.println("\n " + sTxt + " Actualmente hay prestados: " + fgetNumPrestados() + " de " + fgetNumEjemplares());
		return bResultado;
	}//fPrestar


}//Libro2