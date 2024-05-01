package task10;
import java.util.*;
public class Person {
	
	private int age;
	private String name;

	public Person(String name,int age){
		
		this.name=name;
		if(age<1 || age>100) {
			System.out.println("Invalid Age");
			System.exit(0);
		}
		this.age=age;
		
	}
	
	public String getname() {
		return name;
	}
	
	public int getage() {
		return age;
	}
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name:");
		 
		String Name = sc.nextLine();
		
		System.out.println("Enter Age:");
		int Age = sc.nextInt();
		
		Person Person=new Person(Name,Age);
		
		System.out.println("Name: "+Person.getname());
		System.out.println("Age: "+Person.getage());
		
		sc.close();
		
		
	}
	
	

}
