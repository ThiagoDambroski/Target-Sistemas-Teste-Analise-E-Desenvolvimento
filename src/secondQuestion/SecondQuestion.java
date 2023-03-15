package secondQuestion;

import java.util.Scanner;

public class SecondQuestion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int n1 = 0;
		int n2 = 1;
		
		while(n2 <= input) {
			int next = n1 + n2;
			n1 = n2;
			n2 = next;
		}
		
		if(input == n1 || input == n2) {
			System.out.println("Pertence a sequencia");
		}else {
			System.out.println("Não pertence a sequencia");
		}
		sc.close();
		
	}

}
