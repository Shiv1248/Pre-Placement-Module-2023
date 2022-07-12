class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        int p=0,x=0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if((nums[i]+nums[j])==target)
                {
                     p=i;
                     x=j;
                    break;
                }
            }
        }
        a[0]=p;
        a[1]=x;
        return(a);
    }
    public static void main(String arg[])throws Exception
    {
        int t,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int b[]=new int[n];
        t=sc.nextInt();
        Solution obj=new Solution();
        obj.twoSum(b,t);
    }
}