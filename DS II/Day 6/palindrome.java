class Solution {
    public int longestPalindrome(String s) {
      int arr[]= new int[128];
        int count=0;
        for(char ch : s.toCharArray()){
            arr[ch]++;
            
        }
        for(int i=0;i<128;i++){
            if(arr[i]%2==0){
                count+=arr[i];
            }else{
                count+=arr[i]-1;
            }
        }
        if(count<s.length()) return count+1;
        return count;
    }
}