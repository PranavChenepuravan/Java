import java.util.Scanner;
class Employee
{
 int en,empsal;
 String name;
 void get()
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the Employee name");
    name = input.next();
    System.out.println("Enter the Employee number");
    en = input.nextInt();
    System.out.println("Enter the Employee salary");
    empsal = input.nextInt();
  }
 void disp()
  {
    System.out.println("Employee name :"+name);
    System.out.println("Employee number :"+en);
    System.out.println("Employee salary :"+empsal);
  }
}

class Call
{
 public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of objects ");
    int n = input.nextInt();
    Employee a[] = new Employee[n];
    for(int i=0;i<n;i++)
     {
       a[i] = new Employee();
       a[i].get();
     }
    for(int i=0;i<n;i++)
     {
       a[i].disp();
     }
   int k = 0;
   System.out.println("Enter the employee number: ");
   int nm = input.nextInt();
   for(int i = 0;i < n;i++)
    {
      if(a[i].en==nm)
       {
         k = 1;
         break;
       }
    }
   if(k==1)
    {
      System.out.println("Employee is present");
      System.out.println(a[i].en);
    }
   else
   {
      System.out.println("Employee is not present");
    }
  }
