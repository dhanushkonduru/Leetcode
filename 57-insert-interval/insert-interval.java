class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int i=0, n = intervals.length;
        List<int[]>res = new ArrayList<>();
        
        //Add non overlapping left part in result
        while(i<n && intervals[i][1] < newInterval[0]){
            res.add(intervals[i]);
            i++;
        }

        //Merge all overlapping intervals and store that merged interval in newInterval itself, 
        //for start we take min, for end we take max 
        while(i<n && intervals[i][0] <= newInterval[1]){
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        //Now add that merged interval, i.e., new Interval in res
        res.add(newInterval);

        //Add the remaining non overlapping right part in res
        while(i<n){
            res.add(intervals[i]);
            i++;
        }

        return res.toArray(new int[0][]);
    }
}