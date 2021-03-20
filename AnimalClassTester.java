public class AnimalClassTester {
	
	public boolean testAnimalObject(AnimalClass animal) {


			if (animal.first().equals(animal.expectedFirst())) {
				if (animal.second().equals(animal.expectedSecond())) {
					if (animal.third().equals(animal.expectedThird())) {
						return true;
					}
				}
			}

		return false;
	}

}
