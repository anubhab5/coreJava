package ExceptionHandling.CheckedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 *  If an error is not handled then we can throw the error
 *  The caller must handle it.
 *  Even if the error is not handled in the caller then in the main we can write the throws keyword, 
 *  in that case the JVM will handle it. But in that case user will see an unfriendly error msg
 */
public class ThrowsDemo {

	void readFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("");
	}

	public static void main(String[] args) {
		ThrowsDemo td = new ThrowsDemo();
		try {
			td.readFile();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found.");
		}
	}
}
