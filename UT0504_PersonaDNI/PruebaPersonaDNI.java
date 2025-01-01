package UT0504_PersonaDNI;


/**
* Casos de Uso:
* 1. Número de DNI con > 8 dígitos
* 	- 123456789
* 	- 1234567890123
* 	- 123
* 	- 51071921
*
* 2. Letra incorrecta
*	- R00000024 --> Correcto
*	- 12341234H --> Incorrecto
*	- 00000000T --> Correcto
*	- 00000023T --> Correcto
*	- 00000024R --> Correcto
*	- 51071940F --> Incorrrecto
*	- 51071944F --> Corrrecto
*
* 3. Edad
*	- Edad=-2  --> Edad=0
*	- Edad=0   --> Edad=0
*	- Edad=12  --> Edad=12
*	- Edad=22  --> Edad=22
*	- Edad=134 --> Edad=120
*
*/

public class PruebaPersonaDNI{
	public static void main (String[] args){
		System.out.println("Clase PruebaPersonaDNI");

		//Instanciando 6 personas
		Persona objPersona1=new Persona("Pepe", "Perez", "Jimenez", 42, 'M', 8975442);
		Persona objPersona2=new Persona("Juan", "López", "Gómez", 14, 'M', 8976445);
		Persona objPersona3=new Persona("Maria", "Martinez", "Pérez", 38, 'F', 36455112);
		Persona objPersona4=new Persona("Juan", "López", "Gómez",14, 'M', 8976445);
		Persona objPersona5=new Persona(objPersona4);
		Persona objPersona6=new Persona();

		//Presentamos la información de los 6 objetos
		System.out.println(objPersona1.toString());
		System.out.println(objPersona2.toString());
		System.out.println(objPersona3.toString());
		System.out.println(objPersona4.toString());
		System.out.println(objPersona5.toString());
		System.out.println(objPersona6.toString());
		System.out.printf("\nActualmente, hay creadas %03d personas",
					Persona.fgetNroPersonas());

		PruebaPersonaDNI objPP=new PruebaPersonaDNI();
		objPP.MetodoPruebaPersonaTemporal();

		////////////////////////////// EXTRA
		System.out.println("\n\n**************************************************************");
		System.out.println("Eliminamos el objeto objPersona5 y objPersona6");
		objPersona5.finalize();
		objPersona5=null;
		objPersona6.finalize();
		objPersona6=null;
		System.out.printf("Actualmente tenemos %03d objetos de la clase Persona",
					objPersona1.fgetNroPersonas());
		System.out.println("\n\n**************************************************************");
	}//main

	public void MetodoPruebaPersonaTemporal(){
		System.out.println("\n\nProcedemos a crear un nuevo objeto de la clase Persona");
		Persona objPersona7=new Persona();
		System.out.printf("Actualmente tenemos %03d objetos de la clase Persona",
					objPersona7.fgetNroPersonas());


	}//MetodoPruebaPersonaTemporal

}//PruebaPersonaDNI
