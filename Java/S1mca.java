import java.util.Scanner;
class Stud
{
 int rn;
 int m1;
 int m2;
 int m3;
 int tot;
 String nm;
 double perc;
 Stud(int rno,String name,int mr1,int mr2,int mr3)
  {
    rn = rno;
    nm = name;
    m1 = mr1;
    m2 = mr2;
    m3 = mr3;
    tot = m1 + m2 + m3;
    perc = (double) tot / 300 * 100;
  }
 void disp()
  {
    System.out.print("Name : ");
    System.out.println(nm);
    System.out.print("Roll no : ");
    System.out.println(rn);
    System.out.print("ADS : ");
    System.out.println(m1);
    System.out.print("MFC : ");
    System.out.println(m2);
    System.out.print("ASE : ");
    System.out.println(m3);
    System.out.print("Percentage : ");
    System.out.println(perc); 
    System.out.println(""); 
   }  
}

class Pass
{
 
 static int rno;
 static int mr1;
 static int mr2;
 static int mr3;
 static String temp;
 static String name;
 static double tmpr;
 static Scanner input = new Scanner(System.in);
 static Scanner into = new Scanner(System.in);
 public static void main(String args[])
  {
    Stud them[] = new Stud[47];
    System.out.println("How many students are there: ");
    int lm = input.nextInt();
    for(int i = 0 ; i < lm ; i++)
     {
       System.out.println("Enter the name ");
       name = into.nextLine();
       System.out.println("Enter the roll no ");
       rno = input.nextInt();
       System.out.println("ADS");
       mr1 = input.nextInt();
       System.out.println("MFC");
       mr2 = input.nextInt();
       System.out.println("ASE");
       mr3 = input.nextInt();
       System.out.println("");  
       them[i] = new Stud(rno , name , mr1 , mr2 , mr3);
     }
    for(int i = 0 ; i < lm ; i++)
     {
       them[i].disp();
     }
    double max = 0;
    String toper = "";
    for(int i = 0; i < lm ; i++)
     {
       if(them[i].perc > max)
        {
          max = them[i].perc;
          toper = them[i].nm;
        }
     }
     System.out.println(toper + " is the toper");     
  }

}