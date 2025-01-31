<<<<<<< HEAD
package UT0601_ContarVocales;
=======
package fp_Programacion_Clases_UT06.UT0601_ContarVocales;
>>>>>>> main

import java.util.regex.Matcher;
import java.util.regex.Pattern;

<<<<<<< HEAD
public class ContarVocales{
=======
public class ContarVocales {
>>>>>>> main
	private int iNumVocales=0, iNumVocalesMinusculas=0, iNumVocalesMayusculas=0, iNumVocalesTildes=0;
	private String sTexto="";
	
	public ContarVocales(){
		this.iNumVocales=0;
		this.iNumVocalesMinusculas=0;
		this.iNumVocalesMayusculas=0;
		this.iNumVocalesTildes=0;
	}//Constructor vacío
	
	public ContarVocales(String sTxt){
		this.iNumVocales=0;
		this.iNumVocalesMinusculas=0;
		this.iNumVocalesMayusculas=0;
		this.iNumVocalesTildes=0;
		this.sTexto=sTxt;
		//Invocamos al método encargado de contar las vocales minúsculas, mayúsculas y acentuadas
		fCuentaVocales();
	}//Constructor 

	public int fgetNumVocales(){
		return this.iNumVocales;
	}//fgetNumVocales

	public void fsetNumVocales(int iNumVoc){
		this.iNumVocales=iNumVoc;
	}//fsetNumVocales

	public int fgetNumVocalesMinusculas(){
		return this.iNumVocalesMinusculas;
	}//fgetNumVocalesMinusculas

	public void fsetNumVocalesMinusculas(int iNumVocMin){
		this.iNumVocalesMinusculas=iNumVocMin;
	}//fsetNumVocalesMinusculas

	public int fgetNumVocalesMayusculas(){
		return this.iNumVocalesMayusculas;
	}//fgetNumVocalesMayusculas

	public void fsetNumVocalesMayusculas(int iNumVocMay){
		this.iNumVocalesMayusculas=iNumVocMay;
	}//fsetNumVocalesMayusculas

	public int fgetNumVocalesTildes(){
		return this.iNumVocalesTildes;
	}//fgetNumVocalesTildes

	public void fsetNumVocalesTildes(int iNumVocTildes){
		this.iNumVocalesTildes=iNumVocTildes;
	}//fsetNumVocalesTildes

	public String fgetTexto(){
		return this.sTexto;
	}//fgetTexto

	public void fsetTexto(String sTxt){
		this.sTexto=sTxt;
	}//fsetTexto


	/**
	* Método encargado de llamar a los métodos encargados de contar vocales minúsculas, mayúsculas y acentuadas
	*
	*/
	private void fCuentaVocales(){
		fCuentaVocalesMinusculas(); //Método encargado de contar vocales minúsculas
		fCuentaVocalesMayusculas(); //Método encargado de contar vocales mayúsculas
		fCuentaVocalesAcentuadas(); //Método encargado de contar vocales mayúsculas o minúsculas acentuadas

	}//fCuentaVocales

	/**
	* Método encargado de contar vocales minúsculas contenidas en el texto de la variable sTexto
	*
	*/
	private void fCuentaVocalesMinusculas(){
		String sPatron="";
		boolean bSalir=false;
		
		//Averiguamos las vocales minúsculas contenidas en la cadena de texto del atributo sTexto
		sPatron="[aeiou]";
		Pattern objPattern=Pattern.compile(sPatron);
		Matcher objMatcher=objPattern.matcher(this.sTexto);
		do{
				if(objMatcher.find()){
					this.iNumVocales++;
					this.iNumVocalesMinusculas++;
					bSalir=false;
				}else {
					bSalir=true;
				}//if find()=OK
		}while(!bSalir);
	}//fCuentaVocalesMinusculas

	/**
	* Método encargado de contar vocales mayúsculas contenidas en el texto de la variable sTexto
	*
	*/
	private void fCuentaVocalesMayusculas(){
		String sPatron="";
		boolean bSalir=false;
		
		//Averiguamos las vocales mayúsculas contenidas en la cadena de texto del atributo sTexto
		sPatron="[AEIOU]";
		Pattern objPattern=Pattern.compile(sPatron);
		Matcher objMatcher=objPattern.matcher(this.sTexto);
		do{
				if(objMatcher.find()){
					this.iNumVocales++;
					this.iNumVocalesMayusculas++;
					bSalir=false;
				}else {
					bSalir=true;
				}//if find()=OK
		}while(!bSalir);
	}//fCuentaVocalesMayusculas

	/**
	* Método encargado de contar vocales mayúsculas y minúsculas acentuadas contenidas en el texto de la variable sTexto
	*
	*/
	private void fCuentaVocalesAcentuadas(){
		String sPatron="";
		boolean bSalir=false;
		
		//Averiguamos las vocales minúsculas contenidas en la cadena de texto del atributo sTexto
		sPatron="[ÁÉÍÓÚáéíóú]";
		Pattern objPattern=Pattern.compile(sPatron);
		Matcher objMatcher=objPattern.matcher(this.sTexto);
		do{
				if(objMatcher.find()){
					this.iNumVocales++;
					this.iNumVocalesTildes++;
					bSalir=false;
				}else {
					bSalir=true;
				}//if find()=OK
		}while(!bSalir);
	}//fCuentaVocalesAcentuadas


	@Override
	public String toString(){
		return "\n\nTexto: [" + this.sTexto + "] \n" +
			"Número de vocales: " + this.iNumVocales + " \n" +
			"Número de vocales minúsculas: " + this.iNumVocalesMinusculas + " \n" +
			"Número de vocales mayúsculas: " + this.iNumVocalesMayusculas + " \n" +
			"Número de vocales con tilde: " + this.iNumVocalesTildes;

	}//toString
}//ContarVocales