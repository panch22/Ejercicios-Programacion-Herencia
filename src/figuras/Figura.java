package figuras;

public abstract class Figura {
	protected double posicionX;
	protected double posicionY;
	
	public Figura(double posicionX, double posicionY) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}

	public Figura() {
		this(0.0, 0.0);
	}

	@Override
	public String toString() {
		return "La figura tiene: "
				+ "\n1. Posicion X = "+this.posicionX
				+ "\n2. Posicion Y = " +this.posicionY;
	}
	
	public abstract double calcularPerimetro();
}
