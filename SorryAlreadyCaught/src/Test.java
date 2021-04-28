import java.io.IOException;

class ReadTheFile {
	static void print() throws Exception { // Line 4
		throw new IOException(); // Line 5
	}
}

public class Test {
	public static void main(String[] args) { // Line 10

		try {
			ReadTheFile.print();
			// This will have the same error regardless of order
		} catch (IOException | Exception e) {
			e.printStackTrace();
		}

		try {
			ReadTheFile.print();
			// This is OK; catch specific before general
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}