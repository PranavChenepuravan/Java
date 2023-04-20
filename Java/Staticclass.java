class Oper
{
 static int b = 11;
 static void show()
  {
    int a = 21;
    System.out.println("Static class element");
    System.out.println(a);
    System.out.println(b);
  }
}

class Amain
{
 public static void main(String args[])
  {
     Oper.show();
     Oper.b = 15;
     Oper.show();
     Oper a1 = new Oper();
     System.out.println(a1.b);
  }
}