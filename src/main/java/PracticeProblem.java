import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		//Write question 1 code here
	 Scanner reader = new Scanner(System.in);
     System.out.print("In: ");
	String input = reader.nextLine(); // Get the whole string from the user
    char char1 = input.charAt(0);     // Get the first character
    System.out.println(char1);      // Output the first character
	}
 
	public static void q2() {
		//Write question 2 code here
        Scanner reader = new Scanner(System.in);
        System.out.print("In: ");
        
        boolean input = reader.nextBoolean();  // Read a boolean (true or false)
        boolean opposite = !input;             // Get the opposite using '!'
        
        System.out.println(opposite);          // Output the opposite boolean
    }

	

	public static void q3() {
		//Write question 3 code here
        Scanner reader = new Scanner(System.in);
        System.out.print("In: ");
        
        int number = reader.nextInt();          // Read an integer from the user
        boolean result = number > 5;            // Check if it's greater than 5
        
        System.out.println(result);             // Output true or false

	}

	public static void q4() {
		//Write question 4 code here
        Scanner reader = new Scanner(System.in);
        System.out.print("In: ");
        
        double number = reader.nextDouble();            // Read a double from the user
        boolean result = number >= -2 && number <= 2;  // Check if number is between -2 and 2 (inclusive)
        
        System.out.println(result);                     // Output true or false
    }


	

	public static void q5() {
		//Write question 5 code here
		Scanner reader = new Scanner(System.in); 
		System.out.print("In: ");
	   String input = reader.nextLine(); 
       boolean result = input.equals("Hello World");         
        System.out.println(result);          
    }

	public static void q6() {
		//Write question 6 code here
        Scanner reader = new Scanner(System.in);
        System.out.print("In: ");
        int first = reader.nextInt();        // Read the first integer
        
        System.out.print("In: ");
        int second = reader.nextInt();       // Read the second integer
        
        boolean result = first <= second;    // Check if the first integer is less than or equal to the second
        
        System.out.println(result);          // Output true or false

	}

	public static void q7() {
		//Write question 7 code here
		Scanner reader = new Scanner(System.in);

        System.out.print("In: ");
        double first = reader.nextDouble();       
        
        System.out.print("In: ");
        double second = reader.nextDouble();       
        
        boolean result = first > second;    
        
        System.out.println(result);
	}

}
