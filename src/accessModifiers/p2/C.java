package accessModifiers.p2;
import accessModifiers.p1.A;

public class C extends A {

	public static void main(String[] args) {

		A aObj = new A();
		System.out.println(aObj.d);
		
		C cObj = new C();
		System.out.println(cObj.c);
	}

}
