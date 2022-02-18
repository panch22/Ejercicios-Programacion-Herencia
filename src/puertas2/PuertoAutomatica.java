package puertas2;

public class PuertoAutomatica extends Puerta implements Itemporizador {

	public PuertoAutomatica(int numPuerta) {
		super(numPuerta);
	}

	@Override
	public void bloquear_desbloquear() {
		if (isBloqueada()) {
			desbloquear();
		} else
			bloquear();
	}
}
