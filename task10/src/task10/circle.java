package task10;
import java.util.*;
public class circle {
    static Scanner sc=new Scanner(System.in);
	private double radius;
	private double pi;
	
	public circle() {
		this.radius=sc.nextDouble();
	}
	
	public circle(double radius,double pi) {
		
		this.radius=radius;
		this.pi=pi;
	}
	
	public double getCircumfence() {
		return 2*Math.PI*radius;
	}
	
	public double getPerimeter() {
		return 2*pi*radius;
	}
	
	public static void main(String args[]) {
		circle perimeter=new circle();
		
		double per =perimeter.getCircumfence();
		
		System.out.println(per);
		
		double r = sc.nextDouble();
		double pi=Math.PI;
		
		circle perimeter2 = new circle(r,pi);
		
		double per2=perimeter2.getPerimeter();
		System.out.println(per2);
		
	}
}