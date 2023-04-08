package test;

import dominio.SalaCine;

public class Cine {

	public static void main(String[] args) {
		
		SalaCine sala = new SalaCine();
		
		
		System.out.println(estaVacia(sala)); 
		
		sala.butacaVacia(2, 4);
		
		System.out.println(estaVaciaLaButaca(sala, 2, 4));
		
		
		
		System.out.println(estaVaciaLaButaca(sala, 0, 0));
		
		System.out.println(estaVacia(sala)); 
		sala.agregarButaca(0, 3);
		sala.agregarButaca(0, 2);
		sala.agregarButaca(0, 1);
		sala.agregarButaca(0, 0);
		sala.agregarButaca(1, 3);
		sala.agregarButaca(1, 2);
		sala.agregarButaca(1, 1);
		sala.agregarButaca(1, 0);
		sala.agregarButaca(2, 3);
		sala.agregarButaca(2, 2);
		sala.agregarButaca(2, 1);
		sala.agregarButaca(2, 0);
		
		
		System.out.println(sala.cantidadDeButacasOcupadas()); 
		
		
		if(sala.hayEspacioParaPersonas(4)) {
			System.out.println("espacio suficiente");
		}else {
			System.out.println("no hay espacio");
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


}
