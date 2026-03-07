import java.util.*;
class bill
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
        System.out.println("consumer name:"+cnm);
        System.out.println("consumer no.:"+cno);
        System.out.println("units consume:"+units);
        double amt=0.0;
  if(units<=100)
  {
    amt= units*2.0;
    System.out.println(amt);
}
else if (units>100&&units<=300)
{
    amt=100*2.0+(units-100)*3.0;
    System.out.println(amt);
    {
         if (units>300&&units<=500)
        amt=100*2.0+200*3.0+(units-300)*4.0;
        System.out.println(amt);
         if( units >500&&units<=100)
        
         amt=100*2.0+200*3.0+(units-500)*4.0;
          
            System.out.println(amt*5.0);
        }}
        }
    }

        
