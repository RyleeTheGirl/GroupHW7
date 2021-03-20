public class Tyrannosaur extends AnimalClass {

	@Override
	String first() {
		return "Tyranosaurus Rex";
	}

	@Override
	String second() {
		return "Roarrrr!";
	}

	@Override
	String third() {
		return "other dinosaurs";
	}

	@Override
	String expectedFirst() {
		return "Tyranosaurus Rex";
	}

	@Override
	String expectedSecond() {
		return "Roarrrr!";
	}

	@Override
	String expectedThird() {
		return "other dinosaurs";
	}
}
