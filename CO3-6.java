import java.util.Scanner;

interface Calc 
 {
    void area();

    void perimeter();
 }

class Circle implements Calc 
 {
    static Scanner input = new Scanner(System.in);
    int radius;

    public void area() 
    {
        System.out.println("Enter the radius: ");
        this.radius = input.nextInt();
        double are = 3.14 * radius * radius;
        System.out.println("Area = " + are);
    }

    public void perimeter() 
    {
        double per = 2 * 3.14 * radius;
        System.out.println("Perimeter = " + per);
    }
 }

class Rectangle implements Calc 
{
    static Scanner input = new Scanner(System.in);
    int length;
    int breadth;

    public void area() 
    {
        System.out.println("Enter the length: ");
        this.length = input.nextInt();
        System.out.println("Enter the breadth: ");
        this.breadth = input.nextInt();
        int area = length * breadth;
        System.out.println("Area = " + area);
    }

    public void perimeter() 
    {
        int per = 2 * (length + breadth);
        System.out.println("Perimeter = " + per);
    }
}

class Call 
{
    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) 
    {
        System.out.println("-----------------MENU----------------");
        System.out.println("Select 1. Circle 2. Rectangle");
        int op = input.nextInt();
        if (op == 1) 
        {
            Circle a = new Circle();
            a.area();
            a.perimeter();
        } 
        else if (op == 2) 
        {
            Rectangle b = new Rectangle();
            b.area();
            b.perimeter();
        }
    }
}