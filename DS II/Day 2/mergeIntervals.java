class Solution {
    public int[][] merge(int[][] intervals) {
         Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        
        ArrayList<int[]> res = new ArrayList<>();
        int[] pick = intervals[0];
        for(var inter: intervals){
            if(pick[1]>= inter[0])
                pick[1] = (pick[1] > inter[1]) ? pick[1] : inter[1];
            else{
                res.add(pick);
                pick = inter;}
        }
        res.add(pick);
        return res.toArray(new int[res.size()][]);
    }
}