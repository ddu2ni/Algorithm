import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println(10000 + a * 1000);
        } else if (a == b || b == c || c == a) {
            System.out.println(1000 + (a == b ? a : (c == a ? c : b)) * 100);
        } else {
            int data[] = {a, b, c};
            Arrays.sort(data);
           
            int max = data[2];
            
            System.out.println(max * 100);
        }
    }
}