class Solution {
    public int solution(int[] num_list) {
        int answer1 = 1;
        int answer2 = 0;
        int sum = 0;
        int answer;

    	   for(int i=0;i<num_list.length;i++){
               answer1 *= num_list[i];
           }
    	   
 
    	   for(int j=0;j<num_list.length;j++) {
    		   sum +=num_list[j];
    		  answer2 = (int)(Math.pow(sum,2));
    	   }
    	   

        return answer1<answer2 ? 1:0;
    }
}

