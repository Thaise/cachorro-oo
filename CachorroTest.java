package br.com.xti.poo;

public class CachorroTest{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cachorro pitbull = new Cachorro();//cria-se um objeto que faz refer�ncia � classe Cachorro
		
		pitbull.raca = "Pit Bull";//esse objeto deve acessar os atributos (vari�veis) da classe Cachorro 
		pitbull.tamanho = 30;
		pitbull.latir();//deve tamb�m chamar o m�todo criado na classe Cachorro;
		
		Cachorro viralata = new Cachorro();//pode-se ciar quantos objetos forem necess�rios
		//e acessar seus (na verdade o da classe) atributos e m�todos sempre dessa forma
		viralata.raca = "Vira-Lata";
		viralata.tamanho = 40;
		viralata.latir();

	}

}
