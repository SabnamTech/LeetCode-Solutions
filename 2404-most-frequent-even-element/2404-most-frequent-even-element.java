
class Solution {
    public int mostFrequentEven(int[] nums) {
        int answer = -1;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int count = 0;

                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }

                if (count > max) {
                    max = count;
                    answer = nums[i];
                }

                if (count == max && nums[i] < answer) {
                    answer = nums[i];
                }
            }
        }

        return answer;
    }
}
