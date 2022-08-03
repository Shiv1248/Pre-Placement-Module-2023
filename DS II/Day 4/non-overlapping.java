class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
       if (intervals.length == 0) {
          return 0;
        }
        int remove = 0;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int previousEnd = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
          if (intervals[i][0] < previousEnd) {
            remove++;
          } else {
            previousEnd = intervals[i][1];
          }
        }
        return remove;
  }
}