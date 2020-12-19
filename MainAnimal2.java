public class MainAnimal2
{

	public static void main(String[] args)
	{
		
		//from the class "Animal" or Animal.java 
		Animal2 myAnimal = new Animal2("Animal", 1, 1, 5, 5);

		//from the class "Dog" or dog.java
		Dog2 myDog = new Dog2("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
		myDog.eat();
        myDog.walk();
        myDog.run();


        Fish2 myFish = new Fish2("Salmon", 2, 3, 2, 3, 2 );
        myFish.swim(4);

	}
} 