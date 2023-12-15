class Solution {
    public int solution(int[] num_list) {
  
        StringBuilder result1 = new StringBuilder();
        StringBuilder result2 = new StringBuilder();
        
        for(int num : num_list) {
        	if(num%2==0) {
        		result1.append(num);
        	}else {
        		result2.append(num);
        	}
        }
        
        int sum1 = Integer.parseInt(result1.toString());
        int sum2 = Integer.parseInt(result2.toString());
        
        return sum1 + sum2;
    
		}
	}
