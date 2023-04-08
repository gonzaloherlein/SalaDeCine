package dominio;

public class SalaCine {

	int[][] butacas = new int[3][8];

	public SalaCine() {

	}

	public boolean salaEstaVacia() {
		boolean estaVacia = true;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 8; j++) {
				if (butacas[i][j] != 0) {
					estaVacia = false;
					return estaVacia;
				}
			}
		}

		return estaVacia;
	}

	public boolean butacaVacia(int fila, int columna) {
		boolean vacia = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 8; j++) {
				if (butacas[fila][columna] != 0) {
					vacia = false;
					return vacia;
				}
			}
		}

		return vacia;
	}

	public void agregarButaca(int fila, int columna) {

		if (butacaVacia(fila, columna)) {
			butacas[fila][columna] = 2;
		}

	}

	public int cantidadDeButacasOcupadas() {
		int cantidadButacasOcupadas = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 8; j++) {
				if (butacas[i][j] != 0) {
					cantidadButacasOcupadas++;
				}
			}
		}
		return cantidadButacasOcupadas;
	}

	public boolean hayEspacioParaPersonas(int cantidadPersonas) {
		for (int i = 0; i < butacas.length; i++) {
			int contador = 0;
			for (int j = 0; j < butacas[i].length; j++) {
				if (butacas[i][j] == 0) { // asiento vacío
					contador++;
					if (contador == cantidadPersonas) { // encontramos un bloque contiguo con suficiente capacidad
						// marcar asientos como ocupados

						// imprimir ubicación del grupo acomodado
						return true;

					}
				}
			}
		}
		return false;

	}

	public int[][] getButacas() {
		return butacas;
	}

	public void setButacas(int[][] butacas) {
		this.butacas = butacas;
	}

}
