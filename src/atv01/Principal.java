package atv01;

import java.util.ArrayList;

import atv01.objs.Ator;
import atv01.objs.Filme;

public class Principal {
	
	public static void main(String args[]) {
		Filme senhor1 = new Filme("O Senhor dos Anéis: A Sociedade do Anel", "Peter Jackson");
		Filme senhor2 = new Filme("O Senhor dos Anéis: As Duas Torres", "Peter Jackson");
		Filme senhor3 = new Filme("O Senhor dos Anéis: O Retorno do Rei", "Peter Jackson");
		Filme senhor4 = new Filme("Mulher Maravilha", "Patty Jenkins");
		Filme senhor5 = new Filme("Adão Negro", "Jaume Collet-Serra");
		Filme senhor6 = new Filme("Kick-Ass", "Jeff Wadlow");
		
		ArrayList<Filme> filmes = new ArrayList();
		
		filmes.add(senhor1);
		filmes.add(senhor2);
		filmes.add(senhor3);
		filmes.add(senhor4);
		filmes.add(senhor5);
		filmes.add(senhor6);
		
		
		Ator ator1 = new Ator("Gal Gadot");
		Ator ator2 = new Ator("Cate Blanchett");
		Ator ator3 = new Ator("Elijah Wood");
		Ator ator4 = new Ator("Ian McKellen");
		Ator ator5 = new Ator("Dwayne Johnson/The Rock");
		Ator ator6 = new Ator("Chloë Grace Moretz");
		
		ArrayList<Ator> atores = new ArrayList();
		
		atores.add(ator1);
		atores.add(ator2);
		atores.add(ator3);
		atores.add(ator4);
		atores.add(ator5);
		atores.add(ator6);
		
		boolean continuar = true;
		
		while(continuar) {
			int opc = 1;
			switch(opc) {
			case 1:
			}
		}
	}

}
