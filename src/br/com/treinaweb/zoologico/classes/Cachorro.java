package br.com.treinaweb.zoologico.classes;

public class Cachorro extends Animal implements adultoI {
	@Override
	public boolean esAdulto(){
		if (estaVivo){
			return idade >= 2;
		} else {
			return false;
		}
	}

	public Cachorro(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	public Cachorro(String nome, int idade, String especie){
		super(nome, idade, especie);
	}

	public Cachorro(String nome, int idade){
		super(nome, idade, "Cachorro");
	}

	@Override
	public void emitirBarulho() {
		if (estaVivo){
			System.out.println("Latido do cachorro");
		} else {
			System.out.println("O animal morreu!");
		}
	}
	

}
