package trabajadores;

public class MozosAlmacen extends Empleados {
	private int antiguedad; //Este par�metro hace referencia al n�mero de trienios del trabajador
	//static final int tiempoTrienio = 3; //Este par�metro indica cuantos a�os tiene un trienio
	final private double trienio = 60;
	
	public MozosAlmacen(int codigoEmpleado, String nombre, int antiguedad) {
		super(codigoEmpleado, nombre);
		this.antiguedad = antiguedad;
	}

	public MozosAlmacen() {
		this(0, null, 0);
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	public double getTrienio() {
		return trienio;
	}

	@Override
	public String toString() {
		return super.toString()+"\nAntig�edad: "+(this.antiguedad)+" a�os"
				+"\nSueldo Total (al mes): ";
	}
	
}
