class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String ab = String.valueOf(a)+String.valueOf(b);

        int num1 = Integer.parseInt(ab);
        int num2 = 2*a*b;
        
        if(num1 > num2){
              answer = num1;
        }else if(num1 == num2){
            answer = num1;
        }else{
            answer = num2;            
        }
        return answer;
    }
}