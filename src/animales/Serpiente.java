package animales;

public class Serpiente extends Animal {
	private boolean EsVenenosa;
	
	public Serpiente(float peso, boolean esVenenosa, String tipoAnimal) {
		super();
		EsVenenosa = esVenenosa;
	}

	public Serpiente() {
		this(0f, false, null);
	}

	public boolean isEsVenenosa() {
		return EsVenenosa;
	}

	public void setEsVenenosa(boolean esVenenosa) {
		EsVenenosa = esVenenosa;
	}

	public void emitirSonido()  {
		super.emitirSonido();
		System.out.print("Sssss");
	}
	
	public String confirmarVeneno() {
		String respuesta = null;
		if (this.EsVenenosa == true) {
			respuesta = "si";
		} else if (this.EsVenenosa == false) {
			respuesta = "no";
		}
		
		return respuesta;
	}
	
	@Override
	public String toString() {
		return super.toString() +" Venenosa: ";
	}
}
