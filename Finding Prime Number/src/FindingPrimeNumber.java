import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindingPrimeNumber {
	public static void findPrimeNumbers() throws FileNotFoundException {
		String pathNameNmbrs = "src/defaultpackage/number.txt";// your pathname
		String pathNamePrimeNmbr = "src/defaultpackage/primeNumber.txt";// your pathname
		File numbers = new File(pathNameNmbrs);
		File primeNumbers = new File(pathNamePrimeNmbr);
		Scanner scanner = new Scanner(numbers);
		PrintWriter printWriter = new PrintWriter(primeNumbers);
		try {
			while (scanner.hasNext()) {
				int number =  Integer.parseInt(scanner.next());
				if (isPrime(number)) {
					printWriter.println(number);
				}

			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			printWriter.close();
		}
	}

	public static boolean isPrime(int number) {
		boolean isPrime = true;
		if (number <= 1) {
			isPrime = false;
		} else if (number == 2) {
			isPrime = true;
		} else {
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}

}
