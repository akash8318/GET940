
class BankAccount
	{	
		static String bankName;
		long accountNo;
		String accountPassword;
		double accountBalance;
		
		BankAccount(){
		
		}
		BankAccount(long accountNo,  double accountBalance,String accountPassword) {
			this.accountNo = accountNo;
			this.accountPassword = accountPassword;
			this.accountBalance = accountBalance;
		}

		void setBankAccount(int acno, String pass, double bal) {
			accountNo = acno;
			accountPassword = pass;
			accountBalance = bal;
		}
		
		void displayAccount() {
			System.out.println("Acc number = "+accountNo);
			System.out.println("Bank name = " +bankName);
			System.out.println("Acc balance = "+accountBalance);
		}
		
		void setBankName(String bname) {
			this.bankName = bname;
		}
		
		
	}
class SavingsAccount extends BankAccount{
    private double minimumBalance;
    
    SavingsAccount(long accountNo, double accountBalance, String accountPassword,
                    double minimumBalance){
        super(accountNo, accountBalance, accountPassword);
        this.minimumBalance = minimumBalance;
    }
    
    void displayAccount(){
        super.displayAccount();
        System.out.println("Minimum Balance:      "+minimumBalance);
        System.out.println("---------------------------------");
    }
}

class CurrentAccount extends BankAccount{
    private double overdraftLimitAmount;
    
    CurrentAccount(long accountNo, double accountBalance, String accountPassword,
                    double overdraftLimitAmount){
       
        this.overdraftLimitAmount = overdraftLimitAmount;
    }
    void displayAccount(){
        super.displayAccount();
        System.out.println("Overdraft Limit Amount:     "+overdraftLimitAmount);
        System.out.println("---------------------------------");
    }
}


public class Assign1 {

    public static void main(String[] args) {
    	System.out.println("Welcome to banking \n=====================");
		BankAccount b = new BankAccount(789456789, 50000d,"Akash");
		b.setBankName("HDFC Bank");
		b.displayAccount();	
		
        SavingsAccount sa = new SavingsAccount(789456789, 60000.00, "Akash ",0.0);
        CurrentAccount ca = new CurrentAccount(123456789, 45000.00, "Ankit",100000.00);
        sa.displayAccount();
        ca.displayAccount();
        
    }
}