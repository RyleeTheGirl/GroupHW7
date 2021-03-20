public class hw7 {

	public static void main(String[] args) {
		AnimalClassTester qa = new AnimalClassTester();
		
		Tyrannosaur clarence = new Tyrannosaur();
		if (qa.testAnimalObject(clarence)) {
			System.out.println("Tyrranosaur class passes");
		} else {
			System.out.println(">>>>Tyrranosaur class Failed!<<<<");
		}
		
		Penguin opus = new Penguin();
		if (qa.testAnimalObject(opus)) {
			System.out.println("Penguin class passes");
		} else {
			System.out.println(">>>>Penguin class Failed!<<<<");
		}
		
		Cow mrsolearys = new Cow();
		if (qa.testAnimalObject(mrsolearys)) {
			System.out.println("Cow class passes");
		} else {
			System.out.println(">>>>Cow class Failed!<<<<");
		}

		TreeClimbingOctopus edwardo = new TreeClimbingOctopus();
		if (qa.testAnimalObject(edwardo)) {
			System.out.println("TreeClimbingOctopus class passes");
		} else {
			System.out.println(">>>>TreeClimbingOctopus class Failed!<<<<");
		}

	}

}
