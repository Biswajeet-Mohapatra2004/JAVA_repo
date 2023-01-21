import java.util.Scanner;
public class TempProg5 {
	
	Scanner ref = new Scanner(System.in);
	final double pi=3.14;
    void circle(){
		System.out.print("Enter the radius of the circle: ");
		double radius = ref.nextDouble();
		double res = pi*radius*radius;
		System.out.print("the area of the circle is = "+res);
    }
    void triangle() {
    	System.out.print("Enter the base of the triangle: ");
    	double base=ref.nextDouble();
    	System.out.print("Enter the height of the triangle: ");
    	double height=ref.nextDouble();
    	double area = (base*height)/2;
    	System.out.println("The area of the right angle triangle = "+area);
    }
    void cone() {
    	System.out.print("Enter the slant height of the cone: ");
    	double height=ref.nextDouble();
    	System.out.print("Enter the diameter of the cone: ");
		double dim = ref.nextDouble();
		double area=pi*(dim/2)*height;
		System.out.println("The Curved surface area of cone is = "+area);
    	
    }
    void rhombus() {
    	System.out.print("Enter the diagonal 1: ");
    	double d1=ref.nextDouble();
    	System.out.print("Enter the diagonal 2: ");
    	double d2=ref.nextDouble();
    	double area=(d1*d2)/2;
    	System.out.print("The area of the rhombus is = "+area);
    }
    void cylinder() {
    	System.out.print("Enter the radius of the cylinder: ");
		double radius = ref.nextDouble();
		System.out.print("Enter the height of the cylinder: ");
    	double height=ref.nextDouble();
    	double area = (2*pi*radius*height)+(2*pi*radius*radius);
    	System.out.print("The area of the cylinder is = "+area);
    	
    }
	public static void main(String[] args) 
	{
	  System.out.println("what do you want to perform: ");
	  System.out.println("1-circle");
	  System.out.println("2-triangle");
	  System.out.println("3-CSA_cone");
	  System.out.println("4-rhombus");
	  System.out.println("5-cylinder");
	  // scanner object
	  Scanner sc = new Scanner(System.in);
	  // instance variable to the class tempProg5
	  TempProg5 ref = new TempProg5();
	  System.out.print("Enter your choice here: ");
	  int ch=sc.nextInt();
	  if(ch==1) {
		  ref.circle();
	  }
	  else if(ch==2) {
		  ref.triangle();
		  
	  }
	  else if(ch==3) {
		  ref.cone();
	  }
      else if(ch==4) {
		  ref.rhombus();
	  }
      else if(ch==5) {
		  ref.cylinder();
	  }
	  else {
		  System.out.print("invalid input");
	  }
	}
}
