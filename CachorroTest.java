package br.com.xti.poo;

public class CachorroTest{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cachorro pitbull = new Cachorro();//cria-se um objeto que faz referência à classe Cachorro
		
		pitbull.raca = "Pit Bull";//esse objeto deve acessar os atributos (variáveis) da classe Cachorro 
		pitbull.tamanho = 30;
		pitbull.latir();//deve também chamar o método criado na classe Cachorro;
		
		Cachorro viralata = new Cachorro();//pode-se ciar quantos objetos forem necessários
		//e acessar seus (na verdade o da classe) atributos e métodos sempre dessa forma
		viralata.raca = "Vira-Lata";
		viralata.tamanho = 40;
		viralata.latir();

	}

}
