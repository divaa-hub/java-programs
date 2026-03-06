import java.util.*;
class swapout
{
public static void main(String ar[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter 2 integer");
int a=obj.nextInt();
int b=obj.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println(a);
System.out.println(b);
}}