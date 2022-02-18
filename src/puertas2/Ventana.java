package puertas2;

public class Ventana implements Itemporizador {
	private int numVentana;
	private boolean bloqueada = false;

	public Ventana(int numVentana) {
		this.numVentana = numVentana;
	}

	public int getNumVentana() {
		return numVentana;
	}

	public boolean isBloqueada() {
		return bloqueada;
	}

	public void bloquear() {
		bloqueada = true;
	}

	public void desbloquear() {
		bloqueada = false;
	}

	@Override
	public void bloquear_desbloquear() {
		if (isBloqueada()) {
			bloquear();
		} else
			desbloquear();
	}

	public String visualizarEstado() {
		if (isBloqueada()) {
			return "bloqueada";
		} else
			return "desbloqueada";
	}

	public String toString() {
		return "Ventana: " + this.numVentana + "; Estado: ";
	}

}
