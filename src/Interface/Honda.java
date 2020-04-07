package Interface;

public class Honda implements Car {

	@Override
	public void go() {
		System.out.println("Inside go of Honda");
	}

	@Override
	public void stop() {
		System.out.println("Inside stop of Honda");
	}

}
