public class Study {
	public static double amountHoursStudyPerDay1(int daysLeft) {
		return 15.0 / daysLeft;
	}
	public static double amountHoursStudyPerDay2(int midterm1, int daysLeft) {
		return ((1.0 - ((double)midterm1 / 100)) + 1.0) * 15.0 / daysLeft;
	}
	public static double amountHoursStudyPerDay3(int midterm1, int midterm2, int daysLeft) {
		return ((1.0 - (((double)midterm1 / 100 + (double)midterm2 / 100) / 2)) + 1.0) * 30.0 / daysLeft;
	}
	public static void main(String[] args) {
		String test1 = "midterm1";
		String test2 = "midterm2";
		String test3 = "final";
		StdOut.print("Type the kind of test that you are preparing for: ");
		String testType = StdIn.readString().toLowerCase();
		if (testType.equals(test1)) {
			StdOut.print("Type days until major test: ");
			int daysLeft = StdIn.readInt();
			StdOut.print(amountHoursStudyPerDay1(daysLeft) + " hours per day");
		}
		else if (testType.equals(test2)) {
			StdOut.print("Grade on Midterm 1: ");
			int midterm1 = StdIn.readInt();
			StdOut.print("Type days until major test: ");
			int daysLeft = StdIn.readInt();
			StdOut.print(amountHoursStudyPerDay2(midterm1, daysLeft) + " hours per day");
		}
		else if (testType.equals(test3)) {
			StdOut.print("Grade on Midterm 1: ");
			int midterm1 = StdIn.readInt();
			StdOut.print("Grade on Midterm 2: ");
			int midterm2 = StdIn.readInt();
			StdOut.print("Type days until major test: ");
			int daysLeft = StdIn.readInt();
			StdOut.print(amountHoursStudyPerDay3(midterm1, midterm2, daysLeft) + " hours per day");
		}
		else {
			StdOut.print("You either entered the test name wrong or you're trolling");
		}
	}
}
