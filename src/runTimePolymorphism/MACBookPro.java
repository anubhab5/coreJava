package runTimePolymorphism;

public class MACBookPro extends MACBook {

	@Override
	public void start() {
		System.out.println("Inside MACBOOK PRO START METHOD");
	}

	@Override
	public void shutDown() {
		System.out.println("Inside MACBOOK PRO shutDown METHOD");
	}

	public void macbookTouch() {
		System.out.println("MACBOOK TOUCH PRO METHOD CALLED");
	}
}
