//program which guesses the number under seven tries, uses really basic mathemathics, two ints are defined 'low' and 'high' 
//with whatever keyword is inputed by the user, it adds up the 'low' and 'high', and divides it by two

import java.util.Scanner;

public class guess 
{
public static void main(String[] args) 
  {
Scanner sc = new Scanner(System.in);
int low = 1;
int high = 100;
String stat;
   System.out.println("Think of a number between 1 and 100.");
    while (low <= high)
      {
      int guess = (low + high) / 2;
            System.out.println("Is your number " + guess + "?");
            System.out.println("Enter: correct / higher / lower");
            stat = sc.next();

      if (stat.equalsIgnoreCase("correct")) {
      System.out.println("I guessed your number.");
      break; 
      }
      else if (stat.equalsIgnoreCase("higher")) {
      low = guess + 1;}
      else if (stat.equalsIgnoreCase("lower")) {
      high = guess - 1;
            }}}}
