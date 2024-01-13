import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sum = 0;//sum을 루프안에서 선언하게 되면 매번 새로운 루프가 만들어짐
		for (int i = 1; i <= n; i++) {
			sum += i; 
		}
		System.out.println(sum);
	}
}
