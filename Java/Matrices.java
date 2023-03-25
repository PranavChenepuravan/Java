import java.util.Scanner;
class Base
{
 static Scanner input = new Scanner(System.in); 
 static int i;
 static int j; 
 public static void main(String args[])
 {
   int mat[][] = new int[5][5];
   int temp[][] = new int[5][5];
   boolean isSymmetric = true;
   System.out.println("Enter the number of rows of the matrix ");
   int r = input.nextInt();
   System.out.println("Enter the number of columns of the matrix ");
   int c = input.nextInt();
   if(r != c)
    {
      System.out.println("Matrix if not square");
    }
   else
    {  
      System.out.println("Matrix is square");
      System.out.println("Enter the " + r * c + " elements");
      for(i = 0;i < r;i++)
       {
        for(j = 0;j < c;j++)
         {
           mat[i][j] = input.nextInt();
         }
       }
      System.out.println("Matrix is");
      for(i = 0;i < r;i++)
       {
        for(j = 0;j < c;j++)
         {
           System.out.print(mat[i][j] + " ");
         }
         System.out.println("");
       }

     for(i = 0;i < r;i++)
       {
        for(j = 0;j < c;j++)
         {
           temp[i][j] = mat[j][i];
         }
       }

     System.out.println("Transpose of matrix is");
     for(i = 0;i < r;i++)
       {
        for(j = 0;j < c;j++)
         {
           System.out.print(temp[i][j] + " ");
         }
         System.out.println("");
       }
     for(i = 0;i < r;i++)
       {
        for(j = 0;j < c;j++)
         {
           if(temp[i][j] != mat[i][j])
            {
              isSymmetric = false;
              break;
            }
         }
       }
     if(isSymmetric == true)
       {
         System.out.println("The matrix is symmetric");
       }
      else
       {
         System.out.println("The matrix is not symmetric");
       }   
}
 }
}