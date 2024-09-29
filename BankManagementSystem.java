import java.util.Scanner;

//AL SHARIAR HOSSIAN//

class BankAccount {
    String depositorName;
    int typeofAccount;
    int AccountNumber;
    int balance;
    public BankAccount() {
        
    }
    public BankAccount(String  depositorName, int typeofAccount, int AccountNumber, int balance) {
        this.depositorName = depositorName;
        this.balance = balance;
        this.typeofAccount = typeofAccount;
        this.AccountNumber = AccountNumber;
    }
    public int depositAmount()
    {
        return  balance;
    }
    public void  withdrawAmount(int amount){
        if(balance==0){
            System.out.println("Insufficient balance");
        }
        else if (balance - amount<0){
            System.out.println("Insufficient Balance");
        }
        balance -=amount;
    }
    public void displayNameAndBalance()
    {
        System.out.println("Name: " + depositorName);
        System.out.println("Balance: " + balance);
    }
}

class AgraniBank extends BankAccount{
    public AgraniBank(String  name, int i, int j, int k) {
        super( name,i,j,k);
    }
    public void displayProfile()
    {
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Name: " + depositorName);
        System.out.println("Balance: " + balance);
        if(typeofAccount==1){
            System.out.println("Account Type: Savings");
            System.out.println("Interest: 1%");
        }
        else{
            System.out.println("Account Type: FixedDeposit");
            System.out.println("Interest: 3%");
        }
    }
}
class JanataBank extends BankAccount{
    public JanataBank(String  name, int i, int j, int k) {
        super( name,i,j,k);
    }
    public void displayProfile()
    {
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Name: " + depositorName);
        System.out.println("Balance: " + balance);
        if(typeofAccount==1){
            System.out.println("Account Type: Savings");
            System.out.println("Interest: 1%");
        }
        else{
            System.out.println("Account Type: FixedDeposit");
            System.out.println("Interest: 2.5%");
        }
    }
}
class SonaliBank extends BankAccount{

    public SonaliBank(String  name, int i, int j, int k) {
        super( name,i,j,k);
    }
    public void displayProfile()
    {
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Name: " + depositorName);
        System.out.println("Balance: " + balance);
        if(typeofAccount==1){
            System.out.println("Account Type: Savings");
            System.out.println("Interest: 1%");
        }
        else{
            System.out.println("Account Type: FixedDeposit");
            System.out.println("Interest: 2%");
        }
    }
}

public class BankManagementSystem {

    public static void main(String[] args) {
        System.out.println("Hello Murobbi");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Depositor Name: ");
        String depositorName =  scanner.nextLine();
        System.out.println("Enter Type of Account: ");
        int typeofAccount =  scanner.nextInt();
        System.out.println("Enter Account Number: ");
        int accountNumber = scanner.nextInt();
        System.out.println("Enter Balance: ");
        int balance =  scanner.nextInt();

        AgraniBank account1 = new AgraniBank(depositorName,typeofAccount,accountNumber,balance);
        // account1.depositorName = depositorName;
        // account1.typeofAccount = typeofAccount;
        // account1.AccountNumber = accountNumber;
        // account1.balance = balance;
        account1.displayProfile();
    }
}
