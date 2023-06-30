import java.util.Scanner;

class Neg extends Exception 
{
    Neg(String str) 
    {
        super(str);
    }
}

class Check 
{
    Check(int nm) throws Neg 
    {
        if (nm < 0) 
        {
            throw new Neg("Negative number");
        }
    }
}

class Call 
{
    public static void main(String args[]) 
    {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.print("How many numbers are you going to input: ");
        int n = input.nextInt();
        System.out.println("Enter the numbers ");
        for (int i = 0; i < n; i++) 
        {
            try 
            {
                int num = input.nextInt();
                new Check(num); 
                arr[i] = num;
            } 
            catch (Neg a) 
            {
                System.out.println(a.getMessage());
                i -= 1;
            }
        }

        System.out.println("Average of inputted numbers: ");
        int tot = 0;
        for (int j = 0; j < n; j++) 
        {
            tot += arr[j];
        }
        int avg = n > 0 ? tot / n : 0; // Handle division by zero
        System.out.println(avg);
    }
}
