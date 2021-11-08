package challengeNo1;
import java.util.*;
public class StringInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = "Hello World";
		String arr[] = str.split(" ");
		int num = arr.length;
		int lastLength = arr[num-1].length();
		System.out.println(lastLength);
			
	}
		
}