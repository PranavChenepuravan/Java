import java.util.Scanner;
class Intruder extends Exception
{
 Intruder(String str)
  {
    super(str);
  }
}

class Validate
{
 void valx(String user,String pass)throws Intruder
  {
    String us = user;
    String ps = pass;
    String user1 = "Mike";
    String pass1 = "a123";
    if(us.equals(user1) && ps.equals(pass1))
     {
       System.out.println("Loged in");
     }
    else
     {
       throw new Intruder("Invalid user name or password ");
     }
  }
}

class Call
{
 public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    try
     {
       System.out.print("User name : ");
       String user = input.next();
       System.out.print("Password : ");
       String password = input.next();
       Validate a1 = new Validate(); 
       a1.valx(user,password);   
     }
    catch(Intruder x)
     {
       System.out.println(x);
     }
  }
}
