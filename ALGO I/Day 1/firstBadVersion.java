/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int l,m,h;
            l=1;
            h=n;
            int x=0;
            while(l<=h)
            {
                m=l+(h-l)/2;
                if(isBadVersion(m)==true)
                {
                    x=m;
                    h=m-1;
                }
                else
                    l=m+1;
            }
            return x;
        }
    }