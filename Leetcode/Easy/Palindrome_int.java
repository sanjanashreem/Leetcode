class Solution {
    public boolean isPalindrome(int x) {
        int ld= 0, val=0;
        int copy = x;
        if(copy < 0){
            return false;
        }

        
        while(x != 0){
            ld = x % 10;
            x = x/10;
            val = val * 10+ld;
            }
        
        if(val == copy){
            return true;
        }
    return false;
    }
}