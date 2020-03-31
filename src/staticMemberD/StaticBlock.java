package staticMemberD;

public class StaticBlock {
	public static void main(String[] args) {
		System.out.println("Static Block");
	}

	static {
		System.out.println("In Static Block 1");
	}
	static {
		System.out.println("In Static Blockas 2");
	}
}
