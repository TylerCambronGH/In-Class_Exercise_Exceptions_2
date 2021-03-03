package exercise.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestDataApp_Two {
	public static void main(String[] args) {
		
		File file = new File("test.dat");
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist.");
		}

	}
}
