package puertas2;

public class Puerta {
	private int numPuerta;
	private boolean bloqueada;

	public Puerta(int numPuerta) {
		this.numPuerta = numPuerta;
		bloqueada = false;
	}

	public Puerta() {
		this(0);
	}

	public int getNumPuerta() {
		return numPuerta;
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

	public String toString() {
		return "Puerta: " + this.numPuerta + "; Estado: ";
	}

	public String visualizarEstado() {
		if (this.bloqueada == false) {
			return "desbloqueada";
		} else
			return "bloqueada";
	}

}
