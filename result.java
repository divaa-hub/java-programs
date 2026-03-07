public class result
{ 
public static void main(String args[]) 
{

	int n=Integer.parseInt(args[0]); 
	if(n>=60 && n<=80)
 	   System.out.println("excellent performance");
	else if (n>=50 && n<=60)
	   System.out.println("Good performance");
	else if (n>=40 && n<=50)
	   System.out.println("average performance");
	else
           System.out.println("Try to improve"); 
}}
