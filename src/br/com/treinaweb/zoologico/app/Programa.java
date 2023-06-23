package br.com.treinaweb.zoologico.app;

import br.com.treinaweb.zoologico.classes.Animal;
import br.com.treinaweb.zoologico.classes.Animavel;
import br.com.treinaweb.zoologico.classes.Cachorro;
import br.com.treinaweb.zoologico.classes.Gato;
import br.com.treinaweb.zoologico.classes.Veterinario;
import br.com.treinaweb.zoologico.classes.Zoologico;

public class Programa {

	public static void main(String[] args) {
		Animal animal = new Cachorro("Tot�", 2);
		
		
		System.out.println("==========");
		System.out.println("Barulho do cachorro: ");
		animal.emitirBarulho();
		System.out.println("***************************");
		Zoologico zoo = new Zoologico();
		zoo.setNome("Zoo TreinaWeb");
		zoo.adicionarAnimal(animal);
		Animal animal2 = new Gato("Z�", 3);
		zoo.adicionarAnimal(animal2);
		System.out.println("Animais do zool�gico " + zoo.getNome());
		zoo.listarAnimais();
		zoo.removerAnimal(0);
		System.out.println("Depois da remo��o: ");
		zoo.listarAnimais();
		
		Veterinario vet = new Veterinario();
		vet.setNome("TreinaWeb");
		vet.atenderAnimal(animal);
		vet.listarAnimaisAtendidos();
		Animal a=new Cachorro("Perro", 0);
		a.emitirBarulho();
	}

}
