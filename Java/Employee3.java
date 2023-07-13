import java.util.Scanner;

class Person 
{
    String name;
    String gender;
    String address;
    int age;

    public Person(String name, String gender, String address, int age) 
    {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person 
{
    String empid;
    String company_name;
    String qualification;
    int salary;

    public Employee(String name, String gender, String address, int age, String empid, String company_name,
                    String qualification, int salary) 
     {
        super(name, gender, address, age);
        this.empid = empid;
        this.company_name = company_name;
        this.qualification = qualification;
        this.salary = salary;
     }
}

class Teacher extends Employee 
{
    String subject;
    String department;
    String teacherid;

    public Teacher(String name, String gender, String address, int age, String empid, String company_name,
                   String qualification, int salary, String subject, String department, String teacherid) 
    {
        super(name, gender, address, age, empid, company_name, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherid = teacherid;
    }

    public void display() 
    {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empid);
        System.out.println("Company Name: " + company_name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Teacher ID: " + teacherid);
        System.out.println();
    }
}

class Main 
{
    public static void main(String args[]) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of teachers: ");
        int n = input.nextInt();

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) 
         {
            System.out.println("Enter details for teacher " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = input.next();
            System.out.print("Gender: ");
            String gender = input.next();
            System.out.print("Address: ");
            String address = input.next();
            System.out.print("Age: ");
            int age = input.nextInt();
            System.out.print("Employee ID: ");
            String empid = input.next();
            System.out.print("Company Name: ");
            String company_name = input.next();
            System.out.print("Qualification: ");
            String qualification = input.next();
            System.out.print("Salary: ");
            int salary = input.nextInt();
            System.out.print("Subject: ");
            String subject = input.next();
            System.out.print("Department: ");
            String department = input.next();
            System.out.print("Teacher ID: ");
            String teacherid = input.next();

            teachers[i] = new Teacher(name, gender, address, age, empid, company_name, qualification, salary,
                    subject, department, teacherid);
          }

        System.out.println("\nTeacher Details:");
        for (int i = 0; i < n; i++) 
         {
            System.out.println("Teacher " + (i + 1) + ":");
            teachers[i].display();
         }
    }
}