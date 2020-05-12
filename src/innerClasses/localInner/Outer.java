package innerClasses.localInner;

public class Outer {
	public void f1() {
		class Inner {
			public void f2() {
				System.out.println("Inside Inner Class F2");
			}
		}
		Inner inner = new Inner();
		inner.f2();
	}

	public static void main(String[] args) {
		Outer o = new Outer();
		o.f1();
	}

}
