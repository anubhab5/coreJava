package java8Features.methodref;

public class MyClass {

	public static void main(String[] args) {

		MyInterface f = i -> System.out.println(i);
		f.myMethod(10);
		
		MyClass mc = new MyClass();
		MyInterface f1 = mc:: myMethod2;
		f1.myMethod(22);
	}

	public void myMethod2(int i) {
		System.out.println(i);
	}

}
