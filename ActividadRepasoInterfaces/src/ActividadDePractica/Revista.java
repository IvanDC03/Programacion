package ActividadDePractica;

public class Revista implements Prestable {
	private String codigo;
	private String titulo;
	private int añoDePublicacion;
	private int numero;
	private boolean prestado;
	public Revista(String codigo, String titulo, int añoDePublicacion, int numero) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.añoDePublicacion = añoDePublicacion;
		this.numero = numero;									
	}
	@Override
	public String toString() {
		return "Revista [codigo=" + codigo + ", titulo=" + titulo + ", añoDePublicacion=" + añoDePublicacion
				+ ", numero=" + numero + "]";
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
