package figuras;

public class Rectángulo extends Figura{
	private double altura;
	private double base;
	
	public Rectángulo(double posicionX, double posicionY, double altura, double base) {
		super(posicionX, posicionY);
		this.altura = altura;
		this.base = base;
	}
	
	public Rectángulo() {
		this(0.0, 0.0, 0.0, 0.0);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+ "\n3. Base = "+this.base
				+"\n4. Altura = "+this.altura;
	}

	@Override
	public double calcularPerimetro() {
		int numero = 2;
		return numero*(this.base+this.altura);
	}
}
