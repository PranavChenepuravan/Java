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

   }
}

class Admission extends Sports
{
  static String batch;
  static void extra()
   {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the batch ");
     batch = input.next();  
   } 
  static void show(Student st, Student.Sports sp)
       {
         System.out.println("\nRoll number: " + st.rollno);
         System.out.println("Name : " + st.name);
         System.out.println("Mark: " + st.mark);
         System.out.println("Sports name : " + sp.Sportsname);
         System.out.println("Activity point : " + sp.Activitypoint);
         System.out.println("Batch : " + batch);
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
    Admission.extra();
    Admission.show(a1, b1);   
  }
}