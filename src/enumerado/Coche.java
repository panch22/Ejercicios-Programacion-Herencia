package enumerado;

public class Coche {
	private String marca;
	private TipoSeguro seguro;
	
	public Coche(String marca, TipoSeguro seguro) {
		super();
		this.setMarca(marca);
		this.setSeguro(seguro);
	}

	public Coche() {
		super();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public TipoSeguro getSeguro() {
		return seguro;
	}

	public void setSeguro(TipoSeguro seguro2) {
		this.seguro = seguro2;
	}
	
	
}
