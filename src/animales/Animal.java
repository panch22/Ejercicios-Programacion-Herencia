package animales;

public class Animal {
	protected String tipoAnimal;
	protected float peso;

	public Animal(String tipoAnimal, float peso) {
		super();
		this.tipoAnimal = tipoAnimal;
		this.peso = peso;
	}

	public Animal() {
		tipoAnimal = null;
		peso = 0f;
	}
	
	public void emitirSonido() {
		System.out.println("El sonido que hace es:");
	}
	
	public String toString() {
		return "\nAnimal: "+this.tipoAnimal
				+"\nPeso: "+this.peso;
	}
	
}
