import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();

		//전체를 분으로 변환
		int tot = H*60+M;
		int alarm = tot - 45;
		
		if(alarm<0) {
			alarm += 24*60;//+1일(24시간)이 되려면 1일 = 60 *24시간
		}
		
		int h = alarm / 60; //시
		int m = alarm % 60; //분 - 나머지
		
		System.out.println(h+" "+m);
		
	}
}