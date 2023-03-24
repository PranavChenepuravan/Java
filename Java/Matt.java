import java.util.Scanner;
class Matrr
{
 int mtrx[][] = new int[4][4];
 void mtx(int i)
 {
   System.out.println("Enter the matrix" );
   Scanner input = new Scanner(System.in);
   mtrx[i][i] = input.nextInt();
 }
}
class Add
{
 void main(String args[])
 {
   int i = 0;
   int fm = 0;
   int sm = 0;
   Matrr a = new Matrr(); 
   a.mtx(i);
   fm = a.mtrx[i][i];
   i = i + 1;
   Matrr b = new Matrr(); 
   b.mtx(i);
   sm = b.mtrx[i][i];
   int sum = fm + sm;
   System.out.print("Sum of the matrices is: ");
   System.out.println(sum);
 }
}
 
 