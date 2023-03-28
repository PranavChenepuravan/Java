class monkey
{ 
 int i;
 String h;
 void monkey()
  {
    i = 10;
    h = "Gothem";
  }
 void display()
  {
    System.out.println(i);
    System.out.println(h);
  }
}
class Animal
{
 public static void main(String args[])
 {
   monkey a = new monkey();
   a.monkey();
   a.display();
 }
}