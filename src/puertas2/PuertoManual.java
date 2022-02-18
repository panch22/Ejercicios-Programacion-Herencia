package puertas2;

public class PuertoManual extends Puerta {

	public PuertoManual() {
		this(0);
	}

	public PuertoManual(int numPuerta) {
		super(numPuerta);
	}
	
	public void bloquear() {
		super.bloquear();
		System.out.println("Puerta: "+getNumPuerta()+" se bloqueó manualmente");
	}
	
	public void desbloquear() {
		super.desbloquear();
		System.out.println("Puerta: "+getNumPuerta()+" se desbloqueó manualmente");
	}
}
