import java.util.ArrayList;

public class Calculator {

	public static void main(String[] args) {
		/*
		 * Specifications - 
		 * Project should take user input, which should be provided in natural format (the sort one finds in math books, for example).
		 * Project should assemble provided expressions in the proper fashion, then evaluate them.
		 * We'll not worry about equations with variables in the first iteration. Second iteration will take on a variable.
		 * Third iteration should go multivariate.
		 * Project should not be assumed to solve equations of more than one variable at this iteration.
		 * Project should support addition, subtraction, division, multiplication, exponentiation, modulo.
		 * Unsure whether project should support logical operators.
		 * Unsure whether project should support more sophisticated operations.
		 * Unsure whether project should handle complex, or just real-valued solutions. Will assume real-valued (so convert to *double*) for now.
		 */
		
		//User input is an early requirement.
		StringBuilder placeholder = new StringBuilder("(2+2)-2*(2%3)"); //A simple quadratic expression to be used as a first substitute for user input.
		//Need to parse the user input, so need to acknowledge potential for IOException, and formatting exception.
		
		/*
		 * How do I want to handle this parsing? Probably going to be recursive!
		 * Step one - Break apart the expression at parentheses. (expression) + (expression) should split into a sum of two expressions, each evaluated separately.
		 * This recursive structure implies that I'm going to want to use an ArrayList to store the sub-expressions.
		 * 
		 * So...
		 * StringBuilder is passed into a recursive structure.
		 * Recursive structure separates the StringBuilder into an ArrayList of smaller StringBuilder objects.
		 * Proceed from left to right...
		 */
		
	}

}
