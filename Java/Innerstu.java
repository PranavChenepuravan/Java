class Student
{
  int Rollno = 1;
  String name = "Akil";
  int mark = 89;
  class Sports
   {
     String sportsname = "Hockey";
     int activitypoint = 46;
     void disp()
      {
        System.out.println("Name : " + name);
        System.out.println("Roll no : " + Rollno);
        System.out.println("Mark : " + mark);
        System.out.println("Sports name : " + sportsname);
        System.out.println("Activity : " + activitypoint);
      }
   }
}

class Call
{
  public static void main(String args[])
   {
     Student a1 = new Student();
     Student.Sports b1 = a1.new Sports();
     b1.disp();
   }
}