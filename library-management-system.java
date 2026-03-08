import java.util.Scanner;
public class library
{
  public static void main(String  args[])
    {  
      Scanner sobj =new Scanner(System.in);
      System.out.println("Enter Customer Name ");
      String name=sobj.nextLine();  
      
      Scanner sobj1 =new Scanner(System.in); 
      System.out.println("Enter Library id ");
      int num =sobj1.nextInt();
      
      System.out.println("Search Book");
      String iname=sobj.nextLine();  
      
      String book1= "The Diary of a Young Girl";
      String book2= "To Kill a Mockingbird";
      String book3= "Seven Habits of Highly Effective Teens";
      String book4= "The Alchemist";
      String book5= "Howl's Moving Castle";
      String book6= "The Kite Runner";
      String book7= "I Know Why the Caged Bird Sings";
      {
      if (book1.equals(iname)){
         System.out.println("The Diary of a Young Girl written by Anne Frank");
         System.out.println("Available on the Third Shelf");}
       else if (iname.equals(book2)){
         System.out.println("To Kill a Mockingbird written by Harper Lee");
         System.out.println("Available on the Fourth Shelf");}
       else if (iname.equals(book3)){
         System.out.println("Seven Habits of Highly Effective Teens written by Sean Covey");
         System.out.println("Available on the Sixth Shelf");}
       else if (iname.equals(book4)){
         System.out.println("The Alchemist written by Paulo Coelho");
         System.out.println("Available on the Third Shelf");}   
       else if (iname.equals(book5)){
         System.out.println("Howl's Moving Castle written by Diana Wynne Jones");
         System.out.println("Available on the Tenth Shelf");}   
       else if (iname.equals(book6)){ 
         System.out.println("The Kite Runner written by Khaled Hosseini");
         System.out.println("Available on the First Shelf");}  
       else if (iname.equals(book7)){ 
         System.out.println("I Know Why the Caged Bird Sings written by Maya Angelou");
         System.out.println("Available on the Eighth Shelf");}
         
        else  {
        System.out.println ("Sorry the book '" +iname+ "' is not available");
      }}}}
          
      

