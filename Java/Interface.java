interface Area
{
 void calculate();
 void display();
}
class Rect implements Area
{
 int ar;
 public void calculate()
 {
  int l = 10;
  int b = 15;
  ar = l * b;
 }
 public void display()
 {
   System.out.print("Area = ");
   System.out.println(ar);
 }
}

class Circ implements Area
{
 double ar;
 public void calculate()
 {
  double h = 10.5;
  double b = 15.7;
   ar = 0.5* h * b;
 }
 public void display()
 {
   System.out.print("Area = ");
   System.out.println(ar);
 }
}

class Sqr implements Area
{
 int ar;
 public void calculate()
 {
   int l = 11;
 }
 public void display()
 {
   System.out.print("Area = ");
   System.out.println(ar);
 }
}

class Call
{
 public static void main(String args[])
  {
    Rect a = new Rect();
    a.calculate();
    a.display();

    Circ b = new Circ();
    b.calculate();
    b.display();

    Sqr c = new Sqr();
    c.calculate();
    c.display();
  }
}
