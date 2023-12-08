class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
		   String str1 = ""+a+b;
		   String str2 = ""+b+a;
		   
            int c = Integer.parseInt(str1);
            int d = Integer.parseInt(str2);
        
           if(c>d) {
               answer=c;
           }else if (c==d){
                  answer=c;
           }else {
                  answer=d;
           }
      return answer;
        }
}