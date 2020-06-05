package enums;

public class TestClass {

	public static void main(String[] args) {

//		PaymentTypes pt = PaymentTypes.DEBITCARD;
//		System.out.println(pt);

		PaymentTypes[] pt = PaymentTypes.values();

		for (PaymentTypes p : pt) {
			System.out.println(p);
			System.out.println(p.ordinal());
		}

	}

}
