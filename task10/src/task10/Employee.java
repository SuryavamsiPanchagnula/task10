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
	
	public int getID(int ID) {
		return ID;
	}
	
	public String getFirstname(String firstname) {
		return firstname;
	}
	
	public String getLastname(String lastname) {
		return lastname;
	}
	
	public String getName(String name) {
		return name;
	}
	
	public int getSalary(int salary) {
		return salary;
	}
	
	public void setSalary() {
		int salary;
		System.out.println("Enter Employee salary");
		salary = sc.nextInt();
		this.salary=salary;
	}
	
	public int getAnnualSalary() {
		return (int) (salary*12);
	}
	
	public void raiseSalary(int percent) {
		percent=(int) (salary*percent);
		salary= percent + salary;
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
		
		System.out.println(obj);
		
		
		
		System.out.println("Annual Salary: "+obj.getAnnualSalary());
		
		System.out.println("Enter salary raise percent: ");
		int d = sc.nextInt();
		obj.raiseSalary(d);
		
		System.out.println("Employee detials after raise");
		
		System.out.println(obj.toString());
		}
}