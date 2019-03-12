import java.util.Objects;

public class endsLy {

	public static void main(String[] args) {
		String word = "badly";
		int n = word.length();
		String lastTwo = word.substring(n-2,n);
			if(lastTwo.contentEquals("ly")) {
			System.out.println("true");
		}
			else{
			System.out.println("false");
		}
	}
		
}
