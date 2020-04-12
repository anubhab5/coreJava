package runTimePolymorphism;

public class Test {

	public static void main(String[] args) {

		MACBook mba = new MACBookAir();
		mba.start();
		mba.shutDown();

		MACBook mbp = new MACBookPro();
		mbp.start();
		mbp.shutDown();
		MACBookPro mbp1 = (MACBookPro) mbp;
		mbp1.macbookTouch();

		MACBook mb = new MACBook();
		mb.start();
		mb.shutDown();
	}

}
