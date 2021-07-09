import java.util.*;
public class Assign1 
 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the number of units");
	      System.out.println();
	      int n=sc.nextInt();
	      double billpay=0;
	      
      	if(n<100)
	 {
	      billpay=n*1.20;
	  }
	else if(n<300)
	 {
	   billpay=100*1.20+(n-100)*2;
	 }
	else if(n>300)
	{
	    billpay=100*1.20+200*2+(n-300)*3;
	}
      	System.out.println("Amount"+billpay);
	}
 }



