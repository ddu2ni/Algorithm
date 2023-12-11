class Solution {
	 public String solution(String code) {
        
		StringBuilder result = new StringBuilder();
		int mode=0;
		
		for(int i=0;i<code.length();i++) {
			char ch = code.charAt(i);

			if (mode == 0) {
				if (ch != '1' && i % 2 == 0) {
                   		result.append(ch);
               } else if(ch =='1'){
					mode = 1;
				}
               
			}else if (mode == 1) {
				if (ch != '1' && i % 2 == 1) {
					result.append(ch);
				} else if(ch == '1') {
				mode = 0;
			}
			
		}

	 }
	return result.length() == 0 ? "EMPTY" : result.toString();
   }

}