import java.util.*;
public class Assign2
 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
	    int run=0,one=0,zero=0,two=0,three=0,four=0,six=0;
	    for(int i=0;i<5;i++)
	    {
	    	int arr[]=new int[7];
	    	arr=for_inning(0,0,0,0,0,0,0);
	    	run=run+arr[0];
	    	one=one+arr[2];
	    	zero=zero+arr[1];
	    	two=two+arr[3];
	    	three=three+arr[4];
	    	four=four+arr[5];
	    	six=six+arr[6];
	    }
	    double average=(double)run/5;
	    double strike_rate=(double)run/150*100;
	    System.out.println("Average"+average);
	    System.out.println("Totalruns"+run);
	    System.out.println("total runs in 5 innings"+run);
	    System.out.println("zero"+zero);
	    System.out.println("one"+one);
	    System.out.println("two"+two);
	    System.out.println("three"+three);
	    System.out.println("four"+four);
	    System.out.println("six"+six);
	    System.out.println("Strike rate"+strike_rate);
	}
	public static int[] for_inning(int run,int zero,int one,int two,int three,int four,int  six)
	{
		for(int i=0;i<30;i++)
		{
		double random=Math.random();
		int ran=(int)(random*6+1);
		run=run+ran;
		if(ran==0)
			zero++;
		if(ran==1)
			one++;
		if(ran==2)
			two++;
		if(ran==3)
			three++;
		if(ran==4)
			four++;
		if(ran==6)
			six++;
	}
	int arr[]= new int[7] ;
	arr[0]=run;
	arr[1]=zero;
	arr[2]=one;
	arr[3]=two;
	arr[4]=three;
	arr[5]=four;
	arr[6]=six;
	
	return arr;
 }
}
 