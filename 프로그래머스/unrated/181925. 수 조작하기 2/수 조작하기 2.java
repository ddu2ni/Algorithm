class Solution {
	public String solution(int[] numLog) {
		int num=0;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i < numLog.length; i++) {
			num = numLog[i] - numLog[i-1] ;

			switch (num) {
			case  1:
				sb.append("w");
				break;

			case -1:
				sb.append("s");
				break;

			case 10:
				sb.append("d");
				break;

			case -10:
				sb.append("a");
				break;

			default:
				break;
			}
		}
		return sb.toString();
	}
}