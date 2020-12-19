public class MainBankAccountConst
{
	public static void main(String[] args)
	{
		BankAccountConst totoAccount = new BankAccountConst("46411", 0.00, "Toto Martel", "myemail@gmail.com", "(555) 423-8547");

		totoAccount.withdrawal(100.0);

		totoAccount.deposit(50.0);
		totoAccount.withdrawal(100.0);

		totoAccount.deposit(51.0);
		totoAccount.withdrawal(100.0);

		System.out.println(totoAccount.getNumber());
		System.out.println(totoAccount.getBalance());
		System.out.println(totoAccount.getCustomerName());
		System.out.println(totoAccount.getCustomerEmailAddress());
		System.out.println(totoAccount.getCustomerPhoneNumber());

		
	}
}