class Solution {
  public int[] solution(int[] num_list) {
        int a = num_list.length;

        if (a < 2) {
            return num_list;
        }

        int answer = (num_list[a - 1] > num_list[a - 2]) ? num_list[a - 1] - num_list[a - 2] : num_list[a - 1] * 2;

        int[] result = new int[a + 1];
        System.arraycopy(num_list, 0, result, 0, a);
        result[a] = answer;

        return result;
    }
}