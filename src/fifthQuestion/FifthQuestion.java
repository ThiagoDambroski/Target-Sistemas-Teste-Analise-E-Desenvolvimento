package fifthQuestion;

import java.util.Scanner;

public class FifthQuestion {
	
	public static String myReverseFunction(String str) {
		StringBuilder builder = new StringBuilder();
		for(int i = str.length() - 1; i >= 0;i--) {
			builder.append(str.charAt(i));
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma String para ser invertida: ");
		String input = scanner.next();
		
		System.out.println(myReverseFunction(input));
		scanner.close();
	}

}
