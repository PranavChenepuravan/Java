import java.util.Scanner;
class Faren
{
 void dgtofr()
 {
   System.out.print("Enter temperature in celcius: ");
   Scanner input = new Scanner(System.in);
   float dg = input.nextFloat();
   float fr = (dg * 9 / 5) + 32;
   System.out.println(dg + " clecius is " + fr + " farenheit");
 }
}
class Celc
{
 void frtodg()
 {
   System.out.print("Enter temperature in Farenheit: ");
   Scanner input = new Scanner(System.in);
   float fr = input.nextFloat();
   float dg = (fr - 32) * 5 / 9;
   System.out.println(fr + " farenheit is " + dg + " celcius");
 }
}
class Heat
 {
 public static void main(String args[])
 {
  int op = 0;
  do{
      System.out.println("--------------MENU--------------");
      System.out.println("1.Celcius to Farenheit  2.Farenheit to Celcius 0.Exit  ");
      System.out.print("Enter your choice: ");
      Scanner input = new Scanner(System.in);
      op = input.nextInt();
      switch(op)
       {
         case 1:
                 Faren a = new Faren();
                 a.dgtofr();
                 break;
         case 2:
                 Celc b = new Celc();
                 b.frtodg();
                 break;
         case 0:
                 System.out.println("Exited");
         default:
                 System.out.println("Wrong input");
       }
    }while(op > 0);
 }
}
 