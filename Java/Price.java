import java.util.Scanner;
class Product
{
String pcode;
String pname;
int price;
 void prdt()
 {
   System.out.println("Enter the product code");
   Scanner input = new Scanner(System.in);
   pcode = input.next();
   System.out.println("Enter the product name");
   pname = input.next();
   System.out.println("Enter the product Price");
   price = input.nextInt();
 }
}
class Check
{
 public static void main(String args[])
 {
   Product a = new Product();
   a.prdt();
   Product b = new Product();
   b.prdt();
   Product c = new Product();
   c.prdt();
   if(a.price > b.price)
    {
      if(b.price > c.price)
       {
          System.out.println(a.pname + " have the highest price");
       }  
     }
   else if(b.price > c.price)
     {
       System.out.println(b.pname + " have the highest price");
     }
   else
     {
       System.out.println(c.pname + " have the highest price");
     }
 }
}