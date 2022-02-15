package puertas;

public class Puerta implements ControlBloqueo {
	private int numeroPuerta;
	private String tipoPuerta;
	private boolean bloqueo;
	
	public Puerta(int numeroPuerta, String tipoPuerta, boolean bloqueo) {
		this.numeroPuerta = numeroPuerta;
		this.tipoPuerta = tipoPuerta;
		this.bloqueo = bloqueo;
	}

	public Puerta() {
		this(0, null, false);
	}

	public int getNumeroPuerta() {
		return numeroPuerta;
	}

	public void setNumeroPuerta(int numeroPuerta) {
		this.numeroPuerta = numeroPuerta;
	}

	public String getTipoPuerta() {
		return tipoPuerta;
	}

	public void setTipoPuerta(String tipoPuerta) {
		this.tipoPuerta = tipoPuerta;
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
		if (this.tipoPuerta == "Automatica") 
				return "bloqueada automáticamente";
			 else
				return "bloqueada manualmente";
	}

	@Override
	public String desbloquear() {
		bloqueo = false;
		if (this.tipoPuerta == "Automatica") 
				return "desbloqueada automáticamente";
			 else
				return "desbloqueada manualmente";
	}

	@Override
	public String situacionBloqueo() {
		if (numero == this.numeroPuerta && this.bloqueo == false) {
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
		
		System.out.println("La puerta "+this.numeroPuerta+": "+situacion+". Ahora: "+situacionBloqueo());
	}
}
