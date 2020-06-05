package generics;

public class MyGenericClass<T> {

	T obj;

	MyGenericClass(T obj) {
		this.obj = obj;
	}

	public void displayObjectDetails() {
		System.out.println("The Type of object :- " + obj.getClass().getName());
	}
	
	public T getObjects() {
		return obj;
	}
}
