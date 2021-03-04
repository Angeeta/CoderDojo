package database;

import model.Pet;

public class PetInfo {

	public Pet getPet(String breed) {

		if (breed.equals("Labrador Retriever")) {
			Pet labrador = new Pet();
			labrador.breedName = "Labrador Retriever";
			labrador.description = "The Lab makes its 25th straight appearance";

			return labrador;
		}

		else if (breed.equals("Golden Retriever")) {
			Pet goldenRetriever = new Pet();
			goldenRetriever.breedName = "Golden Retriever";
			goldenRetriever.description = "A very althletic breed";

			return goldenRetriever;

		}

		else if (breed.equals("Bulldog")) {
			Pet Bulldog = new Pet();
			Bulldog.breedName = "Bulldog";
			Bulldog.description = "One of the fastest-growing breeds in terms of popularity";

			return Bulldog;
		}
		return null;
	}
}
