package interfaz;

public class Perro implements IAnimal, ISerVivo {
	private String raza;
	
	public Perro(String raza) {
		this.raza = raza;
	}
	
	public Perro() {
		this(null);
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public void vacunar() {
		System.out.println("Los cachorros necesitan 3 vacunas");
	}

	@Override
	public void comer() {
		System.out.println("Los perros son carnívoros, se alimentan de carne");
	}

}
