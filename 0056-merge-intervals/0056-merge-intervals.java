class Solution {
    public int[][] merge(int[][] intervals) {

        List<List<Integer>> result = new ArrayList<>();
        int length = intervals.length;

        for(int i=0;i<length-1;i++)
        {
            for(int j=0;j<length-1-i;j++)
            {
                if(intervals[j][0] > intervals[j+1][0])
                {
                    int temp1 = intervals[j][0];
                    int temp2 = intervals[j][1];
                    intervals[j][0] = intervals[j+1][0];
                    intervals[j+1][0] = temp1;
                    intervals[j][1] = intervals[j+1][1];
                    intervals[j+1][1] = temp2;
                }
            }
        }

        int index = 1;
        int minInterval = intervals[0][0];
        int maxInterval = intervals[0][1];

        while(index < length)
        {
            int first = intervals[index][0];
            int second = intervals[index][1];
            if(first>=minInterval && first<=maxInterval)
            {
                maxInterval = Math.max(maxInterval,second);
            }
            else
            {
                result.add(new ArrayList<>(Arrays.asList(minInterval,maxInterval)));
                minInterval = intervals[index][0];
                maxInterval = intervals[index][1];
            }

            index++;
        }

        result.add(new ArrayList<>(Arrays.asList(minInterval,maxInterval)));

        int ans[][] = new int[result.size()][2];

        for(int i=0;i<result.size();i++)
        {
            ans[i][0] = result.get(i).get(0);
            ans[i][1] = result.get(i).get(1);
        }

        return ans;
    }
}