import java.util.InputMismatchException;

public class PracticeProblem {

	public static void main(String[] args) {

	}



	public static boolean validIndex(int arr1[], int num1) {

		try {
			int check = arr1[num1];
			return true;

	}

	catch(ArrayIndexOutOfBoundsException e) {

	 return false;

	}
	}


	public static int divide(int num2, int num3) {
		try {
			int b = num2/num3;
			return b;
		}

	 catch(ArithmeticException e) {
		return 0;
	 }
	}


	 public static int safeConvertStringtoInt(String word) {
		try {

		int a = Integer.parseInt(word);
		return a;

		}
		catch (NumberFormatException e) {
			return 0;
		}
	}

}
