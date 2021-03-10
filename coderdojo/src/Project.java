
public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// LEARN JAVA: MANIPULATING VARIABLE Greater/Less Than or Equal To
		// Comparing the amount of Croutons to Pieces Of Chicken in a Chicken Caesar Salad
		
		int croutons = 8;
		int piecesOfChicken = 16;
		
		boolean lessPiecesOfChicken = croutons >= piecesOfChicken;
		
		System.out.println("Are there less Pieces Of Chicken? " + lessPiecesOfChicken);
		
		//This ratio was one serving, but now I need 6 servings. There has to be at least 40 Croutons in my salad
		
		int amountOfCroutons = 6 * 8;
		
		boolean meetsTheRequirement = amountOfCroutons >= 40;
		
		System.out.println("Does the amount of Croutons in six servings of salad meet the requirement? " + meetsTheRequirement);
		
	}

}
