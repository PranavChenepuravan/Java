import java.util.Scanner;
class Area
{
 int l;
 int b;
 int ar;
 Area(int le,int br)
  {
     l = le;
     b = br;
     ar = l * b;
     System.out.print("Area is ");
     System.out.println(ar);
     System.out.println("");     
  }
}
class Call
{
 static int le;
 static int br;
 static Scanner input = new Scanner(System.in);
 public static void main(String args[])
 {
   Area rect[] = new Area[5];
   for(int i = 0; i < 5; i++)
   {
     System.out.println("Enter the length and bredth of the rectangle");
     le = input.nextInt();
     br = input.nextInt();
     rect[i] = new Area(le , br);
   }
 }
}