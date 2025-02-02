/**
* 1. Crear una clase llamada "ArrayCadenas" 
* 2. Debe tener un método principal que inicialice 2 arrays de cadenas
* 3. Dispondrá de un método para visualizar el contenido de cada array
* 4. Dispondrá de un método para ordenarlos alfabéticamente por el método de la burbuja
* 5. Dispondrá de un método para fusionar o mezclar los 2 arrays
* 6. Dispondrá de un método para visualizar el array resultante de la fusión o mezcla
* 7. Se usarán métodos estáticos
*
*
* Se espera una salida similar a:
* Array de Cadenas 1
* Array[0] = Pepe
* Array[1] = Ana
* Array[2] = Carlos
*
* Array de Cadenas 2
* Array[0] = Cristina
* Array[1] = Monica
* Array[2] = Jose

* ---ARRAYS ORDENADOS---
* Array de Cadenas 1
* Array[0] = Ana
* Array[1] = Carlos
* Array[2] = Pepe
*
* Array de Cadenas 2
* Array[0] = Cristina
* Array[1] = Jose
* Array[2] = Monica
*
* ---ARRAYS FUSIONADOS---
* Array de Cadenas 3
* Array[0] = Ana
* Array[1] = Carlos
* Array[2] = Cristina
* Array[3] = Jose
* Array[4] = Monica
* Array[5] = Pepe
*/


package UT0603_ArrayCadenas;

public class PruebaArrayCadenas{
	public static void main(String[] args){
		System.out.println(" ************* Array Cadenas *************");

		ArrayCadenas objACadenas=new ArrayCadenas();
		String[] asCad1=new String[3];
		asCad1[0]="Pepe";
		asCad1[1]="Ana";
		asCad1[2]="Carlos";

		String[] asCad2=new String[3];
		asCad2[0]="Cristina";
		asCad2[1]="Mónica";
		asCad2[2]="Jose";

		System.out.println(" ************* FIN Array Cadenas *************");
	}//main
}//PruebaArrayCadenas