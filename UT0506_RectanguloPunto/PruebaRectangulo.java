package UT0506_RectanguloPunto;

public class PruebaRectangulo{
	public static void main (String[] args){
		System.out.println("\n**************************** Prueba Rectángulo ****************************");

		//Creamos el 1º rectángulo a partir de 4 parámetros
		Rectangulo objRect1=new Rectangulo(1,2,6,2);
		
		//Creamos el 2º rectángulo a partir de 1 obj Punto + Ancho y Largo
		Punto objPunto1=new Punto(5,6);
		Rectangulo objRect2=new Rectangulo(objPunto1, 5,5);

		//Creamos el 3º rectángulo a partir de 2 obj Punto
		Punto objPunto2=new Punto(7,8);
		Rectangulo objRect3=new Rectangulo(objPunto1, objPunto2);

		//Mostramos la información del Rectangulo 1
		System.out.println("\nEl objRect1 tiene unas" + objRect1.toString());;

		//Mostramos la información del Rectangulo 2
		System.out.println("\nEl objRect2 está creado a partir de un objeto punto " + objPunto1.toString());
		System.out.println("Con esta información el objRect2 tiene unas " + objRect2.toString());;

		//Mostramos la información del Rectangulo 3
		System.out.println("\nEl objRect3 está creado a partir de un 1º objeto punto " 
					+ objPunto1.toString()
					+ " y un 2º objeto punto: " 
					+ objPunto2.toString()
				);
		System.out.println("por ello el objRect3 tienes unas" + objRect3.toString());;

		//Informamos el número de rectángulos creados
		System.out.printf("\nSe han creado %03d objetos Rectangulo.\n\n", Rectangulo.fNumObjRectangulo());

		System.out.println("------------------------------------------------");
		System.out.println("Fórmula del Area= Base * Altura");
		System.out.println("Fórmula del Perímetro= 2 * (Base + Altura)");
		System.out.println("------------------------------------------------");



		//Informamos del área y perímetro del Rectangulo 1
		System.out.printf("El rectángulo 1 presenta un área de %05.2f y un perímetro %05.2f\n\n",
			objRect1.fCalcularArea(), objRect1.fCalcularPerimetro());

		//Informamos del área y perímetro del Rectangulo 2
		System.out.printf("El rectángulo 2 presenta un área de %05.2f y un perímetro %05.2f\n\n",
			objRect2.fCalcularArea(), objRect2.fCalcularPerimetro());

		//Informamos del área y perímetro del Rectangulo 3
		System.out.printf("El rectángulo 3 presenta un área de %05.2f y un perímetro %05.2f",
			objRect3.fCalcularArea(), objRect3.fCalcularPerimetro());

		
		System.out.println("\n\n**************************** FIN Prueba Rectángulo ****************************\n\n");
	}//main
}//PruebaRectangulo