import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		char operator;
		double number1, number2, result;
		Scanner scanner = new Scanner(System.in);
		System.out.println("choose an operator : +,-,*or /");
		operator = scanner.next().charAt(0);
		System.out.println("enter the first number :");
		number1 = scanner.nextDouble();
		System.out.println("enter the second number :");
		number2 = scanner.nextDouble();
		switch (operator)
		{
		case '+':
			result = number1 + number2;
				System.out.println(number1 +" + " +number2 + "="+ result);
				break;
		case '-':
			result = number1+ number2;
			System.out.println(number1+ " - " +number2 + "=" + result);
			break;
		case '*':
			result = number1+number2;
			System.out.println(number1+ " * " +number2 + "=" + result);
			break;
		case '/':
			result = number1+number2;
			System.out.println(number1+ "/" +number2 + " =" + result);
			break;
			default :
				System.out.println(" invalid operator");
		
		}
		scanner.close();

	}

}
