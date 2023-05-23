import java.util.Scanner;
class Employee
{
 public int eNo;
 public int eSal;
 public String eName;
 Employee(int no,int sal,String name)
  {
    this.eNo = no;
    this.eSal = sal;
    this.eName = name;
  }
 void disp()
  {
    System.out.println("--------------------------");
    System.out.println(eNo);
    System.out.println(eSal);
    System.out.println(eName);
    System.out.println("\n-----------Saved--------\n");
  }
}

class Call
{
 static Scanner input = new Scanner(System.in);
 public static void main(String args[])
  {
    System.out.println("Enter how many employees do you have ");
    int n = input.nextInt();
    Employee[] a1 = new Employee[n];
    for(int i = 0; i < n ; i++)
     {
       System.out.println("Enter the employee number");
       int eNo = input.nextInt();
       System.out.println("Enter the employee Salary");
       int eSal = input.nextInt();
       System.out.println("Enter the employee name");
       String eName = input.next();
       a1[i] = new Employee(eNo,eSal,eName);
       a1[i].disp();
     }
    System.out.println("Enter the employee no to search");
    int flag = 1;
    int sh = input.nextInt();
    for(int i = 0; i < n ; i++)
     {
       if(a1[i].eNo != sh)
        {
          flag = 0;
        }
       else
        {
          System.out.println("\nThe employee is precent");
          System.out.println("Employee no : "+a1[i].eNo); 
          System.out.println("Salary      : "+a1[i].eSal);
          System.out.println("Name        : "+a1[i].eName);
          flag = 1;
          break;
        }
     }
    if(flag == 0)
     {
       System.out.println("The employee is not precent");
     }  
  }
}