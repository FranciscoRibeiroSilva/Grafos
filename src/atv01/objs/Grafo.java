package atv01.objs;

public class Grafo {
	private int filmes [][];
	private int atores [][];
	private int actFilm [][];
	
	private Grafo() {
		this.actFilm = new int [11][11];
		this.atores = new int[5][5];
		this.filmes = new int[5][5];
	}
	
	public void setAtor(int indexA, int indexB) {
		this.atores[indexA][indexB] = 1;
	}
	
	public void setFilme(int indexA, int indexB) {
		this.filmes[indexA][indexB] = 1;
	}
	
	public void addAtor(int indexA, int indexB) {
		this.actFilm[indexA][indexB] = 1;
	}
	
}
