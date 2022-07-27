class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
      int indexFirst = 0;
        int indexSecond = 0;
        List<int[]> resultList = new ArrayList<>();
        if(firstList.length > 0 && secondList.length > 0)
        {
            while(indexFirst < firstList.length || indexSecond < secondList.length)
            {
                int[] pointFirst = firstList[indexFirst];
                int[] pointSecond = secondList[indexSecond];
                int maxLeft = Math.max(pointFirst[0], pointSecond[0]);
                int minRight = Math.min(pointFirst[1], pointSecond[1]);
                if(maxLeft <= minRight)
                {
                    int[] point = new int[]{maxLeft, minRight};
                    resultList.add(point);
                    if(minRight == pointFirst[1])
                        indexFirst++;
                    if(minRight == pointSecond[1])
                        indexSecond++;
                }
                else
                {
                    if(pointFirst[0]< pointSecond[0])
                        indexFirst++;
                    else
                        indexSecond++;
                }
                if(indexFirst >= firstList.length || indexSecond >= secondList.length )
                    break;
            }
        }
        int[][] arr = new int[resultList.size()][2];
        arr = resultList.toArray(arr);
        return arr;
    }
}