import java.util.Scanner;
class Calc
{
 double h;
 double b;
 int l;
 int bd;
 double r;
 double ar;
 Calc(double he,double br)
 {
   h = he;
   b = br; 
   ar = 0.5 * b * h;
   System.out.println("Area is ");
   System.out.println(ar);
   System.out.println("");
 }
 Calc(double rd)
 {
   r = rd;
   ar = 3.14 * r * r;
   System.out.println("Area is ");
   System.out.println(ar);
   System.out.println("");
 }
 Calc(int le,int be)
 {
   l = le;
   bd = be;
   ar = l * bd;
   System.out.println("Area is ");
   System.out.println(ar);
   System.out.println("");
 }
}

class Operate
{
 static int le;
 static Scanner input = new Scanner(System.in);
 public static void main(String args[])
 {
   System.out.println("Enter the bredth and height of triangle: ");
   double b = input.nextDouble();
   double h = input.nextDouble();
   Calc tri = new Calc(b,h);
   System.out.println("Enter the radius of circle: ");
   double r = input.nextDouble();
   Calc cir = new Calc(r);
   System.out.println("Enter the length of a side in square: ");
   le = input.nextInt();
   Calc sqr = new Calc(le,le);
   System.out.println("Enter the length and bredth of rectangle: ");
   le = input.nextInt();
   int br = input.nextInt();
   Calc rect = new Calc(le,br);
 }
}