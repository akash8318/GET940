
public class Assign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int totalrun=0,one=0,zero=0,two=0,three=0,four=0,six=0;
		  for(int i=0;i<30;i++)
		  {
			  double random=Math.random();
			  int ran=(int)(random*6+1);
			  totalrun=totalrun+ran;
			  if(ran==0)
					zero++;
			  else if(ran==1)
					one++;
			  else if(ran==2)
					two++;
			  else if(ran==3)
					three++;
			  else if(ran==4)
					four++;
			  else if(ran==6)
					six++;
		}
		  double strike_rate=(double)totalrun/30*100;
		    System.out.println("Total runs scored"+" "+totalrun);
		    System.out.println("zero"+" "+zero);
		    System.out.println("one"+" "+one);
		    System.out.println("two"+" "+two);
		    System.out.println("three"+" "+three);
		    System.out.println("four"+" "+four);
		    System.out.println("six"+" "+six);
		    System.out.println("Strike rate"+" "+strike_rate);
	}

}
