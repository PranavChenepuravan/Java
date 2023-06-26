import java.util.Scanner;
class Main
{
 public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter two numbers ");
    int a = input.nextInt();
    int b = input.nextInt();
    int arr[] = new int[10];
    try
     {
       int c = a/(a-b);
       System.out.println(a + "/" + a + "-" + b + " = " + c);
     }
    catch(ArithmeticException e)
     {
       System.out.println(e);
     }
  }
}
