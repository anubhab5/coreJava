package assignment6;

public class Test {

	public static void main(String[] args) {

		Patient p = new Patient();
		
		p.setId(1);
		p.setName("Aakash");
		p.setSsn("12B");
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getSsn());
	}

}
