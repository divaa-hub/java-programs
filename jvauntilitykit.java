// program to input first integers, calculating its square and cube, the inputing second number adding both the numbers
// then entering name, age checkng major or minor, entering two numbers again comparing greater and smaller
//inputing a character, to get its ascii value

import java.util.Scanner;
class jvautilitykit
{
public static void main(String args[])
{
Scanner sobj =new Scanner(System.in);
System.out.println("Enter an integer");
int num =sobj.nextInt();
System.out.println("Number is "+num);
int sqn=num*num;
System.out.println("Square of Number is "+sqn);
int qqn=num*num*num;
System.out.println("Cube of Number is "+qqn);
System.out.println("Enter second integer");
int num2 =sobj.nextInt();
int s=num+num2;
System.out.println("Sum of two  integers" +s);
System.out.println("Enter Name");
Scanner sobj2 =new Scanner(System.in);
String nam =sobj2.nextLine();
System.out.println("Enter age");
int ag =sobj.nextInt();

if (ag < 18){
System.out.println("Name= " +nam);
System.out.println("Age= " +ag + ",minor");}
else{
System.out.println("Name= " +nam);
System.out.println("Age= " +ag +",major");}
System.out.println("Enter 1st no.");
int a =sobj.nextInt();
System.out.println("Enter 2nd no.");
int b =sobj.nextInt();
if (a>b) 
{
System.out.println("greater no. is " +a);
System.out.println("smaller no. is " +b);
}
else
{
System.out.println("greater no. is " +b);
System.out.println("smaller no. is " +a);
}
System.out.println("Enter a character");
Scanner sobj3 =new Scanner(System.in);

char ch =sobj3.next().charAt(1);
int chint=ch;
System.out.println("Character is " + ch +" and ASCII of character is " + chint);

}
}
