package runTimePolymorphism;

public class MACBookAir extends MACBook {

	@Override
	public void start() {
		System.out.println("Inside MACBookAir START METHOD");
	}
	
	@Override
	public void shutDown() {
		System.out.println("Inside MACBookAir shutDown METHOD");
	}
}
