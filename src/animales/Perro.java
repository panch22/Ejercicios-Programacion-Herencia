package animales;

public class Perro extends Animal {
	private String raza;
	
	public Perro(float peso, String raza, String tipoAnimal) {
		super();
		this.raza = raza;
	}

	public Perro() {
		this(0f, null, null);
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public void emitirSonido()  {
		super.emitirSonido();
		System.out.print("Guau, guau");
	}
	
	@Override
	public String toString() {
		return super.toString()+" Raza: "+this.raza;
	}
}
