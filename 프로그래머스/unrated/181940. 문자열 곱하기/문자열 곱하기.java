class Solution {
    public String solution(String my_string, int k) {
		String answer = "";

		for (int i = 1; i <=k; i++) {
			System.out.print(my_string);
			answer+=my_string;
		}

		return answer;
	}
}
