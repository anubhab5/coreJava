package assignment5;

public class Test {

	public static void main(String[] args) {

		TouchScreenLaptop hpSpectare = new HPNotebook();
		
		TouchScreenLaptop g7 = new DellNotebook();
		
		hpSpectare.click();
		hpSpectare.scroll();
		
		g7.scroll();
		g7.click();
		
	}
}
