package puertas;

public class Ventana implements ControlBloqueo {
	private int numeroVentana;
	private String tipoVentana;
	private boolean bloqueo;
	
	public Ventana(int numeroVentana, String tipoVentana, boolean bloqueo) {
		this.numeroVentana = numeroVentana;
		this.tipoVentana = tipoVentana;
		this.bloqueo = bloqueo;
	}

	public Ventana() {
		this(0, null, false);
	}

	public int getNumeroVentana() {
		return numeroVentana;
	}

	public void setNumeroVentana(int numeroVentana) {
		this.numeroVentana = numeroVentana;
	}

	public String getTipoVentana() {
		return tipoVentana;
	}

	public void setTipoVentana(String tipoVentana) {
		this.tipoVentana = tipoVentana;
	}

	public boolean isBloqueo() {
		return bloqueo;
	}

	public void setBloqueo(boolean bloqueo) {
		this.bloqueo = bloqueo;
	}

	@Override
	public String bloquear() {	
		bloqueo = true;
		if (this.tipoVentana == "Automatica") 
				return "bloqueada automáticamente";
			 else
				return "bloqueada manualmente";
	}

	@Override
	public String desbloquear() {
		bloqueo = false;
		if (this.tipoVentana == "Automatica") 
				return "desbloqueada automáticamente";
			 else
				return "desbloqueada manualmente";
	}

	@Override
	public String situacionBloqueo() {
		if (numero == this.numeroVentana && this.bloqueo == false) {
			return bloquear();
		} else 
			return desbloquear();
	}

	public void informacion() {
		String situacion;
		if (bloqueo == false) {
			situacion = "desbloqueada";
		} else
			situacion = "bloqueada";
		
		System.out.println("La ventana "+this.numeroVentana+": "+situacion+". Ahora: "+situacionBloqueo());
	}
}
