package stringstudy;

public class DuplicateinArray {

	public static void main(String[] args) {

		String[] lang = { "java", ".net", "csharp", "c","java","c" };

		for (int i = 0; i < lang.length; i++) {

			for (int j = i + 1; j < lang.length; j++) {

				if (lang[i].equals(lang[j])) {

					System.out.println(lang[i]);

				}
			}
		}

	}

}
