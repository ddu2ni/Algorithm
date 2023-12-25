import java.util.ArrayList;

class Solution {
	public ArrayList<Integer> solution(int l, int r) {

		ArrayList<Integer> answer = new ArrayList<>();
		
		for (int i = l; i <= r; i++) {
		
			if (isOnly05(i)) {
				answer.add(i);
			}
		}
		if (answer.isEmpty()) {
			answer.add(-1);
		}
		return answer;
	}

	private boolean isOnly05(int i) {
		String str = Integer.toString(i);
		return str.matches("[05]+");
	}
}