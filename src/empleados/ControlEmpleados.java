package empleados;

import java.util.*;

public class ControlEmpleados {
	public static Scanner sc = new Scanner(System.in);

	public void control(Empleados empleado, Empresa empresa) {
		System.out.println(empleado.toString());
		empresa.setTotalEmpleados(empresa.getTotalEmpleados()+1);
		empresa.setTotalPagado(empresa.getTotalPagado() + empleado.calcularSueldoMensual());	
	}

	public void controlarGasto(Empresa empresa) {
		System.out.println("\nEl número total de empleados en la empresa es: " + empresa.getTotalEmpleados());
		System.out.println("Total pagado por la empresa: " + empresa.getTotalPagado());

		if (empresa.getTotalPagado() > 10000) {
			System.out.println("La empresa tiene que recortar gastos");
		} else
			System.out.println("Elegir a quién contratar: V (vendedor) o A (administrador)");
		
		String opcion = elegirOpcion();

		switch (opcion) {
		case "a":
			System.out.println("Prefieres un administrativo");
			break;
		case "v":
			System.out.println("Prefieres un vendedor");
			break;
		}
	}

	public String elegirOpcion() {
		String opcion;
		do {
			opcion = sc.next();
			if (opcion.toLowerCase().contentEquals("a"))
				opcion = "a";
			else
				if (opcion.toLowerCase().contentEquals("v"))
				opcion = "v";
			
				else
					System.out.println("Elegir de nuevo");
		} while (opcion != "a" && opcion != "v");
		
		return opcion;
	}

}
