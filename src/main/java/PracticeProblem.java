public class PracticeProblem {


		public static Boolean validIndex(int[] intArray, int index) {
			try {
				int temp  = intArray[index];
				return true;

			}

			catch(ArrayIndexOutOfBoundsException e) {
				return false;
			}
		}


		public static int divide(int one, int two) {
			try { 
				return one/two;
			}
			catch(ArithmeticException e) {
				return 0;
			}
		}

		public static int safeConvertStringtoInt(String string) {
			try { 
				return Integer.parseInt(string);

			}
			catch (NumberFormatException e) {
				return 0;
			}
		}


	

	

}
