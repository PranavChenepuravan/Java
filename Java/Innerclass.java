class base
{
 int i = 10;
 int j = 20;
 void display()
  {
    System.out.println("Outer class");
    System.out.println(i);
  }
 class child
 {
   int c = 30;
   void show()
    {
      System.out.println("Inner class");
      System.out.println(c);
    }
  }
}

class Main
{
  public static void main(String args[])
   {
     base b1  = new base();
     b1.display();
     base.child c1 = b1.new child();
     c1.show();
   }
}