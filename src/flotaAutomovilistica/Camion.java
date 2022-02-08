package flotaAutomovilistica;

public class Camion extends Vehiculo {
	private float peso;
	private TipoMotor motor;
	
	public Camion(String matricula, int numeroRuedas, float precio, String color, float peso, TipoMotor motor) {
		super(matricula, numeroRuedas, precio, color);
		this.peso = peso;
		this.motor = motor;
		this.precio = establecer_precio();
	}
	
	public Camion() {
		this(null, 0, 0f, null, 0f, null);
	}
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public TipoMotor getMotor() {
		return motor;
	}
	public void setMotor(TipoMotor motor) {
		this.motor = motor;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nPeso: "+this.peso+"| Motor: "+this.getMotor().name().toLowerCase();
	}
	
	@Override
	public float establecer_precio() {
		float motorGasolina = 0.02f, motorDiesel = 0.05f;
		if (this.motor == TipoMotor.GASOLINA) {
			this.precio = this.precio*(1+motorGasolina); //20000 = 20000*(1+0.02)
		} else
			this.precio = this.precio*(1+motorDiesel);
		
		float resultadoFinal = super.establecer_precio();
		return resultadoFinal;
	}
	
	
	
}
