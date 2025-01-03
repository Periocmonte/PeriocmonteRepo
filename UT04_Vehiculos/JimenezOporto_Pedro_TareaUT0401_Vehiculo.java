package UT04_Vehiculos;

public class JimenezOporto_Pedro_TareaUT0401_Vehiculo{
	public static void main(String[] args){
		//Creamos los vehículos
		Vehiculo objCoche=new Vehiculo("Coche", "Seat Panda", 4, 0);
		Vehiculo objCamion=new Vehiculo("Camión", "Volvo 4500", 8, 50.3);
		Vehiculo objBici=new Vehiculo("Bicicleta", "BH Family", 2, 0);
		
		//Mostramos los vehículos
		System.out.println("\n=============== Inicialización de los vehículos en el momento inicial ===============");
		System.out.println(objCoche.fsToString());
		System.out.println(objCamion.fsToString());
		System.out.println(objBici.fsToString());

		//Aceleramos todos los vehículos en 10 km/h
		objCoche.fAcelerar(10);
		objCamion.fAcelerar(10);
		objBici.fAcelerar(10);

		//Mostramos los vehículos ya acelerados
		System.out.println("\n=============== Aceleración de 10 km/h de los vehículos ===============");
		System.out.println(objCoche.fsToString());
		System.out.println(objCamion.fsToString());
		System.out.println(objBici.fsToString());

		//Paramos todos los vehículos a 0 km/h
		objCoche.fParar();
		objCamion.fParar();
		objBici.fParar();

		//Mostramos los vehículos parados
		System.out.println("\n=============== Todos los vehículos parados ===============");
		System.out.println(objCoche.fsToString());
		System.out.println(objCamion.fsToString());
		System.out.println(objBici.fsToString());


	}//main

}//JimenezOporto_Pedro_TareaUT0401_Vehiculo