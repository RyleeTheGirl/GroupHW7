public class Cow extends AnimalClass {
	@Override
	String first() {
		return "Cow";
	}

	@Override
	String second() {
		return "grass, hay, and corn";
	}

	@Override
	String third() {
		return "milk and cheese";
	}

	@Override
	String expectedFirst() {
		return "Cow";
	}

	@Override
	String expectedSecond() {
		return "grass, hay, and corn";
	}

	@Override
	String expectedThird() {
		return "milk and cheese";
	}
}
