import java.util.Scanner;
class Area
{
 int l;
 int b;
 int ar;
 Area(int a, int b)
 {
   l = a;
   b = b;
   ar = 6 * l * b;
   System.out.println("Area");
   System.out.print(ar);
   System.out.println("\n");
 }
 Area(int a)
 {
   l = a;
   ar = 6 * l * l;
   System.out.println("Area");
   System.out.print(ar);
   System.out.println("");
 }
}
class Call
{
 static int l;
 static int b;
 static int ar;
 static Scanner input = new Scanner(System.in);
 public static void main(String args[])
 {
   System.out.println("Enter the length and breadth quboid ");
   l = input.nextInt();
   b = input.nextInt();
   Area qd = new Area(l,b);
   System.out.println("Enter the length of qube");
   l = input.nextInt();
   Area qb = new Area(l);
 }
}
 