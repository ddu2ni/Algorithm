import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	int N = 0;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] num = new int[N];
        
        for(int i=0; i<N; i++) {
        	num[i] = sc.nextInt();
        }
      
        int V = sc.nextInt();
   
        int count = count(num,V);
        
        System.out.println(count);
        
    }
    
    public static int count(int[] array, int number) {
    	int count = 0;
    	for(int su : array) {
    		if(su == number) {
    			count++;
    		}
    	}
    	return count;
    }
    
}