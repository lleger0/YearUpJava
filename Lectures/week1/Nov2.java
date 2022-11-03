import java.util.*;
//import com.Lectures.week1;
//com.Lectures.week1;//to define a package?

public class Nov2{
	public static void main (String[] args){
		Scanner userInput = new Scanner(System.in);
		
		for (int i = 1; i<=10;i++){
			System.out.println(i);
		}
		
		//factorial
		System.out.println("Enter a number");
		int num1 = userInput.nextInt();
		
		
		int product = 1;
		while (num1>0){
			product*=num1;
			
			
			num1=num1-1;
		}
		
		System.out.println("The factorial is " + product);
		
		
		//fibonachi
		//this gon be hard actually
		
		System.out.println("Enter a number");
		int n = userInput.nextInt(); // user input
		int num2 = 1;  
		int num3  = 1; 
		int num4;
		for (int i = 1; i < n; i++){
			num4 = num2+num3;
			
			num2 = num3;
			num3 = num4;
			
			System.out.println(num2);
			
		}
		
		System.out.println(num2 + " is the " + n + "th fibonachi number");
		
		
		for (int i = 0; i < 5; i++){
			for (int j = 0; j<i; j++){
				System.out.print("*");
			}				
			System.out.println("");

		}
		
		System.out.println("What is the radius");
		
		double radius = userInput.nextInt();
		//ig we not doing that lol
		
		
		float m = 0;
		for (int i = 0; i <10; i++){
			m+=0.1;
			System.out.println(m);
		}
		
		
	}
	

}

