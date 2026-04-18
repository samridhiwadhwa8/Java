static int countWays(int curr, int target) {

        if (curr == target) return 1;
        if (curr > target) return 0;

        int count = 0;

        for (int i = 1; i <= 6; i++) {
            count += countWays(curr + i, target);
        }

        return count;
