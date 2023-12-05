class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        for(int i=0;i<str1.length();i++){
           answer += str1.charAt(i)+""+str2.charAt(i);
         // 문자와 +(문자: 연산자)가 합쳐지면 ASCII Code값으로 인식해서 숫자를 출력
        //앞에다 ""를 넣어서 실행하면 "" + charAt() => 문자열 + str2.charAt() => 문자열
        }
        
            return answer;
    }

}
