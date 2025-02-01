package UT0602_ConteoAbecedario;

public class ConteoAbecedario{
	private String sTxt="";
	char[] cLetras;
	private int[][] aiNum=new int[164][1]; //El index del elemento del array es el código ascii (a=97 --> z=122)
	

	//Constructor por defecto	
	public ConteoAbecedario(){
		this.sTxt="";
	}//Constructor

	//Constructor 
	public ConteoAbecedario(String sTxt){
		this.sTxt=sTxt;
	}//Constructor

	public String getTxt(){
		return this.sTxt;
	}//getTxt

	public void setTxt(String sTxt){
		this.sTxt=sTxt;
	}//getTxt

	/**
	 * Método encargado de ejecutar el método que cuenta letras y el método que pinta el resultado
	 */
	public void fCuentaLetras(){
		fCortarLetras();
		fImprimeRecuento();
	}//fCuentaLetras
	
	/**
	 * Método encargado de analizar la cadena de texto y registrar en el array aiNum cuántas veces aparece cada letra
	 */
	private void fCortarLetras() {
		//Convertimos la cadena en un array de char
		cLetras=new char[this.sTxt.length()];
		//char[] cLetras=new char[this.sTxt.length()];
		cLetras=this.sTxt.toCharArray();
		//Contamos las veces que aparece cada letra entre la a y la z incluyendo á, é, í, ó y ú
		for(int i=0; i<cLetras.length; i++){
			//System.out.println("Letra [" + i + "]:" + cLetras[i]);
			//System.out.println("Antes aiNum[" + cLetras[i] + "][0]:" + aiNum[cLetras[i]][0]);
			aiNum[cLetras[i]][0]++;
			//System.out.println("Después aiNum[" + cLetras[i] + "][0]:" + aiNum[cLetras[i]][0]);
		}//for i
	}//fCortarLetras
	
	private void fImprimeRecuento() {
		String sLetrasVisualizadas="";
		//Recorremos el array de chars (cLetras) del texto introducido
		for(int i=0; i<cLetras.length; i++) {
			//Comprobamos si la letra analizada ya ha sido registrada
			if(String.valueOf(cLetras[i]).indexOf(sLetrasVisualizadas)<1) {
				//Registramos la letra analizada
				sLetrasVisualizadas=sLetrasVisualizadas+cLetras[i];
				System.out.println("cLetras["+i+"]:" + cLetras[i] + "(" + (int)cLetras[i] + ")");
				System.out.println("Veces: " + aiNum[(int)cLetras[i]][0]);
			}//if cLetras está en sLetraVisualizadas?

		}//for i
	}//fImprimeRecuento

	@Override
	public String toString(){
		return "sTxt=[" + this.sTxt + "]";
	}//toString
}//ConteoAbecedario