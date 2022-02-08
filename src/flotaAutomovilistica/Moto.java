package flotaAutomovilistica;

public class Moto extends Vehiculo {
	//final static float precio_faros=200f;
	private boolean farosAntiniebla; //true si tiene faros antiniebla

	public Moto(String matricula, int numeroRuedas, float precio, String color, boolean farosAntiniebla) {
		super(matricula, numeroRuedas, precio, color);
		this.farosAntiniebla = farosAntiniebla;
		this.precio = establecer_precio();
	}

	public Moto(String matricula, float precio, String color, boolean farosAntiniebla) {
		super(matricula, 2, precio, color);
		this.farosAntiniebla = farosAntiniebla;
		this.precio = establecer_precio();
	}
	
	public Moto() {
		this(null, 0, 0f, null, false);
	}
	
	public boolean isFarosAntiniebla() {
		return farosAntiniebla;
	}

	public void setFarosAntiniebla(boolean farosAntiniebla) {
		this.farosAntiniebla = farosAntiniebla;
	}

	@Override
	public String toString() {
		return super.toString()+"\n"+farosAntiniebla();
	}
	
	//Mejor sacar el método farosAntiniebla() y ponerlo en el toString de la interfaz
	//Hecho por mi, al igual como la profe (coincidencia pura y dura)
	
	public String farosAntiniebla() {
		String respuesta = null;
		if (this.farosAntiniebla) {
			respuesta = "Tiene antinieblas";
		} else
			respuesta = "No tiene antinieblas";
		
		return respuesta;
	}
	
	//Hecho por Marco
	
	public String farosAntiniebla2() {
		if (this.farosAntiniebla) {
			return "Tiene antinieblas";
		} else
			return "No tiene antinieblas";	
	}
	
	@Override
	public float establecer_precio() {
		float precioAntinieblas = 0;
		if (this.farosAntiniebla == true) {
			precioAntinieblas = 200f;
		} else
			precioAntinieblas = 0;
		
		float resultadoFinal = super.establecer_precio()+precioAntinieblas;
		return resultadoFinal;
	}
	
/*	public void establecer_precio2() {
		if(this.farosAntiniebla) {
			this.precio+=precio_faros;
		}
	}
}*/
}
