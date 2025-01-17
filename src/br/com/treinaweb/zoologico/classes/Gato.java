package br.com.treinaweb.zoologico.classes;

public class Gato extends Animal implements adultoI{

@Override
	public boolean esAdulto(){
		if (estaVivo){
			return idade >= 1;
		} else {
			return false;
		}
	}
	public Gato(String nome) {
		super(nome);
	}
	
	public Gato(String nome, int idade, String especie){
		super(nome, idade, especie);
	}
	
	public Gato(String nome, int idade){
		super(nome, idade, "Gato");
	}

	@Override
	public void emitirBarulho() {
		if (estaVivo){
			System.out.println("Miado do gato");
		} else {
			System.out.println("O animal morreu!");
		}
	}

}
