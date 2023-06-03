class Call
{
 public static void main(String args[])
  {
    String str1 = "Hello";
    String str2 = "Kitty";
    System.out.print("First string : ");
    System.out.println(str1);
    System.out.print("Second string : ");
    System.out.println(str2);
    System.out.print("First string converted to uppercase : ");
    str1 = str1.toUpperCase();
    System.out.println(str1);
    System.out.print("Second string converted to lowercase : ");
    str2 = str2.toLowerCase();
    System.out.println(str2);
    System.out.print("Strings combined : ");
    str1 = str1 + str2;
    System.out.println(str1);
    System.out.print("String reversed : ");
    for(int i = str1.length()-1;i>=0;i--)
     {
       System.out.print(str1.charAt(i));
     }
  }
}