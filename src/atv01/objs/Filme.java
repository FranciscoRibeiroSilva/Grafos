package atv01.objs;

public class Filme {
	private String titulo;
	private String diretor;
	
	public Filme(String titulo, String diretor) {
		this.titulo = titulo;
		this.diretor = diretor;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	public String getDiretor() {
		return this.diretor;
	}
}
