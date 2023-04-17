import java.util.Scanner;
class Prog1
{
 public static void main(String args[])
 {
   System.out.println("Enter the string");
   Scanner input = new Scanner(System.in);
   String str1 = input.next();
   System.out.println("The inputed string is");
   System.out.println(str1);
   System.out.println("Length of the string is");
   System.out.println(str1.length());
   System.out.println("Character at 3rd position is ");
   System.out.println(str1.charAt(3));
   System.out.println("Substring from 5th to last position");
   System.out.println(str1.substring(5));
   System.out.println("Position of A is");
   System.out.println(str1.indexOf("A"));
   String str2 = "@@@";
   str1 = str1 + str2;
   System.out.println("String after concatinate @@@ ");
   System.out.println(str1);
   String str3 = "**";
   str1 = str1.concat(str3);
   System.out.println("String after concatinate **");
   System.out.println(str1);
   System.out.println("String after converted to uppercase");
   System.out.println(str1.toUpperCase());
   System.out.println("String after converted to lowerrcase");
   System.out.println(str1.toLowerCase());
 }
}
