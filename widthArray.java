class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (i < j && nums[i] <= nums[j]) {
                    ans = Math.max(ans, j - i);
                    break;
                }
            }
        }
        return ans;
    }
}