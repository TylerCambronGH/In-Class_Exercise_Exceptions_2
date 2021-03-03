package exercise.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestDataApp {
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("test.dat");
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
}
