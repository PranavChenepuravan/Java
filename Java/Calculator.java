import java.util.Scanner;
class Calc
{
 int a;
 int b;
 int val;
 void add(int f,int s)
 {
   a = f;
   b = s;
   val = a + b;
   System.out.println(a + " + " + b + " = " + val) ;
 }
 void sub(int f,int s)
 {
   a = f;
   b = s;
   val = a - b;
   System.out.println(a + " - " + b + " = " + val) ;
 }
 void mul(int f,int s)
 {
   a = f;
   b = s;
   val = a * b;
   System.out.println(a + " * " + b + " = " + val) ;
 }
 void div(int f,int s)
 {
   a = f;
   b = s;
   val = a / b;
   System.out.println(a + " / " + b + " = " + val) ;
 }
}
class Choice
{
  static int op;
  static Scanner input = new Scanner(System.in);
   public static void main(String args[])
   {
    do{
     System.out.println("-----------------------------------------MENU-----------------------------------------");
     System.out.println("Choose your operation 1.Addition 2.Subtraction 3.Multiplcation 4.Division 0.Exit");
     op = input.nextInt();
     if(op == 1)
      {
        System.out.println("Enter the first numer");
        int fn = input.nextInt();
        System.out.println("Enter the second numer");
        int sn = input.nextInt(); 
        Calc a = new Calc();
        a.add(fn,sn);
      } 
     else if(op == 2)
      {
        System.out.println("Enter the first numer");
        int fn = input.nextInt();
        System.out.println("Enter the second numer");
        int sn = input.nextInt(); 
        Calc s = new Calc();
        s.sub(fn,sn);
      }
     else if(op == 3)
      {
        System.out.println("Enter the first numer");
        int fn = input.nextInt();
        System.out.println("Enter the second numer");
        int sn = input.nextInt(); 
        Calc m = new Calc();
        m.mul(fn,sn);
      }
     else if(op == 4)
      {
        System.out.println("Enter the first numer");
        int fn = input.nextInt();
        System.out.println("Enter the second numer");
        int sn = input.nextInt(); 
        Calc d = new Calc();
        d.div(fn,sn);
      }
     else if(op == 0)
      {
        System.out.println("Exit");   
      }
     else
      {
        System.out.println("Wrong choice");   
      }
 }while(op > 0);
   }
}