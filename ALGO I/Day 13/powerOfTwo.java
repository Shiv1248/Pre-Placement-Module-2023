class Solution {
    public boolean isPowerOfTwo(int n) {
       if(n==0)
            return false;
	
        while(n!=1){
            if(n%2!=0)
                break;
		// performing bitwise right shift by one (one rigth shift divides number by 2)
            n=n>>1;
            
        }
        if(n==1)
            return true;
        else
            return false;
    }
}