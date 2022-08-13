package br.com.me;

import br.com.me.model.Dog;

public class FirstProgram {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Livros livros = new Livros();
		
		System.out.println(dog);
		System.out.println(livros);
		
		
		
		/*System.out.println("Hellow Worlds");
		
		int a = 1;
		int b = 2;
		
		System.out.println("a soma é " + (a+b));*/
		
		
		
	}

}


class Livros {
	private String nome;
	private String npag;
}
