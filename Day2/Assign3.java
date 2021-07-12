interface ATM{
    void withdraw(int accountNumber, double amount);
    void changePassword(int accountNumber, String oldPassword, String newPassword);
    void checkBalance();
}
class SbiATM implements ATM{
    int accountNumber;
    double balance;
    String password;
    
    SbiATM(int accountNumber, double balance, String password){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.password = password;
    }
    
    public void withdraw(int accountNumber, double amount){
        if(this.accountNumber==accountNumber){
            balance-=amount;
            System.out.println("Amount Withdrawn "+amount);
            System.out.println("Account Balance "+balance);
        }
        else{
            System.out.println("Wrong Account Number!");
        }
    }
    public void changePassword(int accountNumber, String oldPassword, String newPassword){
        if(this.accountNumber==accountNumber){
            if(oldPassword == password){
                password = newPassword;
                System.out.println("Password changed successfully!");
            }
            else
                System.out.println("Invalid Password!");
        }
        else{
            System.out.println("Wrong Account Number!");
        }
    }
    public void checkBalance(){
        System.out.println("Account Balance "+balance
                    +"\n-------------------------------------------");
    }
}
class IciciATM implements ATM{
    int accountNumber;
    double balance;
    String password;
    
    IciciATM(int accountNumber, double balance, String password){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.password = password;
    }
    
    public void withdraw(int accountNumber, double amount){
        if(this.accountNumber==accountNumber){
            balance-=amount;
            System.out.println("Amount Withdrawn "+amount);
            System.out.println("Account Balance "+balance);
        }
        else{
            System.out.println("Wrong Account Number!");
        }
    }
    public void changePassword(int accountNumber, String oldPassword, String newPassword){
        if(this.accountNumber==accountNumber){
            if(oldPassword == password){
                password = newPassword;
                System.out.println("Password changed successfully!");
            }
            else
                System.out.println("Invalid Password!");
        }
        else{
            System.out.println("Wrong Account Number!");
        }
    }
    public void checkBalance(){
        System.out.println("Account Balance "+balance
                    +"\n-------------------------------------------");
    }
}

public class Solution {

    public static void main(String[] args) {
        SbiATM s1 = new SbiATM(14598767,35000.0 ,"akash");
        IciciATM i1 = new IciciATM(78262354,25463.0 ,"ankit");
        s1.withdraw(1234789,5000);
        s1.changePassword(1234789,"akash","83185");
        s1.checkBalance();
        i1.withdraw(8756492,15000);
        i1.changePassword(8756492,"ankit","123458");
        i1.checkBalance();
    }
}