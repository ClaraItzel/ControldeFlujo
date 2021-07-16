import java.util.Scanner;

public class ControldeFlujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * if (condicion) si cumple{
		 * codigo
		 * }
		 */
	
		Scanner sc= new Scanner(System.in);
		Scanner nombre= new Scanner(System.in);
		System.out.println("Ingresa tu edad");
		int edad = sc.nextInt();
		System.out.println("Ingresa tu nombre");
		String name= nombre.nextLine();
		String mensaje= Generation(edad, name);
		System.out.println(mensaje);
	}
	/*
	public static String votar(int edad){
		String mensaje;
		if(edad >=18) {
			mensaje="Felicidades puedes votar";
		}else {
			mensaje="NO Puedes votar";
		}
		return mensaje;
	}*/
	public static String Generation(int edad, String nombre) {
		String mensaje;
		if(edad >=18 && edad <=29) {
			mensaje="Felicidades " + nombre +" eres candidato a Generation";
		}else {
			mensaje= "Lo sentimos "+ nombre +", no cumples los requisitos de edad para el programa zorry";
		}
		return mensaje;
	}
}
