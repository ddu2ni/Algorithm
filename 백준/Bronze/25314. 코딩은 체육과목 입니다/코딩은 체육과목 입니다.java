import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//N바이트

		String byte1 = "int";
		String byte2= "long";
		int su = N/4;
		
		for(int i = 1; i<su; i++) {
			System.out.print(byte2+" ");
		}
		System.out.print(byte2+" "+byte1);
	}
}