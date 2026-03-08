//an atm simulator program, which can be accessed only with the correct pin, displays balance, withdraw money tells the leftover amount
//deposits money tells the updated amount, if the wrong pin is entered it denies the access 

import java.util.Scanner;
public class atm
{
public static void main(String  args[])
{  
      Scanner obj =new Scanner(System.in);
    System.out.println("Enter your pincode");
      int pin=obj.nextInt();
      int pinn= 1234; //correct pin
      int n=80000;
    {
    if (pin==pinn){
        
            System.out.println("Accessed Allowed");
        System.out.println("What Will You Like To Do?");
        System.out.println("Press 1 Check You Balance");
        System.out.println("Press 2 Withdraw Money");
        System.out.println("Press 3 Deposite Money");
        int op=obj.nextInt();
          switch(op)
    
         {case 1:
        System.out.println("Current Balance:"+n);
         break;
         case 2:
        System.out.println("Enter amount to be Withdrawn");
        int w=obj.nextInt();
        int c= n-w;
        System.out.println("Remaining balance:"+c);
         break;
         case 3:
        System.out.println("Enter deposite amount");
        int d=obj.nextInt();
        int ca= n+d;
        System.out.println("Updated balance:"+ca);
          break;}
         
        } else {
     System.out.println("Accessed Denied" );
    
    }}}
}
