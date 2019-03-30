package stringstudy;

public class RemoveJunk {

	public static void main(String[] args) {
		
		
		String news="Sumit @@@@ TTTTT %%%%";
		System.out.println( news.replaceAll("[^a-zA-Z 0-9]", "")); //Sumit  TTTTT 

	}

}
