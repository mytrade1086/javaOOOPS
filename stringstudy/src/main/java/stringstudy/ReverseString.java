package stringstudy;

public class ReverseString {

	public static void main(String[] args) {

		String oString = "sumit";

		int len = oString.length();

		String RevStr = "";

		for (int i = len - 1; i >= 0; i--) {

			RevStr = RevStr + oString.charAt(i);
		}

		System.out.println(RevStr); // timus
		
		

		// Method 2: Reverse method of StringBuffer

		StringBuffer sb = new StringBuffer(oString);

		System.out.println(sb.reverse());

	}

}
