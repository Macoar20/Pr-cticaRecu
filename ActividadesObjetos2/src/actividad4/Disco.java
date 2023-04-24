package actividad4;

public class Disco {

	private String codigo;
	private String autor;
	private String titulo;
	private String genero;
	private int duracion;
	
	public Disco() {
		
	}

	public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
		
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
	}
	
	public Disco(Disco disco) {
		this.equals(disco);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	
	public String toString() {
		
		String result = "";
		result += "Código" + this.codigo + "\n";
		result += "Autor" + this.autor + "\n";
		result += "Título" + this.titulo + "\n";
		result += "Género" + this.genero + "\n";
		result += "Duracion" + this.duracion + "\n";
		return result;
		
	}
	
	
}
