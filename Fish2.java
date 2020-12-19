public class Fish2 extends Animal2
{
	private int gills;
	private int eyes;
	private int fins;

	public Fish2(String name, int size, int weight, int gills, int eyes, int fins)
	{
		super(name, 1, 1, size, weight);
		this.gills = gills;
		this.eyes = eyes;
		this.fins = fins;
	} 


	private void rest()
	{

	}

	public void moveMuscles()
	{

	}
	
	public void moveBackFin()
	{

	}
	
	public void swim(int speed)
	{
		moveMuscles();
		moveBackFin();
		super.move(speed);
	}
}