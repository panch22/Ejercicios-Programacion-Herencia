package puertas;

public interface ControlBloqueo {
	int numero = (int) (Math.random()*4)+1;
	String bloquear();
	String desbloquear();
	String situacionBloqueo();
}
