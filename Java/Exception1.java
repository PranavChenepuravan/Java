import java.util.Scanner;
class Math
 {
   static Scanner input = new Scanner(System.in);
   public static void main(String args[])
    {
      System.out.println("Enter the values of a & b ");
      int a = input.nextInt();
      int b = input.nextInt();
      int d = 2 * a - 2;
      try
        {
          int op = b/d;
          System.out.println(op);
        }
      catch(ArithmeticException x)
        {
          System.out.println("Not defined  " + x);
        }
     }
 }
