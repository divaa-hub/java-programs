//program to input consumer name, number, and phone number, and units consumed and calculating the amount to be paid by the number of units consumed

import java.util.*;
class electricitybill
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter consumer name");
        String cnm=obj.nextLine();
        System.out.println("Enter consumer number");
        int cno=obj.nextInt();
        System.out.println("Enter units number");
        int units=obj.nextInt();
        System.out.println("Consumer name:"+cnm);
        System.out.println("Consumer no.:"+cno);
        System.out.println("Units consume:"+units);
        double amt=0.0;
 if(units<=100)
  {
     amt= units*2.0;
     System.out.println("Amount to be paid by the consumer:" +amt);}
else if (units>100&&units<=300)
  {
     amt=100*2.0+(units-100)*3.0;
     System.out.println("Amount to be paid by the consumer:" +amt);}
  
      
 if (units>300&&units<=500)
{
        amt=100*2.0+200*3.0+(units-300)*4.0;
        System.out.println("Amount to be paid by the consumer:" +amt);}
 {       
if ( units>500)
  {
        amt=100*2+200*3+(units-500)*5.0;
        System.out.println("Amount to be paid by the consumer:" +amt);}
  
    }
      }}
    
