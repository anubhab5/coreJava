package customException;

public class Test {

	public static void main(String[] args) throws CheckedCustomException {
//		throw new UncheckedCustomException("SOME BUSINESS ERROR");
		throw new CheckedCustomException("Checked Custom Exception Message");
	}

}
