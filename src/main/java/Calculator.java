import java.util.ArrayList;

public class Calculator {

	public static void main(String[] args) {
		/*
		 * Specifications - 
		 * Project should take user input, which should be provided in natural format (the sort one finds in math books, for example).
		 * Project should assemble provided expressions in the proper fashion, then evaluate them.
		 * We'll not worry about equations with variables in the first iteration. Second iteration will take on a variable.
		 * Third iteration should go multivariate.
		 * Project should not be assumed to solve equations with variables at this iteration.
		 * Project should support addition, subtraction, division, multiplication, exponentiation, modulo.
		 * Project should not support logical operators, trig functions, or complex-valued elements. Maybe in a subsequent revision.
		 * Will assume real-valued solutions (so convert to *double*) for now.
		 */
		
		//User input is an early requirement.
		StringBuilder input = null; //This will be resolved later.
		StringBuilder eqnOverall = null;
		if (input.equals(null)) {
			eqnOverall = new StringBuilder("(2+2)-2*(2%3)"); //A simple quadratic expression to be used as a first substitute for user input.
		} else {
			eqnOverall = input;
		}
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
		//Assumption - There is at most one equals sign in the equation.
		ArrayList<StringBuilder> eqnSet = new ArrayList<StringBuilder>(); //Each expression will need to be simplified, so we'll build them into this equation set, and resolve each recursively.
		int eqIndex = eqnOverall.indexOf("=");
		StringBuilder eqnA = null;
		StringBuilder eqnB = null;
		boolean isEquation = false; //Unless there's an equals sign, this is an expression.
		if (eqIndex != -1) { //If there's an equals sign, split the equation into two expressions.
			isEquation = true; //If there is an equals sign, this is an equation, and I'll need to process eqnA and eqnB as equivalent.
		eqnA = new StringBuilder(eqnOverall.subSequence(0, eqIndex));
		eqnB = new StringBuilder(eqnOverall.substring(eqIndex));
		eqnSet.add(eqnA);
		eqnSet.add(eqnB);
	} else {
		eqnSet.add(eqnOverall);
	}
		/*
		 * After I separate it into two separate expressions, what can be in those expressions?
		 * Generically, sub-expressions, which can be +, -, *, /, %, ^. 
		 * We assume that the expressions are arithmetic or algebraic, and assuming that all variables are defined by single characters.
		 * Do we want to consider the possibility of trig functions? Let's not for now, though a symbolic integrator would be an interesting extension on this exercise.
		 */
		/*
		 * Thinking about the plan for the next phase - 
		 * Each expression should resolve to a double. We'll assume no variables for now, and implement support for those later.
		 * I need to have the program go through the one or two expressions generated in the above section. If an expression can be parsed as a double, we're done.
		 * If the expression *can't* be parsed as a double, it's composed of a double and another double separated by a symbol, assuming it's formed properly.
		 */
		//Try to do it in a quick and dirty way first. Can implement a better solution after a working solution is implemented.
		for (StringBuilder eqn : eqnSet) {
			while (eqn.indexOf("+") != -1 && eqn.indexOf("-") != -1 && eqn.indexOf("*") != -1 && eqn.indexOf("/") != -1 && eqn.indexOf("%") != -1 && eqn.indexOf("(") != -1) { //While none of the expressions we care about are present in the equation passed in...

			}
		}
		
}
	
}
