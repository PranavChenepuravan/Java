import java.util.Scanner;
class Call
{
 public static void main(String args[])
 {
    StringBuffer sb = new StringBuffer("");
    System.out.println("Enter the string ");
    Scanner input = new Scanner(System.in);
    String str1 = input.next();
    sb.insert(0,str1);
    System.out.println("The inputed string is");
    System.out.println(sb);
    System.out.println("After inserting @@@ at position 1");
    sb.insert(1,"@@@");
    System.out.println(sb);
    System.out.println("After replacing @@@ with ** "); 
    sb.delete(1,4);
    sb.insert(1,"**");
    System.out.println(sb);
 }
}