package stringstudy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
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

		// 3.Using HashMap

		Map<String, Integer> progmap = new HashMap<String, Integer>();

		for (String prog : lang) {
			Integer count = progmap.get(prog);

			if (count == null) {

				progmap.put(prog, 1);
			}

			else {
				progmap.put(prog, ++count);
			}

		}

		System.out.println(progmap); // {csharp=1, java=2, c=2, .net=1}

		Set<Entry<String, Integer>> eset = progmap.entrySet();

		for (Entry<String, Integer> s : eset) {

			if (s.getValue() > 1) {

				System.out.println(s.getKey());
				// java
				// c
			}
		}

	}

}
