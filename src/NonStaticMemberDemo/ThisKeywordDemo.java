package NonStaticMemberDemo;

public class ThisKeywordDemo {

	int x;

	ThisKeywordDemo() {
		System.out.println(this); // here this is pointing to a memory location
	}

	public static void main(String[] args) {
		new ThisKeywordDemo();
		new ThisKeywordDemo();
	}
}
