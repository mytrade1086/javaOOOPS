package stringstudy;

public class StringVariations {

	public static void main(String[] args) {

		String dummy = "this is it";
		int strLength = dummy.length();

		// 1. Find length of dummy string
		System.out.println(strLength); // 10

		// 2. find what is present at first index
		System.out.println(dummy.charAt(1)); // h

		try {
			// 3. find output for non existent index
			System.out.println(dummy.charAt(100)); // java.lang.StringIndexOutOfBoundsException
		} catch (Exception e) {
			System.out.println("StringIndexOutOfBoundsException will happen");
		}

		// 4. Get index of character
		System.out.println(dummy.indexOf("i")); // 2 will give first occurence of "i"

		// 5. Get index of character
		System.out.println(dummy.indexOf("i", dummy.indexOf("i") + 1)); // 5 will give second occurrence of "i"

		// 6. Get index of unavailable character X
		System.out.println(dummy.indexOf("x")); // -1

		// 6. Get index of unavailable character X
		System.out.println(dummy.replace(" ", "")); // Replaces space with no space thisisit

		// Again restoring original value
		dummy = "this is it";

		// 7.Get substring from index 1

		System.out.println(dummy.substring(1)); // his is it

//8.Get substring from index 1

		System.out.println(dummy.substring(0, 9)); // this is i *does not considers last index

		// 9.Split String

		String[] sarr = dummy.split(" ");

		for (String s : sarr) {

			System.out.println(s);
//			 this  saar[0]
//			 is  saar[1]
//			 it  saar[2]

		}

		String a1 = "Hello";
		String a2 = "world";

		int b1 = 100;
		int b2 = 200;

		System.out.println(a1 + a2 + b1 + b2); // Helloworld100200 Left to Right execution

	}

}
