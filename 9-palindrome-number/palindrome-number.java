class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int original = x;
        long rev = 0; 
        for (int n = x; n != 0; n /= 10) {
            int digit = n%10;
            rev = rev * 10 + digit;
        }
        return rev == original;
    }
}
