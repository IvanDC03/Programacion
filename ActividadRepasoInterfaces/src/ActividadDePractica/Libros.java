package ActividadDePractica;

public class Libros implements Prestable {
private String codigo;
private String titulo;
private int añoDePublicacion;
private boolean prestado;

public Libros(String codigo, String titulo, int añoDePublicacion, boolean prestado) {
	this.codigo = codigo;
	this.titulo = titulo;
	this.añoDePublicacion = añoDePublicacion;
	this.prestado = prestado;
}
@Override
public String toString() {
	return "Libros [codigo=" + codigo + ", titulo=" + titulo + ", añoDePublicacion=" + añoDePublicacion + ", prestado="
			+ prestado + "]";
}
@Override
public void prestado() {
	// TODO Auto-generated method stub
	
}
@Override
public void prestar() {
	// TODO Auto-generated method stub
	
}
@Override
public void devolver() {
	// TODO Auto-generated method stub
	
}

}
