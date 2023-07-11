import java.util.Scanner;
class Multi extends Thread
{
 public void run()
  {
    int a = 5;
    int ans = 1;
    for(int i = 1; i < 11; i++)
     {
       ans = i * a;
       System.out.println(i + "*" + a + "=" + ans);
     }
  }
}

class Prime extends Thread
{
 public void run()
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the limit for the prime number : ");
    int lm = input.nextInt();
    int counter;
    for(int j=2;j<=lm;j++)
     {
         counter=0;
         for(int i=1;i<=j;i++)
         {
            if(j%i==0)
            {
               counter++;
            }
         }
         if(counter==2)
         System.out.println(j);
      } 
  }
}

class Call
{
 public static void main(String args[])
  {
    Prime b1 = new Prime();
    b1.start();
    Multi a1 = new Multi();
    a1.start();
  }
}