class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<>();
    if(nums2.length<nums1.length){
       for(int i=0;i<nums2.length;i++){
           int val=nums2[i];
           for(int j=0;j<nums1.length;j++){
               if(val==nums1[j])
               {
                   list.add(val);
                   nums1[j]=Integer.MIN_VALUE;
                   break;
               }
           }
       } 
    }
    
    else{
       
       for(int i=0;i<nums1.length;i++){
           int val=nums1[i];
           for(int j=0;j<nums2.length;j++){
               if(val==nums2[j])
               {
                   list.add(val);
                   nums2[j]=Integer.MIN_VALUE;
                   break;
               }
           }
        
        }
    }
    int [] ans=new int [list.size()];
    for(int i=0;i<list.size();i++){
        ans[i]=list.get(i);
    }
   
    
    return ans;
    
}
}
