public class MainAnimal
{

	public static void main(String[] args)
	{
		
		//from the class "Animal" or Animal.java 
		Animal myAnimal = new Animal("Animal", 1, 1, 5, 5);

		//from the class "Dog" or dog.java
		Dog myDog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
		myDog.eat();

	}
} 