package figuras;

public class Circulo extends Figura{
	private double radio;

	public Circulo(double posicionX, double posicionY, double radio) {
		super(posicionX, posicionY);
		this.radio = radio;
	}
	
	public Circulo() {
		this(0.0, 0.0, 0.0);
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return super.toString()+" \n3. Radio = "+this.radio;
	}

	@Override
	public double calcularPerimetro() {
		double nPi = 3.14;
		int numero = 2;
		return this.radio*nPi*numero;
	}

	
	
	
	
	
}
