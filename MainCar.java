public class MainCar
{
	public static void main(String[] args)
	{
		Car porshe = new Car();
		Car toyota = new Car();

		porshe.setModel("Carrera");
		System.out.println("Model is " + porshe.getModel());

	}
}