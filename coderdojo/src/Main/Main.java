package Main;

import Arithmetic.Arithmetic;
import Relational.Relational;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// object: math for type Arithmetic 
		// object: inequalities for type Relational 
		// class: Arithmetic, Relational etc.
		// method: int add = math.addition(1, 2); System.out.println("One plus Two is " + add);
		// defining here

		Arithmetic math = new Arithmetic();

		int add = math.addition(1, 2);
		System.out.println("One plus Two is " + add);

		int subtract = math.subtraction(2, 1);
		System.out.println("Two minus One is " + subtract);

		int multiply = math.multiplication(4, 3);
		System.out.println("Four times Three is " + multiply);

		int divide = math.division(12, 3);
		System.out.println("Twelve divided by Three is " + divide);

		Relational inequalities = new Relational();

		boolean equivilant = inequalities.equalto(1, 1);
		System.out.println("Is One equal to One? " + equivilant);

		boolean notequivilant = inequalities.notequalto(2, 1);
		System.out.println("Is Two equal to One? " + notequivilant);

		boolean greaterthan = inequalities.greater(3, 1);
		System.out.println("Is Three greater than One? " + greaterthan);

		boolean lessthan = inequalities.less(1, 5);
		System.out.println("Is One less than Five? " + lessthan);

	}
}
