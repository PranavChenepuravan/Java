import java.util.Scanner;
class Student
{
 int rollno;
 String name;
 int mark;
 Student(int rl, String nm, int mk)
  {
      this.rollno = rl;
      this.name = nm;
      this.mark = mk;

  }

 class Sports
  {
    String Sportsname;
    int Activitypoint;
    Sports(String sp, int ap)
     {
      this.Sportsname = sp;
      this.Activitypoint = ap;
     }
      void show()
       {
         System.out.println("Roll number: " + rollno);
         System.out.println("Name : " + name);
         System.out.println("Mark: " + mark);
         System.out.println("Sports name : " + Sportsname);

         System.out.println("Activity point : " + Activitypoint);
       }

   }
}

class Call
{
 public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the roll number");
    int rollno = input.nextInt();
    System.out.println("Enter the name");
    String  name = input.next();
    System.out.println("Enter the mark");
    int mark = input.nextInt();
    System.out.println("Enter the sports name");
    String Sportsname = input.next();
    System.out.println("Enter the activity point ");
    int Activitypoint = input.nextInt();


    Student a1 = new Student(rollno, name, mark);
    Student.Sports b1 = a1.new Sports(Sportsname, Activitypoint);
    b1.show();
  }
}
