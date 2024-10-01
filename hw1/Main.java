package hw1;

public class Main {
	
	public static void main(String[] args) {
		Animal[] animals = {new Dog(), new Cat(), new Sheep()};

		Zoo zoo = new Zoo();
		
		// for-each loop
		for (Animal animal : animals) {
			zoo.animalsound(animal);
		}
	}
}
