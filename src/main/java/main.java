import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		double num1 = 0;
		double num2 = 0;
		char operator; 
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Welcome to the Calculator!");
		
		System.out.println("Please enter the first number ");
		num1 = s.nextDouble();
		
		System.out.println("Please enter the second number ");
		num2 = s.nextDouble();
		
		System.out.println("Please choose your operator(+, -, *, /) ");
		s.nextLine();
		operator = s.next().charAt(0);
		
		switch(operator) {
			case '+': 
						AddOperation adding = new AddOperation();
						adding.setA(num1);
						adding.setB(num2);
						System.out.println(num1 + " " +  operator + " " + num2 + " = " + adding.getResult());
						break;
			case '-': 
						SubOperation subtracting = new SubOperation();
						subtracting.setA(num1);
						subtracting.setB(num2);
						System.out.println(num1 + " " +  operator + " " + num2 + " = " + subtracting.getResult());
						break;
			case '*': 
						MulOperation multiply = new MulOperation();
						multiply.setA(num1);
						multiply.setB(num2);
						System.out.println(num1 + " " +  operator + " " + num2 + " = " + multiply.getResult());
						break;
			case '/': 
						DivOperation divide = new DivOperation();
						divide.setA(num1);
						divide.setB(num2);
						System.out.println(num1 + " " +  operator + " " + num2 + " = " + divide.getResult());
						break;
			default:
					System.out.println("Choose a correct operator (+, -, *, /) and run the program again.");
		}
		
		
		
		
		
		

	}

}
