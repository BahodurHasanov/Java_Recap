package OOP.AccesModifier;

public class ZeroBank {


    public static void main(String[] args) {

        BankAccount Bahodur= new BankAccount();

        Bahodur.setAccountHolder("Bahodur Hasanov");
        Bahodur.setAccountNumber(125323965);


        System.out.println("Account Name "+Bahodur.getAccountHolder());
        System.out.println(" ");
        System.out.println("Account Number "+Bahodur.getAccountNumber());
        System.out.println(" ");
        System.out.println(" Available Balance "+Bahodur.getAvailableBalance());


        Bahodur.Deposed(25550);
        Bahodur.ShowBalance();
        System.out.println(" ");
        Bahodur.withdraw(5000);
        Bahodur.ShowBalance();
        System.out.println(" ");
        Bahodur.Deposed(12000);
        Bahodur.ShowBalance();


        System.out.println("////////////////////////////////////");



        BankAccount Hasan= new BankAccount();


        Hasan.setAccountHolder("Hasan");
        Hasan.setAccountNumber(201030);


        System.out.println("Account Holder "+Bahodur.getAccountHolder());
        System.out.println(" ");

        System.out.println("Account Number "+Bahodur.getAccountNumber());
        System.out.println(" ");

        System.out.println("Account Balance "+Bahodur.getAvailableBalance());
        System.out.println(" ");

        Bahodur.Deposed(1200);
        Bahodur.ShowBalance();
        System.out.println(" ");
        Bahodur.withdraw(1360);
        Bahodur.ShowBalance();
        System.out.println(" ");
        Bahodur.Deposed(12000);
        Bahodur.ShowBalance();














    }


}
