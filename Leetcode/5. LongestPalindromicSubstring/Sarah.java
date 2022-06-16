class Solution {
    public String longestPalindrome(String s) {
       int maxLength = 0, start = 0;
        int low, high;
        int n = s.length();
        if (n <= 1) return s;
        
        for (int i=0; i<n; i++) {
        	low = i-1;
        	high = i+1;
        	
        	while (low>=0 && s.charAt(i) == s.charAt(low)) low--;   
        	while (high<n && s.charAt(i) == s.charAt(high)) high++;
        	while (low>=0 && high<n && s.charAt(low)==s.charAt(high)) {
        		low--;
        		high++;
        	}
        	if (maxLength < high-low-1) {
        		maxLength = high-low-1;
        		start = low + 1;
        	}
        }
        
        return s.substring(start, start+maxLength);
    }
}
