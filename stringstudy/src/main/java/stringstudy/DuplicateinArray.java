package stringstudy;

import java.util.HashSet;
import java.util.Set;

public class DuplicateinArray {

	public static void main(String[] args) {

		String[] lang = { "java", ".net", "csharp", "c", "java", "c" };

		// 1. Solution #Worst as Time Complexity is
		for (int i = 0; i < lang.length; i++) {

			for (int j = i + 1; j < lang.length; j++) {

				if (lang[i].equals(lang[j])) {

					System.out.println(lang[i]);

				}
			}
		}

		// 2. Using HashSet. Add method returns false if similar data already entered

		Set<String> lang2 = new HashSet<String>();

		for (String prog : lang) {

			if (lang2.add(prog) == false) {

				System.out.println("Duplicate found for " + prog);

			}
		}

	}

}
