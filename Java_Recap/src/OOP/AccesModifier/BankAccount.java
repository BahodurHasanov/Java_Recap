package OOP.AccesModifier;

import java.sql.SQLOutput;

public class BankAccount {

    /*
	 WarmUp: create a custom class for bank account
	The attributes/data thatthe class can have are:
			AccountHolder, AccountNumber, AvailableBalance
	Actions the class can do are:
			deposit , withdraw, checking balance
	requirements:
			1. apply encapsulation  (done)
			2. user should be able to deposit, withdraw and check the balance
				2.1 if the withdrawing amount is greater than available balance,
						35$ penalty fee will be charger from the account
				2.2 if the available balance is less or equal to 0
				 	account holder won't be able to withdraw money
	 */





      private String AccountHolder;

      private long AccountNumber;

      private double AvailableBalance;



      //getter(read only)
    public String getAccountHolder() {
        return AccountHolder;
    }

    public long getAccountNumber() {
        return AccountNumber;
    }

    public double getAvailableBalance() {
        return AvailableBalance;
    }

    //setter= insistence veritable methods we can use only this.

    public void setAccountHolder(String AccountHolder) {
        this.AccountHolder = AccountHolder;
    }


    public void setAccountNumber(long AccountNumber){
        this.AccountNumber=AccountNumber;
    }



//Deposed
    public  void Deposed(double amount){
        AvailableBalance+=amount;
    }

    //withdraw

    public  void withdraw(long amount){
        if (AvailableBalance<=0){
            System.out.println("Available Balance Can be Withdraw");
            return;
        }
        if (amount>AvailableBalance){
            AvailableBalance-=35;
        }
        AvailableBalance-=amount;
    }
    //checking balance

    public void ShowBalance() {
        System.out.println("Available balance: "+AvailableBalance);
    }


    //getInfo


    public void getInfo(){
        System.out.println("Name"+AccountHolder);
        System.out.println(" ");
        System.out.println("Balance"+AvailableBalance);
        System.out.println(" ");
        System.out.println("Number"+AccountNumber);
    }






}
