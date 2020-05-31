package ioStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("D:\\Code\\selfPractice\\Java\\ioFileRead\\testRead.txt");
			fos = new FileOutputStream("D:\\Code\\selfPractice\\Java\\ioFileRead\\newTestRead.txt");
			int data;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println("File Copied");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
