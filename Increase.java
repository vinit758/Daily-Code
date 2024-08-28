class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int cnt = 1;
                for (int j = i + 1; j < n; j++) {
                    if (nums[i] == nums[j]) {
                        cnt++;
                        visited[j] = true;
                    }
                }
                freq[i] = cnt;
            }
        }

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                for (int j = 0; j < i; j++) {
                    if (nums[i] == nums[j]) {
                        freq[i] = freq[j];
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (freq[i] > freq[j] || (freq[i] == freq[j] && nums[i] < nums[j])) {
                    int tempFreq = freq[i];
                    freq[i] = freq[j];
                    freq[j] = tempFreq;

                    int tempNum = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tempNum;
                }
            }
        }

        return nums;
    }
}
