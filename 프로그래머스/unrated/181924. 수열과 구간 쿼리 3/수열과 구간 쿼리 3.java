import java.util.List;

class Solution {
	public int[] solution(int[] arr, int[][] queries) {

		int temp;

		// queries 배열예시
		// [0,3] -> [0][0] [0][1]
		// [1,2] -> [1][0] [1][1]
		// [1,4] -> [2][0] [2][1]
		for (int i = 0; i < queries.length; i++) {
			int num1 = queries[i][0];
			int num2 = queries[i][1];

			temp = arr[num1];
			arr[num1] = arr[num2];
			arr[num2] = temp;
		}
		return arr;
	}
}
