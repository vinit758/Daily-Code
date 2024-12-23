class Solution {
    public long pickGifts(int[] gifts, int k) {

        int n = gifts.length;
        long total = 0;

        for (int i = 1; i <= k; i++) {
            int index = 0;
            for (int j = 0; j < n; j++) {

                if (gifts[j] > gifts[index]) {
                    index = j;
                }

            }
            gifts[index] = (int) Math.sqrt(gifts[index]);
            System.out.println(gifts[index]);

        }
        for (int j = 0; j < n; j++) {
            total += gifts[j];
        }

        return total;
    }
}