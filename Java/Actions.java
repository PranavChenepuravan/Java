import java.util.Scanner;
class Prgm
{
 public static void main(String args[])
 {
  int[] a = new int[5];
  int temp = 0;
  int sum = 0;
  int max = 0;
  int sh = 0;
  System.out.println("Enter the elements: ");
  Scanner input = new Scanner(System.in);
  for(int i = 0;i < 5;i++)
  {
    a[i] = input.nextInt();
  }
  System.out.println("The inputed numbers are");
  for(int i = 0;i < 5;i++)
  {
    System.out.println(a[i]);
  }
  for(int i = 0;i < 5;i++)
  {
   for(int j = i + 1;j < 5;j++)
    {
      if(a[i] > a[j])
        {
           temp = a[i];
           a[i] = a[j];
           a[j] = temp;
        }
    }
  }
  System.out.println("After sort");
  for(int i = 0;i < 5;i++)
  {
    System.out.println(a[i]);
  }
  System.out.println("Sum of the elements");
  for(int i = 0;i < 5;i++)
  {
    sum = sum + a[i];
  }
  System.out.println(sum);
  System.out.println("Maximum");
  System.out.println(a[4]);
  System.out.println("Minimum");
  System.out.println(a[0]);
  System.out.print("Enter the element to search: ");
  sh = input.nextInt();
  for(int i = 0;i < 5;i++)
  {
    if(sh == a[i])
     {
       System.out.println("The element is present in the array");
       System.out.println("Index is " + i);
     }
  }
 }
}
  