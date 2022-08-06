import java.lang.*;
class Solution {
    public String multiply(String num1, String num2) {
       StringBuilder sb = new StringBuilder();

    char[] arr = num1.toCharArray();
    char[] arr2 = num2.toCharArray();
    int[] result = new int[arr.length + arr2.length];
    
    for(int i = arr2.length - 1; i >= 0; i--) {
        
        for(int j = arr.length - 1; j >= 0; j--) {
            
            int pos1 = i + j + 1;
            int pos2 = i + j;
            
            int val = (arr2[i] - '0') * (arr[j] - '0');
            
            if(val >= 10) {
                result[pos1] += val%10;
                result[pos2] += (val/10) + result[pos1]/10;
                result[pos1]%=10;
            }
            
            else {
                result[pos1] += val;
                result[pos2] += result[pos1]/10;
                result[pos1]%=10;
            }
        }
    }
    
    boolean first = true;

    //leading zero check
    for(int i = 0; i < result.length; i++) {
        if(i == result.length - 1 || result[i] != 0) first = false;
        if(first == false) sb.append(result[i]);
    }
    
return sb.toString();
    }
}