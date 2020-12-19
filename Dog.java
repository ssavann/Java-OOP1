public class Dog extends Animal		//inheritance
{

    //Dogs can have these caracteristics in addition
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    //Dogs have those basic caracteristics as well
	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) 
    {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    
    private void chew()
    {
        System.out.println("Dog.chew() called from Dog.java");
    }


    //we can override some methods: Will replace "eat()" method from Animal class (Animal.java)
    @Override
    public void eat()
    {
        System.out.println("Dog.eat() called from Dog.java");
        chew();         //will call the "private void chew()" class
        super.eat();
    }
}