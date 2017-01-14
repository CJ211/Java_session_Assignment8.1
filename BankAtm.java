//Defining Our own exception class by extending ArithmeticException class
 
class InvalidWithdrawlMoneyException extends ArithmeticException
{
    //Overriding toString() method of ArithmeticException as per our needs
 
    
    public String toString()
    {
        return "You don't have that much of money in your account";
    }
}
 
//Using above customized ArithmeticException
public class BankAtm
{
    public static void main(String[] args)
    {
        double balance;            //Initializing the balance
 
        Scanner sc = new Scanner(System.in);     //Scanner variable to take input from user

        System.out.println("Enter the balance");
	balance=sc.nextDouble();

 
        System.out.println("Enter Withdrawl Money");
 
        double withdrawlMoney = sc.nextDouble();      //taking input from the user

	balance=balance-withdrawlMoney;
        try
        {
            //checking withdrawl money with the balance
            //if withdrawl money is more than the balance,
            //then it throws Exception
 
            if(balance<10000 && withdrawlMoney>balance)
            {
                throw new InvalidWithdrawlMoneyException();
            }
            else
            {
                System.out.println("Transaction Successful");
            }
        }
        catch(InvalidWithdrawlMoneyException ex)
        {
            //InvalidWithdrawlMoneyException will be caught here
 
            System.out.println(ex);
        }
    }
}
