import java.util.Scanner;
class Ageex extends Exception
{
 Ageex(String st)
  {
    super(st);
  }
}

class Validate 
{
 Validate(int ag)throws Ageex
  {
   if (ag < 18)
    {
      throw new Ageex("Invalid age to vote");
    }
   else
    {
      System.out.println("Vlaid age to vote");
    }
  }
}

class Call
{
 public static void main(String args[])
  {
    System.out.print("Enter your age : ");
    Scanner input = new Scanner(System.in);
    try
     {
       int age = input.nextInt();
       Validate a = new Validate(age);
     }
    catch(Ageex e)
     {
       System.out.println(e);
     }
  }
}