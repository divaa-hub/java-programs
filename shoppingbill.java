//a program to input cutomer's name, number, purchased item's name and price, printing all with discount percentage and price to pay after discount

import java.util.Scanner;
class shoppingbill
{
  public static void main(String args[])
{
	Scanner sobj =new Scanner(System.in);            /* created new sobj for string  datatype */
System.out.println("Enter Customer Name ");
String name=sobj.nextLine();                         /* it stores what you entered in name variable */
Scanner sobj1 =new Scanner(System.in);               /* created new sobj1 for int datatype */
System.out.println("Enter number");
int num =sobj1.nextInt();                            /* it stores what you entered in num variable */

System.out.println("Enter Item Name ");
String iname=sobj.nextLine();                        /* used already created  sobj for string  datatype */

Scanner sobj2 =new Scanner(System.in);               /* created new sobj2 for float  datatype */
System.out.println("Enter Item Marked Price");
float mp =sobj2.nextFloat();

{
if ((mp>0)&&(mp<=2000)){
        float sp=(mp-(mp*10/100));        /* sp selling price = marked price - discount; here discount = marked price * % /100   */
        System.out.println("CUSTOMER NAME :" +name);
        System.out.println("CUSTOMER MOB No.: " +num);
        System.out.println("PURCHASED ITEM NAME=" +iname);
        System.out.println("ITEM MARKED PRICE= "+mp);
        System.out.println("VALID DISCOUNT 10% ");
        System.out.println("ACTUAL AMOUNT TO PAY IN INR =" +sp);

}
else if((2000<mp)&&(mp<=4000)){
        float sp=(mp-(mp*12/100));
        System.out.println("CUSTOMER NAME :" +name);
        System.out.println("CUSTOMER MOB No.: " +num);
        System.out.println("PURCHASED ITEM NAME=" +iname);
        System.out.println("ITEM MARKED PRICE= "+mp);
        System.out.println("VALID DISCOUNT 12% ");
        System.out.println("ACTUAL AMOUNT TO PAY IN INR =" +sp);
  }
else if((4000<mp)&&(mp<=6000)){
        float sp=(mp-(mp*15/100));
        System.out.println("CUSTOMER NAME :" +name);
        System.out.println("CUSTOMER MOB No.: " +num);
        System.out.println("PURCHASED ITEM NAME=" +iname);
        System.out.println("ITEM MARKED PRICE= "+mp);
        System.out.println("VALID DISCOUNT 15% ");
        System.out.println("ACTUAL AMOUNT TO PAY IN INR =" +sp);
  }
else if((6000<mp)&&(mp<=10000)){
        float sp=(mp-(mp*20/100));
        System.out.println("CUSTOMER NAME :" +name);
        System.out.println("CUSTOMER MOB No.: " +num);
        System.out.println("PURCHASED ITEM NAME=" +iname);
        System.out.println("ITEM MARKED PRICE= "+mp);
        System.out.println("VALID DISCOUNT 20% ");
        System.out.println("ACTUAL AMOUNT TO PAY IN INR =" +sp);
}
else if((10000<mp)&&(mp<=25000)){
        float sp=(mp-(mp*25/100));
        System.out.println("CUSTOMER NAME :" +name);
        System.out.println("CUSTOMER MOB No.: " +num);
        System.out.println("PURCHASED ITEM NAME=" +iname);
        System.out.println("ITEM MARKED PRICE= "+mp);
        System.out.println("VALID DISCOUNT 25% ");
        System.out.println("ACTUAL AMOUNT TO PAY IN INR =" +sp);
}
else if(mp>25000){
        float sp=(mp-(mp*30/100));
        System.out.println("CUSTOMER NAME :" +name);
        System.out.println("CUSTOMER MOB No.: " +num);
        System.out.println("PURCHASED ITEM NAME=" +iname);
        System.out.println("ITEM MARKED PRICE= "+mp);
        System.out.println("VALID DISCOUNT 30% ");
        System.out.println("ACTUAL AMOUNT TO PAY IN INR =" +sp);
}}
}
}
