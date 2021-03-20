public class Penguin extends AnimalClass {

	@Override
	String first() {
		return "penguin";
	}

	@Override
	String second() {
		return "mostly fish";
	}

	@Override
	String third() {
		return "waddle and swim";
	}

	@Override
	String expectedFirst() {
		return "penguin";
	}

	@Override
	String expectedSecond() {
		return "mostly fish";
	}

	@Override
	String expectedThird() {
		return "waddle and swim";
	}
}
