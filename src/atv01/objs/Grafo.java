package atv01.objs;

public class Grafo {
	private Filme filmes [][];
	private int indexF;
	private Ator atores [][];
	private int indexA;
	private Object actFilm [][];
	private int indexAct;
	
	private Grafo() {
		this.actFilm = new Object [11][11];
		this.indexAct = 0;
		this.atores = new Ator[5][5];
		this.indexA = 0;
		this.filmes = new Filme[5][5];
		this.indexF = 0;
	}
	
	public void addAtor(Ator ator) {
		this.atores[this.indexA][this.indexA] = ator;
		setIndexA();
	}
	
	public void addFilme(Filme filme) {
		this.filmes[this.indexF][this.indexF] = filme;
		setIndexF();
	}
	
	public void addAtor(Object atc) {
		this.actFilm[this.indexAct][this.indexAct] = atc;
		setIndexAct();
	}
	
	public void setIndexF() {
		this.indexF++;
	}
	
	public int getIndexF() {
		return this.indexF;
	}
	
	public void setIndexA() {
		this.indexA++;
	}
	
	public int getIndexA() {
		return this.indexA;
	}
	
	public void setIndexAct() {
		this.indexAct++;
	}
	
	public int getIndexAct() {
		return this.indexAct;
	}
}
