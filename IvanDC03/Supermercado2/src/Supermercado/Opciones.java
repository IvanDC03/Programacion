package Supermercado;

//Revisar lo de private para lo de diagrams, de todas las clases

import java.util.Comparator;

public class Opciones {
	private int opcion;
	private String añadir;
	private String eliminar;
	private String modificar;
	private String consultar;
	private String salir;
	private String seccion;

	public int getOpcion() {
		return opcion;
	}

	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}

	public String getAñadir() {
		return añadir;
	}

	public void setAñadir(String añadir) {
		this.añadir = añadir;
	}

	public String getEliminar() {
		return eliminar;
	}

	public void setEliminar(String eliminar) {
		this.eliminar = eliminar;
	}

	public String getModificar() {
		return modificar;
	}

	public void setModificar(String modificar) {
		this.modificar = modificar;
	}

	public String getConsultar() {
		return consultar;
	}

	public void setConsultar(String consultar) {
		this.consultar = consultar;
	}

	public String getSalir() {
		return salir;
	}

	public void setSalir(String salir) {
		this.salir = salir;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public Opciones() {
		this.opcion = opcion;
		this.añadir = añadir;
		this.eliminar = eliminar;
		this.modificar = modificar;
		this.consultar = consultar;
		this.salir = salir;
		this.seccion = seccion;
	}

	public void opcion() {
		if (opcion == 1) {
			System.out.println("Mostrar productos del supemercados por seccion" + seccion);
		}
		if (opcion == 2) {
			System.out.println("Añadir productos" + añadir);
		} else if (opcion == 3) {
			System.out.println("Eliminar producto" + eliminar);
		} else if (opcion == 4) {
			System.out.println("Modificar producto" + modificar);
		} else if (opcion == 5) {
			System.out.println("Consultar productos con stock <10" + consultar);
		} else if (opcion == 6) {
			System.out.println("Salir" + salir);
		}

	}
}
