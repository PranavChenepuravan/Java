import java.util.Scanner;
class Area
{
 int len;
 int bred;
 double bre;
 double hei;
 double rad;
 void calc(int l, int b)
 {
   len = l;
   bred = b;
   int are = len * bred;
   System.out.println("Area = " + are); 
 }
 void calc(int l)
 {
   len = l;
   int ar = len * len;
   System.out.println("Area = " + ar); 
 }
 void calc(double r)
 {
   rad = r;
   double ar = 3.14 * r * r;
   System.out.println("Area = " + ar); 
 }
 void calc(double h, double b)
 {
   hei = h;
   bre = b;
   double are = 0.5 * bre * hei;
   System.out.println("Area = " + are); 
 }
}
class Take
{
 static Scanner input = new Scanner(System.in);
 public static void main(String args[])
 {
   System.out.println("Enter the length of rectangle");
   int lrect = input.nextInt();
   System.out.println("Enter the bredth of rectangle");
   int brrect = input.nextInt();
   Area r = new Area();
   r.calc(lrect,brrect);
   
   System.out.println("Enter the length of square");
   int lsqr = input.nextInt();
   Area s = new Area();
   s.calc(lsqr);

   System.out.println("Enter the radius of circle");
   double rcir = input.nextDouble();
   Area c = new Area();
   c.calc(rcir);

   System.out.println("Enter the height of triangle");
   Double hgtri = input.nextDouble();
   System.out.println("Enter the bredth of triangle");
   Double brtri = input.nextDouble();
   Area t = new Area();
   t.calc(hgtri,brtri);
 }
}   
   
   
   