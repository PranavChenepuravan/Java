import java.util.Scanner;
class Calc
{
 int h;
 int b;
 double r;
 double ar;
 Calc(int he,int br)
 {
   h = he;
   b = br; 
   ar = 0.5 * b * h;
   System.out.println("Area is ");
   System.out.println(ar);
   System.out.println("\n");
 }
 Calc(double rd)
 {
   r = rd;
   ar = 3.14 * r * r;
   System.out.println("Area is ");
   System.out.println(ar);
 }
}

class Operate
{
 static Scanner input = new Scanner(System.in);
 public static void main(String args[])
 {
   System.out.println("Enter the bredth and height of triangle: ");
   int b = input.nextInt();
   int h = input.nextInt();
   Calc tri = new Calc(b,h);
   System.out.println("Enter the radius of circle: ");
   double r = input.nextDouble();
   Calc cir = new Calc(r);
 }
}