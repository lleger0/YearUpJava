//import math;

public class Nov1 {
	public static void main (String[] args){
		int integerValue;
		double doubleValue = 1.0;
		integerValue = (int)doubleValue;
		System.out.println("The integer value is");
		System.out.println(integerValue);
		
		//Question
		System.out.println("Enter 2 numbers");
		int num1=Integer.parseInt(args[0]);
		int num2= Integer.parseInt(args[1]);
		int num3 = num1+num2;
		System.out.println("The sum is "+ num3);
		double quotient = (double)num1/num2;
		System.out.println("The quotient is "+quotient);
		
		System.out.println("I am going to be using the third number that you gave me i.e the radius!");
		
		double radius = Double.parseDouble(args[2]);
		
		double area = radius*radius * Math.PI;
		
		System.out.println("The area is " + area);
		
	}
}