import java.util.Scanner;
class Fib implements Runnable
{
 public void run()
  {
    int n = 13;
    int firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) 
     {
       System.out.println(firstTerm);
       int nextTerm = firstTerm + secondTerm;
       firstTerm = secondTerm;
       secondTerm = nextTerm;
     }
    System.out.println("");
  }
}

class Even implements Runnable
{
 public void run()
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the limit for even number: ");
    int lm = input.nextInt();
    System.out.println("");
    System.out.println("Even numbers till " + lm );
    for(int j = 1; j < lm; j++)
     {
       if(j % 2 == 0)
        {
          System.out.println(j);
        }
     }
     System.out.println("");
  }
}

class Call
{
 public static void main(String args[])
  {
    Fib a1 = new Fib();
    Thread t1 = new Thread(a1);
    t1.start();
    Even b1 = new Even();
    Thread t2 = new Thread(b1);
    t2.start();
  }
}