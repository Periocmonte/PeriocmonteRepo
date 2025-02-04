package UT06_OrdenarArray;

import java.util.Arrays;

public class OrdernarArray {
	public static void main(String[] args) {
		boolean bHaHabidoReordenamiento=false;
		
		//Creamos un array "aMisMascotas" con 2 animales
		Animal[] aobjMisMascotas=new Animal[2]; 
		aobjMisMascotas[0]=new Animal("Perro", 10, 'M');
		aobjMisMascotas[1]=new Animal("Gato", 20, 'F');
		
		//Creamos un array "aConjuntoObjetos" con inicialización dinámica de 3 animales y 1 vacío
		Animal[] aobjConjuntoObjetos= {
				new Animal("Caballo", 23, 'K'),
				new Animal("Tortuga", 89, 'M'),
				new Animal("Buho", 13, 'M'),
				new Animal()
		};//aConjuntoObjetos
		
		//Presentamos el array de aMisMascotas
		for(int i=0; i<2; i++) {
			System.out.println(aobjMisMascotas[i].toString());
		}//for i

		//Presentamos el array de aConjuntoObjetos
		for(int i=0; i<4; i++) {
			System.out.println(aobjConjuntoObjetos[i].toString());
		}//for i
		
		System.out.println("\n\n****** Se procede a ordenar el array aConjuntoObjetos ******");

		//Creamos un repositorio temporal para poder ordenar el array aConjuntoObjetos
		Animal objRepo;
		//Recorremos el array identificando por el método de la burbuja si está mal ordenado
		do {
			bHaHabidoReordenamiento=false;
			for(int i=0; i<aobjConjuntoObjetos.length-1; i++) {
				if (aobjConjuntoObjetos[i].fgetiEdad()>aobjConjuntoObjetos[i+1].fgetiEdad()) {
					objRepo=new Animal(aobjConjuntoObjetos[i]); //Guardamos el elemento con edad superior
					aobjConjuntoObjetos[i]=aobjConjuntoObjetos[i+1]; //Reordenamos el más joven
					aobjConjuntoObjetos[i+1]=objRepo; //Restituimos el más viejo al siguiente elemento
					bHaHabidoReordenamiento=true;
				}else {
					//Está bien ordenados
				}
			}//for i
		}while(bHaHabidoReordenamiento);
		//Presentamos el array de aConjuntoObjetos ordenado
		for(int i=0; i<4; i++) {
			System.out.println(aobjConjuntoObjetos[i].toString());
		}//for i

	}//main
}//OrdernarArray