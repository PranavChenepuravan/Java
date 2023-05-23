import java.util.Scanner;
class Call
{
 static Scanner input = new Scanner(System.in);
 public static void main(String args[])
 {
   int flag = 0;
   int arr[] = new int[5];
   System.out.println("Enter the number elements");
   for(int i = 0 ; i < 5 ; i++)
    {
      arr[i] = input.nextInt();
    } 
   System.out.println("Elements are ");
   for(int i = 0 ; i < 5 ; i++)
    {
      System.out.println(arr[i]);
    } 
   System.out.println("Enter the elements to search ");
   int elm = input.nextInt();
   for(int i = 0 ; i < 5 ; i++)
    {
      if(arr[i] == elm)
       {
         flag = 1;
         break;
       }
    }
   if(flag == 1)
    {
      System.out.println("The elements is precent ");
    }
   else
    {
      System.out.println("The element is not precent ");
    }
   
   int check = 0;
   String arrs[] = new String[5];
   System.out.println("Enter the string elements");
   for(int i = 0 ; i < 5 ; i++)
    {
      arrs[i] = input.next();
    } 
   System.out.println("Element are ");
   for(int i = 0 ; i < 5 ; i++)
    {
      System.out.println(arrs[i]);
    } 
   System.out.println("Enter the element to search ");
   String elmn = input.next();
   for(int i = 0 ; i < 5 ; i++)
    {
      if(arrs[i].equals(elmn))
       {
         check = 1;
         break;
       }
    }
   if(check == 1)
    {
      System.out.println("The elements is precent ");
    }
   else
    {
      System.out.println("The element is not precent ");
    }
 }
}