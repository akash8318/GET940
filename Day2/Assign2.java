abstract class Account{
    long accountNo;
    double accountBalance;
    String accountPassword;
    static String bankName="ICICI";
    
    abstract void withdraw(double amount);
    
}

class SavingsAccount1 extends Account{
    private double minimumBalance;
    
    SavingsAccount1(long accountNo, double accountBalance, String accountPassword,
                    double minimumBalance){
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
        this.accountPassword = accountPassword;
        this.minimumBalance = minimumBalance;
    }
    
    public void withdraw(double amount){
        accountBalance-=amount;
        System.out.println("Amount Withdrawn "+amount);
        System.out.println("Account Balance "+accountBalance
                        +"\n-------------------------------------");
    }   
}

class CurrentAccount1 extends Account{
    private double overdraftLimitAmount;
    
    CurrentAccount1(long accountNo, double accountBalance, String accountPassword,
                    double overdraftLimitAmount){
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
        this.accountPassword = accountPassword;
        this.overdraftLimitAmount = overdraftLimitAmount;
    }
    public void withdraw(double amount){
        accountBalance-=amount;
        overdraftLimitAmount-=amount;
        System.out.println("Amount Withdrawn "+amount);
        System.out.println("Account Balance "+accountBalance);
        System.out.println("OverdraftLimitAmount "+overdraftLimitAmount);
                           
    }
    
}

public class Assign2 {

    public static void main(String[] args) {
        SavingsAccount1 sa = new SavingsAccount1(758966789, 60000.00, "Akash",0.0);
        CurrentAccount1 ca = new CurrentAccount1(1256946789, 45000.00, "Ankit",30000.00);
        sa.withdraw(5078.0);
        ca.withdraw(12450.0);
        
    }
}

