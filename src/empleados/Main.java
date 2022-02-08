package empleados;

public class Main {
	Empresa Asturias = new Empresa("Asturias S.L");
	Empleados administrador = new Administradores(1, "Pepe", Asturias, 6);
	Empleados vendedor = new Vendedores (2, "Luis", Asturias, 800);
	ControlEmpleados control = new ControlEmpleados(); 
	
	public Main() {
		control.control(administrador, Asturias);
		control.control(vendedor, Asturias);
		control.controlarGasto(Asturias);
	}
	
	public static void main (String[] args) {
		Main interfaz = new Main();
	}
}
