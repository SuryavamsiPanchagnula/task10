package task10;
import java.util.*;
public class Employee {

	private static int ID;
	private static String name;
	private static double salary;
	private String firstname;
	private String lastname;
	private static int percent;
	static Scanner sc = new Scanner(System.in);
	
	
	public Employee(int ID, String firstname , String lastname, int salary) {
		
		this.ID=ID;
		this.firstname=firstname;
		this.lastname=lastname;
		this.salary=salary;
	}
	
	public int getID() {
		return ID;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public String getName() {
		name = firstname+" "+lastname;
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary() {
		int salary;
		System.out.println("Enter Employee salary");
		salary = sc.nextInt();
		this.salary=salary;
	}
	
	public double getAnnualSalary() {
		return (double) (salary*12);
	}
	
	public void raiseSalary(int percent) {
		double raise_amount=(int) (salary*(percent/100.0));
		salary= raise_amount + salary;
		this.percent=percent;
		
	}
	
	public String toString() {
		return "Employee [ID ="+ID+" , name ="+firstname+" "+lastname+" , salary="+salary+"]";
	}
	
	public static void main(String args[]) {
		
		Employee obj = new Employee(0,"","",0);
		
		System.out.println("Enter Employee ID:");
		int id = sc.nextInt();
		obj.ID= id;
	
		
		System.out.println("Enter Employee firstname: ");
		String a = sc.next();
		obj.firstname=a;
		
		System.out.println("Enter Employee lastname: ");
		String b = sc.next();
		obj.lastname=b;
		
		obj.setSalary();
		
		System.out.println("Employee ID: "+obj.getID());
		System.out.println("Employee First Name: "+obj.getFirstname());
		System.out.println("Employee Last Name: "+obj.getLastname());
		System.out.println("Employee Name: "+obj.getName());
		System.out.println("Employee Salary: "+obj.getSalary());
		System.out.println("Annual Salary: "+obj.getAnnualSalary());
		
		System.out.println("Enter salary raise percent: ");
		int d = sc.nextInt();
		obj.raiseSalary(d);
		
		System.out.println("Employee details after raise");
		
		System.out.println(obj.toString());
		}
}