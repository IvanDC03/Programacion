package ActividadDePractica;

public class Revista {
	private String codigo;
	private String titulo;
	private int añoDePublicacion;
	private int numero;
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
	
}
