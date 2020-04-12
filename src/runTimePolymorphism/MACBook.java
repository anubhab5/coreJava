package runTimePolymorphism;

public class MACBook implements AppleLaptop {
	@Override
	public void start() {
		System.out.println("Inside MACBOOK start");
	}
	
	@Override
	public void shutDown() {
		System.out.println("Inside MACBOOK start");
	}
}
