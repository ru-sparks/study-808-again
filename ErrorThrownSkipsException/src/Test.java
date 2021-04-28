import java.io.FileNotFoundException;

public class Test {
	public static void main(String[] args) {
		try {
			// Example 5: Error
			runOutOfMemory();
			// Example 1: Standard library checked exception
			doSomethingWithAFile();
			// Example 2: Application defined checked exception
			doSomethingWithAppException();
			// Example 2: Application defined checked exception
			doSomethingWithAppException();
			// Example 3: Application defined runtime exception
			doSomethingWithRuntimeException();
			// Example 4: Unchecked exception
			doSomethingBadWithArithmetic();

		} 
		catch (FileNotFoundException e) {
			// recover in business logic from file not found
			// recreate the file with default settings
			// check alternate resources
			// ask the user what to do
			e.printStackTrace();
		} catch (SomeApplicationException e) {
			// recover the task...
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Exception!!!");
		}
        catch (Error err) {
        	err.printStackTrace();
        	System.out.println("Error!!!");
        } 


		System.out.println("Main ends!!!");
	}
	
	
	
	public static void doSomethingWithAFile() throws FileNotFoundException {
		throw new FileNotFoundException();
	}
	
	public static void doSomethingWithAppException() throws SomeApplicationException {
		throw new SomeApplicationException();
	}

	public static void doSomethingWithRuntimeException() {
		throw new SomeRuntimeException();
	}
	
	public static void doSomethingBadWithArithmetic() {
		int i = 0;
		int j = 10;
		
		j = j/i;
	}
	
	public static void runOutOfMemory() {
		StringBuilder sb = new StringBuilder();
		for (;;) {
			sb.append("OCA");
		}

	}
	
}