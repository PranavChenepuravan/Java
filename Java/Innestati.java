class Student
 {
   int Rollno = 1;
   String name = "Shabna";
   int mark = 59;
   class Sports
    {
      String sportsname = "Foot ball";
      int activitypoint = 107;
      void show()
       {
         System.out.println("Name : " + name);
         System.out.println("Roll no : " + Rollno);
         System.out.println("Mark : " + mark);
         System.out.println("Sports name : " + sportsname);
         System.out.println("Activity : " + activitypoint);
       }
    }
 }

class Admission
 {
   static String batch = "MCA";
   static void disp()
    {
      System.out.println("Batch : " + batch);
    }
 }

class Call
 {
   public static void main(String args[])
    {
      Admission a1 = new Admission();
      a1.disp();
      Student b1 = new Student();
      Student.Sports c1 = b1.new Sports();
      c1.show();
    }
 }