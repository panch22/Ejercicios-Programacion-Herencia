package trabajadores;

public class Sueldo {
	public static double calcularSueldo(Empleados empleado) {
		if (empleado instanceof Mensajeros) {
			return empleado.sueldoBase + ((Mensajeros) empleado).getDietas();
		} else {
			return empleado.sueldoBase
					+ ((((MozosAlmacen) empleado).getAntiguedad()/3)*((MozosAlmacen) empleado).getTrienio());
		}
	}
	
	public String toString(Empleados empleado) {
		return empleado.toString()+calcularSueldo(empleado);
	}
}
