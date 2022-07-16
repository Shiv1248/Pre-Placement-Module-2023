class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a[]=new int[2];
        int l=0;
		int r=numbers.length-1;
        while(l<r){
            int sum=0;
            sum=numbers[l]+numbers[r];
            if(sum>target){
                r--;
            }
            else if(sum==target){
                a[0]=++l;
                a[1]=++r;
                return a;
            }
            else{
                l++;
            }
        }
        return a;
    }
}