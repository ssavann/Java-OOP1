public class MainBankAccount
{
	public static void main(String[] args)
	{
		BankAccount totoAccount = new BankAccount();

		totoAccount.withdrawal(100.0);

		totoAccount.deposit(50.0);
		totoAccount.withdrawal(100.0);

		totoAccount.deposit(51.0);
		totoAccount.withdrawal(100.0);

		
	}
}