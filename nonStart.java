
public class nonStart {

	public static void main(String[] args) {
		
		String first = "Hello";
		String second = "There";
		int x = first.length();
		int y = second.length();
		String newWord = first.substring(1,x) + second.substring(1, y);
		System.out.print(newWord);
		
	}

}
