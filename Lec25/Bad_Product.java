package Lec25;

public class Bad_Product {
    public int firstBadVersion(int n) {
        int si = 0;
        int ei = n;
        int ans = 0;
        while(si<=ei){
            int mid = (ei-si)/2+si;
            if(isBadVersion(mid)==true){
                ans = mid;
                ei = mid-1;
            }else{
                si = mid+1;
            }
        }
        return ans;
    }

    private boolean isBadVersion(int mid) {
        return false;
    }
}
