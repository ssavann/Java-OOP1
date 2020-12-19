public class BankAccountConst
{
	private String number;
	private double balance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;

	//some values by default
	public BankAccountConst()
	{
		this("54646", 2.50, "Default name", "Default address", "default phone");
		System.out.println("Empty constructor called");
	}

	//build a constructor
	public BankAccountConst(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber)
	{
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public void deposit(double depositAmount)
	{
		this.balance += depositAmount;
		System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
	}

	public void withdrawal(double widthdrawalAmount)
	{
		if (this.balance - widthdrawalAmount < 0)
		{
			System.out.println("Only " + this.balance + " available. withdrawal not processed");
		}
	
		else		
		{
			this.balance -= widthdrawalAmount;
			System.out.println("widthdrawal of " + widthdrawalAmount + " processed. remaining balance = " + this.balance);
		}

	}

	public void setNumber(String number)
	{
		this.number = number;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}

	public void setCustomerName(String customerName)
	{
		this.customerName =  customerName;
	}

	public void setCustomerEmailAddress(String customerEmailAddress)
	{
		this.customerEmailAddress = customerEmailAddress;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber)
	{
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public String getNumber()
	{
		return number;
	}

	public double getBalance()
	{
		return balance;
	}
	public String getCustomerName()
	{
		return customerName;
	}

	public String getCustomerEmailAddress()
	{
		return customerEmailAddress;
	}
	public String getCustomerPhoneNumber()
	{
		return customerPhoneNumber;
	}
}