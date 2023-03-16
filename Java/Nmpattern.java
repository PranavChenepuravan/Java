class Pattern
{
  public static void main(String args[])
  {
    for(int i = 0;i < 6;i++)   
     {
        int n = 0;
        for(int j = 0;j <= i;j++)
        {
           System.out.print(n + " ");
           n += i + 1;
        }
        System.out.println();
     }
  }
}