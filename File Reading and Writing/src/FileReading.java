import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileReading {

	public static void FileRead() throws FileNotFoundException {
		String pathName = "src/defaultpackage/file.txt";// You can change your file pathname
		File file = new File(pathName);
		Scanner scanner = new Scanner(file);
		try {
			while (scanner.hasNext()) {
				String textString = scanner.next();
				System.out.println(textString);

			}
		} catch (Exception e) {

			System.out.println("Dosya oluşturulamadı");

		} finally {
			System.out.println("Reading Completed ");
		}

	}

	public static void FileWriting() throws FileNotFoundException {
		String pathName = "src/defaultpackage/file.txt"; // You can change your file pathname
		File file = new File(pathName);
		PrintWriter pWriter = new PrintWriter(file);
		try {
			String textString = " ";// you can write your text here
			pWriter.println();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pWriter.close();
		}

	}
}
