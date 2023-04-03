import java.util.Scanner;
class Detail
{
 String nm;
 String dpt;
 int id;
 double sal;
 double gross;
 double medal;
 double tral;
 double pf;
 Detail(String nm,int id,double sal,String dpt,double gross,double medal,double tral,double pf)
  {
    this.nm = nm;
    this.id = id;
    this.sal = sal;
    this.dpt = dpt;
    this.gross = gross;
    this.medal = medal;
    this.tral = tral;
    this.pf = pf;
  }
 void disp()
  {
    System.out.println("--------------Employee--------------");
    System.out.print("Name : ");
    System.out.println(nm);
    System.out.print("Employee id : ");
    System.out.println(id);
    System.out.print("Netsalary : ");
    System.out.println(sal);
    System.out.print("Department : ");
    System.out.println(dpt);
    System.out.print("Gross salary : ");
    System.out.println(gross);
    System.out.print("Medical allavence : ");
    System.out.println(medal);
    System.out.print("Travelling allavence : ");
    System.out.println(tral);
    System.out.print("PF : ");
    System.out.println(pf);
  } 
}

class Call
{
 static Scanner input = new Scanner(System.in);
 public static void main(String args[])
  {
    Detail emp[] = new Detail[5];
    for(int i = 0 ; i < 5 ; i++)
     {
       System.out.println("Enter name: ");
       String nam = input.next();
       System.out.println("Enter employee id: ");
       int id = input.nextInt();
       System.out.println("Enter net sallary: ");
       double sal = input.nextDouble();
       System.out.println("Enter department: ");
       String dpt = input.next();
       System.out.println("Enter gross sallary: ");
       double gross = input.nextDouble();
       System.out.println("Enter medical allavance: ");
       double medal = input.nextDouble();
       System.out.println("Enter travelling allavence: ");
       double tral = input.nextDouble();
       System.out.println("Enter PF: ");
       double pf = input.nextDouble();
       System.out.println(" ");
       emp[i] = new Detail(nam , id , sal , dpt , gross , medal , tral , pf);
     }
    for(int i = 0 ; i < 5 ; i++)
     {
       emp[i].disp();
     }
  }
}