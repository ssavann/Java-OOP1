public class MainVipCustomer
{

	public static void main(String[] args)
	{


		VipCustomer person1 = new VipCustomer();
		System.out.println(person1.getName());

		VipCustomer person2 = new VipCustomer("Rick", 25000.0);
		System.out.println(person2.getName());

		VipCustomer person3 = new VipCustomer("Morty", 100.0, "morty@email.com");
		System.out.println(person3.getName());
		System.out.println(person3.getEmailAddress());

		
	}
}