package UT06_OrdenarArray;

public class Animal {
	private static int iNumAnimales=0; //Corresponde al número de objetos de la clase Animal creados 
	private String sEspecie=""; //Corresponde con el nombre de la especie
	private int iEdad=0; //Corresponde con la edad del animal
	private char cSexo='F'; //Se marca F como sexo por defecto
	private int iId=0; //Corresponde con el id de cada animal
			
	
	//Constructor por defecto
	public Animal() {
		iNumAnimales++;
		this.sEspecie="";
		this.iEdad=0;
		this.cSexo='F';
		this.iId=iNumAnimales;
	}//Constructor por defecto
	
	public Animal(String sEspecie, int iEdad, char cSexo) {
		iNumAnimales++;
		this.sEspecie=sEspecie;
		this.iEdad=iEdad;
		//Comprobamos si se ha introducido una M --> Masculino o en caso contrario, siempre será F --> Femenino
		if(cSexo!='M') {
			cSexo='F';
		}//if cSexo=M?
		this.cSexo=cSexo;
		this.iId=iNumAnimales;
	}//Constructor inicializador
	
	//Constructor copia
	public Animal(Animal objAnimal) {
		this.sEspecie=objAnimal.fgetsEspecie();
		this.iEdad=objAnimal.fgetiEdad();
		this.cSexo=objAnimal.fgetcSexo();
		this.iId=objAnimal.fgetId();
	}//Constructor copia

	public String fgetsEspecie() {
		return sEspecie;
	}//fgetsEspecie

	public void fsetsEspecie(String sEspecie) {
		this.sEspecie = sEspecie;
	}//fsetsEspecie

	public int fgetiEdad() {
		return iEdad;
	}//fgetiEdad

	public void fsetiEdad(int iEdad) {
		this.iEdad = iEdad;
	}//fsetiEdad

	public char fgetcSexo() {
		return cSexo;
	}//fgetcSexo

	public void fsetcSexo(char cSexo) {
		this.cSexo = cSexo;
	}//fsetcSexo
	
	public int fgetId() {
		return this.iId;
	}//fgetId

	@Override
	public String toString() {
		return "Especie: [" + fgetsEspecie() + "] - "+
				"Edad: [" + fgetiEdad() + "] - "+
				"Sexo: [" + fgetcSexo()  + "] - "+
				"id: [" + fgetId() + "]";
	}//toString
}//Animal
