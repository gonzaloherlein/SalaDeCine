package test;

import java.util.Scanner;

import dominio.SalaCine;

public class Cine {

	public static void main(String[] args) {
		
		SalaCine sala = new SalaCine();
		Scanner input = new Scanner(System.in);
			
		boolean salir = false;
		
		while (salir == false) {
			
			System.out.println("Quiere ocupar una butaca? Y/N");
			
			String opcion = input.next();
			
			if (opcion.equalsIgnoreCase("Y")) {
				
				System.out.println("Ingrese la posicion de FILA de butaca que quiere agregar");
				int fila = input.nextInt()-1;
				
				System.out.println("Ingrese la posicion de COLUMNA de butaca que quiere agregar");
				
				int columna = input.nextInt()-1;
				
				if(estaVaciaLaButaca(sala, fila, columna).equals("butaca vacia")) {
					
					sala.agregarButaca(fila, columna);
				} else {
					System.out.println("No te podés sentar ahí, capo.");
				}
	
				
			} else if (opcion.equalsIgnoreCase("N")) {
				salir = true;
			} else {
				System.out.println("Ingrese una opción correcta.");
			}
		}
		
		System.out.println(estaVaciaLaButaca(sala, 2, 4));
		
		System.out.println(estaVaciaLaButaca(sala, 0, 0));
		
		imprimirSalaCompleta(sala);
				
		System.out.println("Hay "+sala.cantidadDeButacasOcupadas()+" butaca/s ocupada/s."); 
		
		if(sala.hayEspacioParaPersonas(8)) {
			System.out.println("Hay espacio suficiente.");
		}else {
			System.out.println("No hay espacio suficiente.");
		}
	}
	
	public static String estaVacia(SalaCine sala) {
		if(sala.salaEstaVacia()) {
			return "Sala vacia";
		}else {
			return "la sala no esta vacia";
		}
	}
	
	public static String estaVaciaLaButaca(SalaCine sala,int i, int j) {
		if(sala.butacaVacia(i,j)) {
			return "butaca vacia";
		}else {
			return "butaca llena";
		}
	}
	
	public static void imprimirSalaCompleta(SalaCine sala) {
		
		sala.getButacas();
		
		for(int i = 0; i < sala.getButacas().length; i++) {

			for(int j = 0; j < sala.getButacas()[i].length; j++) {
				
				if(sala.getButacas()[i][j] != 0) {
					
					System.out.print("[X]");
				} else {
					System.out.print("[ ]");
				}
			}
			System.out.println("\n");
		}
			System.out.println("--------PANTALLA---------");
		
	}
}
