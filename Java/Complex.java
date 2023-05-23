import java.util.Scanner;
class Call
{
 static Scanner input = new Scanner(System.in);
 public static void main(String args[])
  {
    System.out.println("Enter the first complex number : ");
    System.out.println("Enter the real part");
    int real1 = input.nextInt();
    System.out.println("Enter the imaginary part");
    int imag1 = input.nextInt();
    System.out.println("The first complex number is ");
    System.out.println(real1 + " + " + imag1 + "i");

    System.out.println("Enter the second complex number : ");
    System.out.println("Enter the real part");
    int real2 = input.nextInt();
    System.out.println("Enter the imaginary part");
    int imag2 = input.nextInt();
    System.out.println("The second complex number is ");
    System.out.println(real2 + " + " + imag2 + "i");

    int real = real1 + real2;
    int imag = imag1 + imag2;
 
    System.out.println("\nSum");
    System.out.print("(" + real1 + " + " + imag1 + "i" + ")" +" + ");
    System.out.print("(" + real2 + " + " + imag2 + "i" + ")" +" = ");
    System.out.println(real + " + " + imag + "i");
  }
}