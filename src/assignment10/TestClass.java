package assignment10;

public class TestClass {

	public static void main(String[] args) {

		ElectricityBill eBill1 = new ElectricityBill();
		eBill1.setMeterNo(1);
		eBill1.setName("Anubhab");
		eBill1.setAddress("Kol");
		
		System.out.println(eBill1);
		
		ElectricityBill eBill2 = new ElectricityBill();
		eBill2.setMeterNo(1);
		eBill2.setName("Anubhab");
		eBill2.setAddress("Kol");
		
		System.out.println(eBill2);
		
		System.out.println(eBill1.equals(eBill2));
		
		System.out.println(eBill1.hashCode());
		System.out.println(eBill2.hashCode());
	}

}
