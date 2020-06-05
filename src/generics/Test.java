package generics;

public class Test {

	public static void main(String[] args) {

		MyGenericClass<String> m1 = new MyGenericClass<String>("Anubhab");
		m1.displayObjectDetails();
		System.out.println(m1.getObjects());
		
		MyGenericClass<Integer> i = new MyGenericClass<Integer>(12);
		i.displayObjectDetails();
		System.out.println(i.getObjects());
	}

}
