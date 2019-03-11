
public class makeOutWord {

	public static void main(String[] args) {
		String out = "<<>>";
		String word = "cat";
		int n = out.length();
		System.out.println(out.substring(0,(n/2)) + word + out.substring(n/2, n));
	}

}
