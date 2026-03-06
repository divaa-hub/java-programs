import java.util.*;
class telephone
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter customer no");
int cm=obj.nextInt();
System.out.println("enter customer mobile no");
int mn=obj.nextInt();
System.out.println("enter customer name");
String cnm=obj.nextLine();
System.out.println("enter the no. of call made by "+cnm );
int calls=obj.nextInt();
	if (calls<=100)
System.out.println(" charges of ₹0");

	if  (calls>100&& calls<=200);
System.out.println("charges of ₹1 per call");
System.out.println("charges to be paid =100");

	if (calls>200&& calls<=300);
System.out.println("charges of 3 per call");
System.out.println("charges to be paid = 600");

	if (calls > 300 && calls >400);
System.out.println("charges of ₹4 per call");
System.out.println("charges to be paid= 1600");
}}

