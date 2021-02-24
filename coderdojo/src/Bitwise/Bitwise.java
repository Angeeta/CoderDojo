package Bitwise;

public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		public int and(int number1, int number2) {
			int outcome = number1 & number2;
			return outcome;
		}
		
		public int or(int number1, int number2) {
			int outcome = number1 | number2;
			return outcome;
		}
		
		public int exclusiveOr(int number1, int number2) {
			int outcome = number1 ^ number2;
			return outcome;
		}
		
		public int complement(int number) {
			int outcome = ~number;
			return outcome;
		}
	
	}

}
