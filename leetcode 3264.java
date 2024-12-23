class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        int n = nums.length;
        int min = 0;
        int multi = 0;

        for (int i = 1; i <= k; i++) {

            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[min]) {
                    min = j;

                }

            }
            nums[min] *= multiplier;
            System.out.println(nums[min]);

        }
        return nums;
    }
}