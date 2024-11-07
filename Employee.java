 import java.util.Scanner;
class Emplyclass
{
	Scanner sc=new Scanner(System.in);
	String name;
	int age;
	int phno;
	String address;
	float salary;
	void printSalary()
	{
		System.out.println("Salary: "+salary);
	}
	void read()
	{
		System.out.println("Enter name: ");
		name=sc.nextLine();
		System.out.println("Enter age: ");
		age=sc.nextInt();
		System.out.println("Enter Phno: ");
		phno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter address: ");
		address=sc.nextLine();
		System.out.println("Enter salary: ");
		salary=sc.nextFloat();
	}
	void print()
	{
        System.out.println("");
		System.out.println(name);
		System.out.println(age);
		System.out.println(phno);
		System.out.println(address);
	}
}
class Officer extends Emplyclass
{
	Scanner sc=new Scanner(System.in);
	Emplyclass obj=new Emplyclass();
	String Spclzn;
	void readoff()
	{
        System.out.println("");
        System.out.println("Officer details");
		System.out.println("Enter Specialization: ");
		Spclzn=sc.nextLine();
		obj.read();
	}
    void printoff()
    {
        System.out.println("Officer:");
		System.out.println("Specialization: "+Spclzn);
        obj.print();
		obj.printSalary();
    }
}
class Manager extends Emplyclass
{
	Scanner sc=new Scanner(System.in);
	Emplyclass obj=new Emplyclass();
	String Deprtmnt;
	void readmang()
	{
		System.out.println("");
        System.out.println("Manager details");
		System.out.println("Enter Department: ");
		Deprtmnt=sc.nextLine();
		obj.read();
	}
    void printmang()
    {
        System.out.println("Manager");
		System.out.println("Department: "+Deprtmnt);
        obj.print();
		obj.printSalary();
    }
}

class Employee
{
	public static void main(String args[])
	{
		Officer obj1=new Officer();
		obj1.readoff();
		Manager obj2=new Manager();
		obj2.readmang();
        obj1.printoff();
        obj2.printmang();
	}
}
