class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int [] memos = new int [days.length];
        Arrays.fill(memos, -1);

        return solve(days, costs, 0, memos);
    }

    private int solve (int [] days, int [] costs, int i, int [] memos){
        if (i >= days.length) return 0;

        if (memos[i] != -1){
            return memos[i];
        }

        // Option 1: Buy 1-day pass
        int next1 = i;
        while (next1 < days.length && days[next1] < days[i]+1){
            next1++;
        }
        int cost1 = costs[0] + solve (days, costs, next1, memos);

        // Option 2: Buy 7-day pass
        int next7 = i;
        while (next7 < days.length && days[next7] < days[i]+7){
            next7++;
        }
        int cost7 = costs[1] + solve (days, costs, next7, memos);

        // Option 3: Buy 30-day pass
        int next30 = i;
        while (next30 < days.length && days[next30] < days[i]+30){
            next30++;
        }
        int cost30 = costs[2] + solve (days, costs, next30, memos);

        memos[i] = Math.min(cost1, Math.min(cost7, cost30));

        return memos[i];

    }
}