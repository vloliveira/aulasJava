package exerciciosAbstracao;

import java.util.ArrayList;

public class UsarAnimal {

	public static void main(String[] args) {
		ArrayList<Animal> animais = new ArrayList<>();
		animais.add(new Cachorro());
		animais.add(new Gato());
		animais.add(new Cachorro());
		
		
		
		for (Animal animal : animais) {
			animal.emitirSom();
			animal.dormir();
		}

	}

}
