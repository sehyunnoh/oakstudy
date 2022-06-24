class Solution {
    //recursive
    public boolean isPalindrome(int x) { 
        String str = "" + x;
        char[] arr = str.toCharArray();
        if (str.length() == 1) return true;
        if (arr.length % 2 == 1) { // odd
            return isPalindromHelper(arr, arr.length/2-1, arr.length/2+1);       
        } else {//even
            return isPalindromHelper(arr, arr.length/2-1, arr.length/2);
        }        
    }
    public boolean isPalindromHelper(char[] arr, int a, int b) {
        if (arr[a] != arr[b]) return false;
        else {
            if (a == 0) return true;
            else 
                return isPalindromHelper(arr, a-1, b+1);
        }
    }
    // StringBuilder reverse 
    public boolean isPalindrome2(int x) {
        String str = "" + x;
        StringBuilder reverseStr = new StringBuilder();
        reverseStr.append(str);
        reverseStr.reverse();
        if (str.equals(reverseStr.toString())) return true;
        else return false;
    }
}
