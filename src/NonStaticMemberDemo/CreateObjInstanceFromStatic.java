package NonStaticMemberDemo;

public class CreateObjInstanceFromStatic {

	static CreateObjInstanceFromStatic staticObj;

	// Creating an object reference from/ inside a static block
	static {
		CreateObjInstanceFromStatic obj = new CreateObjInstanceFromStatic();
		System.out.println(obj);

		// Creating an Oject with new keyword and assigning it to a static member
		System.out.println(CreateObjInstanceFromStatic.staticObj);
		CreateObjInstanceFromStatic.staticObj = new CreateObjInstanceFromStatic();
		System.out.println(CreateObjInstanceFromStatic.staticObj);
	}

	public static void main(String[] args) {
	}

}
