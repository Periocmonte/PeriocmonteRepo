package fp_Programacion_Clases_UT06.UT0603_ArrayCadenas;

public class ArrayCadenas {
	private String[] asCadena1=new String[3];
	private String[] asCadena2=new String[3];

	//Constructor por defecto
	public ArrayCadenas(){
		for(int i=0; i<3; i++){
			this.asCadena1[i]="";
			this.asCadena2[i]="";
		}//for i
	}//Constructor

	//Constructor inicializador de los 2 arrays
	public ArrayCadenas(String[] asCadena1, String[] asCadena2){
		this.asCadena1=asCadena1;
		this.asCadena2=asCadena2;
	}//Constructor

	public void fsetCadenas(String[] asCadena1, String[] asCadena2){
		this.asCadena1=asCadena1;
		this.asCadena2=asCadena2;
	}//fsetCadena

	public String[] fgetCadena1(){
		return this.asCadena1;
	}//fgetCadena1

	public String[] fgetCadena2(){
		return this.asCadena1;
	}//fgetCadena2

	/**
	* Método encargado de imprimir por pantalla el contenido del array asCadena1
	*
	* @param iCadena: [int] Si se recibe un 1 se imprimirá el contenido del array Cadena1 y si se recibe un 2 se imprimirá el array Cadena2. Si se recibe otro valor, se presentará el array de Cadena1
	*/
	public void fPrintCadena(int iCadena){
		String sTxt="";
		if(iCadena!=1 && iCadena!=2){
			iCadena=1;
		}//if
		for(int i=0; i<3; i++){
			if(iCadena==1){
				sTxt+="asCadena1["+i+"]:["+this.asCadena1[i]+"]\n";
			}else{
				sTxt+="asCadena2["+i+"]:["+this.asCadena2[i]+"]\n";
			}//if iCadena?
		}//for i
		System.out.println("El array Cadena" + iCadena + " contiene los siguientes valores: \n" + sTxt);
	}//fPrintCadena

	/**
	 * Método encargado de orindentar las matrices
	 * @param asCadenaAOrdenar
	 */
	public void fOrdenaCadena(String[] asCadenaAOrdenar) {
		String[] asCadOrdenar = new String[3];
		String sCadTmp="";
		
		asCadOrdenar=asCadenaAOrdenar;
		for(int i=0;i<asCadenaAOrdenar.length-1;i++) {
			if((String.valueOf(asCadOrdenar[i]).compareToIgnoreCase(asCadOrdenar[i+1]))>0) {
				sCadTmp=asCadOrdenar[i];
				asCadOrdenar[i]=asCadOrdenar[i+1];
				asCadOrdenar[i+1]=sCadTmp;
			}//if
		}//for i
		//System.out.println(asCadOrdenar[0] + " - " + asCadOrdenar[1]);
		
	}//fOrdenaCadena
	
	@Override
	public String toString(){
		String sTxt="";
		for(int i=0; i<3; i++){
			sTxt+="asCadena1["+i+"]:["+this.asCadena1[i]+"]\n";
		}//for i		
		sTxt+="\n\n";
		for(int i=0; i<3; i++){
			sTxt+="asCadena1["+i+"]:["+this.asCadena1[i]+"]\n";
		}//for i
		return sTxt;
	}//toString

}//ArrayCadenas