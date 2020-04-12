package encapsulation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		c.setFirstName("Ajay");
		c.setLastName("Rathore");
		c.setCreditCard("12345");
		
		System.out.println(c.getFirstName());
		System.out.println(c.getLastName());
		System.out.println(c.getCreditCard());
	}

}
