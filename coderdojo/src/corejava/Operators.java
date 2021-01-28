package corejava;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2 rabbits : Butter & Toast and their comparisons
		
		int butterWeight = 3;
		int toastWeight = 4;
		
		System.out.println("Butter weighs " + butterWeight + " pounds");
		System.out.println("Toast weighs " + toastWeight + " pounds");
		
		int toastWeighsMore = toastWeight - butterWeight;

		System.out.println("Toast weighs " + toastWeighsMore + " more pounds than butter");
		
		int totalWeight = butterWeight + toastWeight;
		
		System.out.println("Their total weight is " + totalWeight);
		
		int totalWeightMultiplyed = butterWeight * toastWeight;
		
		System.out.println("Butter weighs " + totalWeightMultiplyed + " pounds when multplied with Toast's weight");
		
		double totalWeightDivided = butterWeight / toastWeight;
		
		System.out.println("Butter weighs " + totalWeightDivided + " pounds when divided with Toast's weight");

	}

}
